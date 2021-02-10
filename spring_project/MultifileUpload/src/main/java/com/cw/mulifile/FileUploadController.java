package com.cw.mulifile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/upload")
public class FileUploadController {

	@GetMapping
	public String getForm() {
		return "form";
	}
	
	@PostMapping
	public String upload(
			MultipartFile[] files
			) {
		
		for (MultipartFile multipartFile : files) {
			System.out.println(multipartFile.getOriginalFilename());
		}
		
		return "upload";
	}
	
}
