package com.aia.firstspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/ver1/members")
public class RestApiController {

	@GetMapping("/{idx}") // GET  /rest/ver1/members/39
	//@GetMapping
	public String getRest(
			@PathVariable("idx") int idx
			) {
		return "@Restcontroller를 사용한 응답 처리 : " + idx;
	}
}
