package vn.com.fsoft.TGDD.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ImageUploadController {

	@RequestMapping(value = "getimage/{imagelink}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<ByteArrayResource> getimage(@PathVariable("imagelink") String photo){
		if(!photo.equals("") || photo != null) {
			try {
				Path fileName = Paths.get("static/image/", photo);
				byte[] buffer = Files.readAllBytes(fileName);
				ByteArrayResource byteArrayResourse = new ByteArrayResource(buffer);
				return ResponseEntity.ok()
						.contentLength(buffer.length)
						.contentType(MediaType.parseMediaType("image/png"))
						.body(byteArrayResourse);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return ResponseEntity.badRequest().build();
	}
}
