package tn.jekfood.deleviry.repository;

import org.springframework.data.repository.CrudRepository;
import tn.jekfood.deleviry.model.Restaurant;
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {

	
}
