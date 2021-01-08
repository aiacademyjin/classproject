package com.aia.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileUploadController {
	
	@RequestMapping("/upload/uploadForm")
	public String uploadForm() {
		return "upload/uploadForm";
	}

}
