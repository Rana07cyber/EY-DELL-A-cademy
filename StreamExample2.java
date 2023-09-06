package com.programming.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> shoppingList =  new ArrayList<>();

		shoppingList.add("coffee");
		shoppingList.add("bread");
		shoppingList.add("banana");
		shoppingList.add("pasta");
		shoppingList.add("pineapple");
		Stream<String> shoppingListStream = shoppingList.stream();
		shoppingListStream.sorted().map(item->item.toUpperCase()).
		filter(item->item.startsWith("P")).
		forEach(item-> System.out.println(item));
		
		//shoppingList.stream.forEach(item->system.out.println(item));
		}

}
