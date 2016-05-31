package sample.download.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sample.download.service.CsvDownloadService;
import sample.download.service.PdfDownloadService;

/**
 * @author mamoru
 *
 */
@Controller
public class DownloadController {

	@Autowired
	PdfDownloadService pdfService;

	@Autowired
	CsvDownloadService csvService;

	@RequestMapping(value = { "/", "/index" }, method = { RequestMethod.GET })
	public String showPage() {
		return "index";
	}

	@RequestMapping(value = { "/csv" }, method = { RequestMethod.POST })
	public ResponseEntity<byte[]> csvDownload() throws Exception {
		return csvService.execute();
	}

	@RequestMapping(value = { "/pdf" }, method = { RequestMethod.POST })
	public ResponseEntity<byte[]> pdfDownload() throws Exception {
		return pdfService.execute();
	}
}
