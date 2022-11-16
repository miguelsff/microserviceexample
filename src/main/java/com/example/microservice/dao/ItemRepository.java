package com.example.microservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.microservice.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

	@Query("SELECT i FROM Item i LEFT JOIN Review r ON i.id = r.itemId GROUP BY i.id, i.title HAVING COALESCE(AVG(r.rating),0)>?1 ORDER BY i.title")
	List<Item> findItemsWithAverageRatingLowerThan(Double rating);
	
}
