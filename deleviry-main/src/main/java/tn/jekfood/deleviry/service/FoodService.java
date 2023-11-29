package tn.jekfood.deleviry.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
import tn.jekfood.deleviry.model.Food;
import tn.jekfood.deleviry.repository.FoodRepository;

@Service 
public class FoodService {
	@Autowired  
	FoodRepository FR;
	@Autowired  
	RestaurantService RS;

	//defining the business logic


	//getting all articles record by using the method findaAll() of CrudRepository  
	public List<Food> getAllFoods()   
	{  
		List<Food> Foods = new ArrayList<Food>();  
		FR.findAll().forEach(f -> Foods.add(f));  
		return Foods;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Food getFoodsById(int id)   
	{  
		return FR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Food f)   
	{  
		FR.save(f);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		FR.deleteById(id);  
	} 
	
	
	public List<Food> getAllFoodsByIdRestaurant(int id )   
	{  
		List<Food> Foods = new ArrayList<Food>();  
		FR.findAllByRestaurant(RS.getRestaurantsById(id)).forEach(f -> Foods.add(f)); 
		return Foods;  	
	}  

	
	
}





