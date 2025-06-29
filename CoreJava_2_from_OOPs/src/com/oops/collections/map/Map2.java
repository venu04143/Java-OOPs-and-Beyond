package com.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("Apple", 100);                 // map.put() return value is Value
		map.put("Orange", 120);
		map.put("Banana", 70);
		map.put("Mango", 90);
		
		System.out.println(map);
		
		Set<Map.Entry<String,Integer>> en =map.entrySet();   // Returns a Set view of the mappings contained in this map.
		
		for(Map.Entry<String, Integer> set : en) {
			System.out.print(set.getKey() +" : "+set.getValue());
			System.out.println();
		}
		
		System.out.println(map.put("Sapota", 40));  // return previous value   (i.e null)
		System.out.println(map.put("Sapota", 50));  // here 'Sapota' key previous value is 40
		
		
		System.out.println(map.containsKey("Orange"));  // Returns true if this map contains a mapping for the specified key.
		
		System.out.println(map.containsValue(50)); //   Returns true if this map maps one or more keys to the specified value.
		
	    System.out.println(map.keySet());   // Returns a Set view of the keys contained in this map.
	   
	   map.replace("Orange", 110);
	   
	   System.out.println(map.entrySet());
	   
	   Set<Map.Entry<String, Integer>>entry=map.entrySet();
	   
	   for(Map.Entry<String, Integer> se : entry) {
		   System.out.print(se.getKey()+" : "+se.getValue());
		   System.out.println();
	   }
	   
	   System.out.println(map.size());   
	   
	   Collection<Integer> i =map.values();
	   
	   for(Integer val : i) {
		   System.out.print(val+" ");
		   System.out.println();
	   }

	   Integer key = map.get("Apple");
	   
	   System.out.println("Apple  Value :"+ key);
	}

}
