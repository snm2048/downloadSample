/**
 *
 */
package sample.download.service;

import java.io.ByteArrayOutputStream;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

/**
 * @author mamoru
 *
 */
@Service
public class PdfDownloadService implements DownloadService {

	/**
	 * @see sample.download.service.DownloadService#execute()
	 */
	@Override
	public ResponseEntity<byte[]> execute() throws Exception {
		byte[] bytes = createDocument();
		if (bytes == null) {
			return null;
		}

		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/pdf; charset=MS932");
		header.setContentDispositionFormData("filename", "sample.pdf");
		return new ResponseEntity<>(bytes, header, HttpStatus.OK);
	}

	private byte[] createDocument() throws Exception {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		Document document = new Document(PageSize.A4);

		try {
			PdfWriter.getInstance(document, os);

			document.addSubject("Browser Download Sample");
			document.open();
			document.add(new Paragraph("MDM Browser Download Test Sample."));
			document.close();
		} catch (DocumentException e) {
			e.printStackTrace();
			return null;
		}

		return os.toByteArray();
	}

}
