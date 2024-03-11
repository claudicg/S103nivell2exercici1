package n2exercici1.main;

import java.util.HashSet;
import java.util.Set;

import n2exercici1.beans.Restaurant;

public class RestaurantMain{
	
	static Set<Restaurant> restaurantesSet = new HashSet<>();

	public static void main(String[] args) {
		
		
		Restaurant restaurant1 = new Restaurant("La salita", 10);
		System.out.println(restaurant1.guardarRestaurant(restaurantesSet));
		imprimirSet();
		System.out.println();
		
		Restaurant restaurant2 = new Restaurant("Gresca", 9);
		System.out.println(restaurant2.guardarRestaurant(restaurantesSet));
		imprimirSet();
		System.out.println();
		
		Restaurant restaurant3 = new Restaurant("Per Feina", 9);
		System.out.println(restaurant3.guardarRestaurant(restaurantesSet));
		imprimirSet();
		System.out.println();
		
		Restaurant restaurant4 = new Restaurant("La salita", 9);
		System.out.println(restaurant4.guardarRestaurant(restaurantesSet));
		imprimirSet();
		System.out.println();
		
		Restaurant restaurant5 = new Restaurant("Gresca", 9);
		System.out.println(restaurant5.guardarRestaurant(restaurantesSet));
		imprimirSet();	
		
	}
	
	private static void imprimirSet() {
		
		restaurantesSet.forEach(System.out :: println);		
	}	
}
