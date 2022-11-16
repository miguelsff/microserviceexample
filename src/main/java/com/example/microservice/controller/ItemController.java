package com.example.microservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.service.ItemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ItemController {
	
	private final ItemService itemService;

	@GetMapping(value = "/titles", produces = "application/json; charset=utf-8")
	public List<String> getTitles(@RequestParam("rating") Double rating) {
		return itemService.getTitles(rating);
	}
	
}
