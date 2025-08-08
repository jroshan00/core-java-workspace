package implemetingCollectionFramework.shirt_shop_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {
	private List<Shirt> shirts=new ArrayList<>();
	
	public boolean addShirt(Shirt shirt) {
		return shirts.add(shirt);
	}
	/*
	 * 
	 */
	public List<Shirt> getAllShirts(){
		return shirts;
	}
	/*
	 * 
	 */
	
	public void printAllShirts() {
		for(Shirt shirt: shirts) {
			System.out.println(shirt);
		}
	}
	
	public void sortOnShirtPriceHighToLow() {
		Collections.sort(shirts,Comparator.comparingDouble((Shirt shirt)->shirt.price).reversed());
		printAllShirts();
	}
	
	public void sortOnShirtPriceLowToHigh() {
		Collections.sort(shirts,Comparator.comparingDouble((Shirt shirt)->shirt.price));
		printAllShirts();
	}
	
	public List<String> getlistAllTheBrands(){
		List<String> brands=new ArrayList<>();
		for(Shirt shirt:shirts) {
			brands.add(shirt.brand);
		}
		return brands.stream().distinct().toList();
	}
	public List<String> getlistAllTheSizes(){
		List<String> sizes=new ArrayList<>();
		for(Shirt shirt:shirts) {
			sizes.add(shirt.sizeType.toString());
		}
		return sizes;
	}
	public List<String> getlistAllTheColors(){
		List<String> colors=new ArrayList<>();
		for(Shirt shirt:shirts) {
			colors.add(shirt.color);
		}
		return colors.stream().distinct().toList();
	}
	
	public Map<String,Integer> getNoOfShirtsOnEachBrand(){
		Map<String,Integer> map=new HashMap<>();
		for(Shirt shirt:shirts) {
			int val=map.getOrDefault(shirt.brand,0);
			map.put(shirt.brand,val+1);
		}
		return map;
	}
}
