package com.credit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.credit.model.CreditCard;
import com.credit.service.CreditCardService;

@RestController
public class CreditController {

	@Autowired
	CreditCardService service;
	
	@RequestMapping("/credit")
	Page<CreditCard> getCreditDetails(@RequestParam(name ="name",defaultValue = "") String name,@RequestParam(name="page", defaultValue="1") int page) {
		return service.getCreditCards(name, page);
	}
	
	@RequestMapping("/credit/{id}")
	CreditCard getDetails(@PathVariable("id") Long id) {
		return service.getCreditCardDetail(id);
	}
}
