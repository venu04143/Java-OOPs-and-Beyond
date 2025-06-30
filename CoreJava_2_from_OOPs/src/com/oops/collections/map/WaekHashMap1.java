package com.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Mode{
	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ontipuli";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize Method Called");
	}
}

public class WaekHashMap1 {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Mode m = new Mode();
		
//		Map<Object,String> m2 = new HashMap<>();
//		
//		m2.put(m, "VenuGopal");
//		
//		System.out.println(m2);
//        m=null;
//        System.gc();
//		System.out.println(m2);
		
		Map<Object,String> m1 = new WeakHashMap<>();
		
		
		m1.put(m, "VenuGopal");
		
		System.out.println(m1);
		m=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m1);
		
	}

}
