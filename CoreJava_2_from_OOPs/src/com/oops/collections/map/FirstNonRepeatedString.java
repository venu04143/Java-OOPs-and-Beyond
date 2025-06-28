package com.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = {"apple","banana","orange","banana","apple","grape"};
		
		Map<String,Integer> map = new LinkedHashMap<>();
		
		for(String str : words) {
			if(map.containsKey(str)) {
				map.put(str,map.get(str)+1);
			}else {
				map.put(str, 1);
			}
		}
		
		System.out.println(map);
		
		System.out.println("first Non-Repeating String is : ");
		Set<Entry<String,Integer>> entries= map.entrySet();
		for(Map.Entry<String, Integer> entry : entries) {
			
			if(entry.getValue()==1) {
				System.out.println(entry.getKey()+"->"+entry.getValue());
				break;
			}
		}
	  
	}

}
