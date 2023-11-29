package tn.jekfood.deleviry.model;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;  
 
@Entity  

@Table 

public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column  
	private String name; 
	@Column  
	private String cookTime;
	@Column  
	private boolean favorite; 
	@Column  
	private int stars;
	@Column  
	private String imageUrl;
	@ManyToOne(optional=false) //champ obligatoire
	@JoinColumn(name="idrestaurant", referencedColumnName="id")
	private Restaurant restaurant;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCookTime() {
		return cookTime;
	}
	public void setCookTime(String cookTime) {
		this.cookTime = cookTime;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", cookTime=" + cookTime + ", favorite=" + favorite + ", stars="
				+ stars + ", imageUrl=" + imageUrl + ", restaurant=" + restaurant + "]";
	}
	
	
}
	
	

