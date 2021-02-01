package com.aia.openapi;

import java.net.URI;
import java.net.URISyntaxException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.aia.openapi.domain.ApiData;

@RestController
@RequestMapping("/")
public class OpenApiConteroller {

	@CrossOrigin
	@GetMapping
	public ApiData getApiData(HttpServletResponse response) throws URISyntaxException {
		
		// REST API 통신을 위한 클래스 : SPRING 4버전 부터 제공
		RestTemplate template = new RestTemplate();

		String url = "http://apis.data.go.kr/1360000/VilageFcstInfoService/getVilageFcst"
				+ "?serviceKey=7SfUZOq52SpD4qLwR2jTusLrmCPg3R4Io3gDfvTUjTkMyDrR6sD9O3sCmy%2BesjmLaG8fYt3vstEIpHB8c4iX0Q%3D%3D"
				+ "&pageNo=1" 
				+ "&numOfRows=10" 
				+ "&dataType=json" 
				+ "&base_date=20210201" 
				+ "&base_time=0500" 
				+ "&nx=1"
				+ "&ny=1";


		//URI 코드 % -> 25 encoding 방지.
		URI uri = new URI(url); 

		ApiData apiData = template.getForObject(uri, ApiData.class);

		System.out.println(apiData);

		return apiData;
	}
	
	@CrossOrigin
	@GetMapping("api")   //   /api
	public String getApiData2(HttpServletResponse response) throws URISyntaxException {
		
		// REST API 통신을 위한 클래스 : SPRING 4버전 부터 제공
		RestTemplate template = new RestTemplate();

		String url = "http://apis.data.go.kr/1360000/VilageFcstInfoService/getVilageFcst"
				+ "?serviceKey=7SfUZOq52SpD4qLwR2jTusLrmCPg3R4Io3gDfvTUjTkMyDrR6sD9O3sCmy%2BesjmLaG8fYt3vstEIpHB8c4iX0Q%3D%3D"
				+ "&pageNo=1" 
				+ "&numOfRows=10" 
				+ "&dataType=json" 
				+ "&base_date=20210201" 
				+ "&base_time=0500" 
				+ "&nx=1"
				+ "&ny=1";


		//URI 코드 % -> 25 encoding 방지.
		URI uri = new URI(url); 

		String apiData = template.getForObject (uri, String.class);
		
		System.out.println(apiData);

		response.setContentType("application/JSON; charset=UTF-8");
		

		return apiData;
	}

}
