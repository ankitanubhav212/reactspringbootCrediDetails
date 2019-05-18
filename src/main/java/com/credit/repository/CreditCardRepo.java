package com.credit.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.credit.model.CreditCard;

public interface CreditCardRepo extends JpaRepository<CreditCard, Long> {

	@Query("select c from CreditCard c where c.name like %?1%")
	Page<CreditCard> findByName(String name,PageRequest pr);
}
