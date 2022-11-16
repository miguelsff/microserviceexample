package com.example.microservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.microservice.dao.ItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemService {
	
	private final ItemRepository itemRepository;

	public List<String> getTitles(Double rating){
		return itemRepository.findItemsWithAverageRatingLowerThan(rating).stream().map(x->x.getTitle()).collect(Collectors.toList());
	}
	
}
