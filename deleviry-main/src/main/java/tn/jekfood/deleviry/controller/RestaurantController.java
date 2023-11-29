package tn.jekfood.deleviry.controller;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping; 
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.jekfood.deleviry.model.Restaurant;
import tn.jekfood.deleviry.service.RestaurantService;
//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class RestaurantController {
	//autowire the ArticleService class  
		@Autowired  
		RestaurantService as; 
		//creating a get mapping that retrieves all the Article detail from the database   
				@GetMapping("/restaurant")
				private List<Restaurant> getAllRestaurants()   
				{  
					return as.getAllRestaurants();  
				}  

				//creating a get mapping that retrieves the detail of a specific article  
				@GetMapping("/restaurant/{id}")  
				private Restaurant getRestaurant(@PathVariable("id") int id)   
				{  
					return as.getRestaurantsById(id);  
				}  

				//creating a delete mapping that deletes a specified article  
				@DeleteMapping("/restaurant/{id}")  
				private void deleteRestaurant(@PathVariable("id") int id)   
				{  
					as.delete(id);  
				} 

				//create new article
				@PostMapping("/restaurant")  
				private int saveRestaurant(@RequestBody Restaurant a)   
				{  
					as.saveOrUpdate(a);  
					return a.getId();  
				} 

				//creating put mapping that updates the article detail
				@PutMapping("/restaurant")  
				private Restaurant update(@RequestBody  Restaurant a)   
				{  
					as.saveOrUpdate(a);  
					return a;  
				}  
}



	

