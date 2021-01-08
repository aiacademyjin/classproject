package com.aia.firstspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aia.firstspring.domain.SearchType;

@Controller
public class SearchController {
	
	@RequestMapping("/search/search")
	public String search() {
		return "search/search";
	}
	
	@ModelAttribute("searchTypeList")
	public List<SearchType> getSearchType(){
		List<SearchType> options = new ArrayList<SearchType>();
		options.add(new SearchType(1, "팀이름+선수이름"));
		options.add(new SearchType(2, "팀이름"));
		options.add(new SearchType(3, "선수이름"));
		return options;
	}
	
	@ModelAttribute("queryList")
	public String[] getqueryList() {
		return new String[] {"손흥민", "메시", "호날두"};
	}

}






