package com.credit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.credit.model.CreditCard;
import com.credit.repository.CreditCardRepo;

@Service
public class CreditCardService {
	
	@Autowired
	CreditCardRepo repo;
	
	public Page<CreditCard> getCreditCards(String filter,int page) {
		Page<CreditCard> pageCredit = null;
		PageRequest pg = PageRequest.of(page,10);
		
		if(filter.equals("")) {
			pageCredit = repo.findAll(pg);
		} else {
			pageCredit = repo.findByName(filter, pg);
		}
		
		 return pageCredit;
	}
	
	public CreditCard getCreditCardDetail(Long id) {
		return repo.findById(id).get();
	}

}
