package sample.download.service;

import org.springframework.http.ResponseEntity;

/**
 * @author mamoru
 *
 */
public interface DownloadService {
	ResponseEntity<byte[]> execute() throws Exception;
}
