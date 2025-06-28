package com.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CharactersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		Map<Character,Integer> m = new HashMap<>();
		
		for(char c: ch) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}else {
				m.put(c, 1);
			}
		}
		
		Set<Entry<Character,Integer>>entries= m.entrySet();
		for(Map.Entry<Character, Integer> entry : entries) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		//hashmap internally using the equals method for storing the keys 
	}

}
