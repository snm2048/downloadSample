package sample.download.service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author mamoru
 *
 */
@Service
public class CsvDownloadService implements DownloadService {

	/**
	 * @see sample.download.service.DownloadService#execute()
	 */
	@Override
	public ResponseEntity<byte[]> execute() throws Exception {
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "text/csv; charset=MS932");
		header.setContentDispositionFormData("filename", "sample.csv");
		return new ResponseEntity<>("1,2,3,4,5".getBytes("MS932"), header, HttpStatus.OK);
	}

}
