package com.aia.firstspring.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.aia.firstspring.domain.ReportUploadRequest;

@Controller
public class FileUploadController {
	
	final String URI = "/uploadfile";	
	
	@RequestMapping("/upload/uploadForm")
	public String uploadForm() {
		return "upload/uploadForm";
	}
	
	@RequestMapping("/upload/upload1")
	public String upload1(
			@RequestParam("sn") String sn,
			@RequestParam("report") MultipartFile report,
			Model model,
			HttpServletRequest request
			) throws IllegalStateException, IOException {
		
		System.out.println(report.getOriginalFilename());
		
		model.addAttribute("sno", sn);
		model.addAttribute("reportFile", report.getOriginalFilename());
		
		// 파일의 저장
		report.transferTo(getFile(request, URI, report.getOriginalFilename()));
		
		return "upload/uploadComplete";
	}
	
	@RequestMapping("/upload/upload2")
	public String upload2(
			MultipartHttpServletRequest request,
			Model model
			) throws IllegalStateException, IOException {
		
		String sn = request.getParameter("sn");
		MultipartFile report = request.getFile("report");
		
		System.out.println(report.getOriginalFilename());
		
		// 파일 업로드
		report.transferTo(getFile(request, URI, report.getOriginalFilename()));
		
		
		
		model.addAttribute("sno", sn);
		model.addAttribute("reportFile", report.getOriginalFilename());
		
		return "upload/uploadComplete";
	}
	

	
	@RequestMapping("/upload/upload3")
	public String upload3(
			ReportUploadRequest uploadRequest,
			Model model,
			HttpServletRequest request
			) throws IllegalStateException, IOException {
		
		System.out.println(uploadRequest.getReport().getOriginalFilename());
		
		model.addAttribute("sno", uploadRequest.getSn());
		model.addAttribute("reportFile", uploadRequest.getReport().getOriginalFilename());
		
		uploadRequest.getReport().transferTo(getFile(request, URI, uploadRequest.getReport().getOriginalFilename()));
		
		
		return "upload/uploadComplete";
	}
	
	// File 생성해서 반환
	private File getFile(
			HttpServletRequest request, 
			String uri,
			String fileName) {
		
//		String rpath = request.getSession().getServletContext().getRealPath(uri);
//		File newFile = new File(rpath, fileName);
//		return newFile ;
		
		return new File(request.getSession().getServletContext().getRealPath(uri), fileName);
	}
	
	
	
	
	

}
