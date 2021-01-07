package com.aia.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aia.firstspring.domain.OrderCommand;

@Controller
@RequestMapping("/order/order")
public class OrderController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getOrderForm() {
		return "order/orderForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String orderComplete(@ModelAttribute("userOrder") OrderCommand order) {
		System.out.println(order);
		return "order/orderComplete";
	}

}
