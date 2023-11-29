package tn.jekfood.deleviry.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
import tn.jekfood.deleviry.model.Restaurant;
import tn.jekfood.deleviry.repository.RestaurantRepository;
@Service 
public class RestaurantService {
	//defining the business logic  

@Autowired  
RestaurantRepository aR; 

//getting all articles record by using the method findaAll() of CrudRepository  
public List<Restaurant> getAllRestaurants()   
{  
	List<Restaurant> Restaurants = new ArrayList<Restaurant>();  
	aR.findAll().forEach(r -> Restaurants.add(r));  
	return Restaurants;  	
}  

//getting a specific record by using the method findById() of CrudRepository  
public Restaurant getRestaurantsById(int id)   
{  
	return aR.findById(id).get();  
}  


//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Restaurant r)   
{  
	aR.save(r);  
} 

//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
	aR.deleteById(id);  
} 
}






	 


