package com.vicheak.bank.card.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vicheak.bank.card.entity.Card;

public interface CardRepository extends MongoRepository<Card, Long>{

	
	
}
