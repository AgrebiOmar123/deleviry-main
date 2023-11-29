package tn.jekfood.deleviry.repository;
import org.springframework.data.repository.CrudRepository;
import tn.jekfood.deleviry.model.Food;
import tn.jekfood.deleviry.model.Restaurant;
public interface FoodRepository extends CrudRepository<Food, Integer>  {
	
	Iterable <Food> findAllByRestaurant(Restaurant r);
}







