package com.market.ordermanagement.product.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.market.ordermanagement.product.entity.SubscribedProd;

	public interface SubscribedProdRepository extends JpaRepository<SubscribedProd, String>{
		List<SubscribedProd> findByBuyerid(String buyerid);
	}

