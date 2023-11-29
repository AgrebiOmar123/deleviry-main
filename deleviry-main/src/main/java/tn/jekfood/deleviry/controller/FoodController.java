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

import tn.jekfood.deleviry.model.Food;
import tn.jekfood.deleviry.service.FoodService;
//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class FoodController {
	//autowire the ArticleService class  
			@Autowired  
			FoodService Fs; 

		//creating a get mapping that retrieves all the Article detail from the database   
				@GetMapping("/food")
				private List<Food> getAllFoods()   
				{  
					return Fs.getAllFoods();  
				}  

				//creating a get mapping that retrieves the detail of a specific article  
				@GetMapping("/food/{id}")  
				private Food getFood(@PathVariable("id") int id)   
				{  
					return Fs.getFoodsById(id);  
				}  

				//creating a delete mapping that deletes a specified article  
				@DeleteMapping("/food/{id}")  
				private void deleteFood(@PathVariable("id") int id)   
				{  
					Fs.delete(id);  
				} 

				//create new article
				@PostMapping("/food")  
				private int saveFood(@RequestBody Food f)   
				{  
					Fs.saveOrUpdate(f);  
					return f.getId();  
				} 

				//creating put mapping that updates the article detail
				@PutMapping("/food")  
				private Food update(@RequestBody  Food f)   
				{  
					Fs.saveOrUpdate(f);  
					return f;  
				}  
				@GetMapping("/foodbyrestaurant/{id}")  
				private List<Food> getFoodByRestaurant(@PathVariable("id") int idrestaurant)   
				{  
					return Fs.getAllFoodsByIdRestaurant(idrestaurant);  
				}  

}



	

