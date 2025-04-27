package com.stringhandling;

import java.util.Arrays;

public class StringHandling1 {

	public static void main(String[] args) {
		
		String s1 = "Venu Gopal";   // will Store in string constant pool (scp)
		
		String s2 = new String("Venu Gopal");        // will store in heap 
	    System.out.println(s2);
		
		System.out.println(s1==s2);           // even though values are same ,address in string pool and address in heap is different
		
		String s3 = "Venu Gopal";            // s1 is represents or assign the value to s3 because name is already present in string pool
		
		System.out.println(s1==s3);
		
		
		String s4 = s2;
		
		System.out.println(s4 == s2);
		System.out.println(s4 == s3);

		String s5 = s1+s2;
		System.out.println(s5);
		
		System.out.println(s1.charAt(0));
		
		System.out.println(s1.codePointAt(0));
		
		System.out.println(s1.codePointAt(s1.length()-1));
		
		System.out.println(s1.codePointBefore(9));
		
		System.out.println(s1.codePointCount(0, s1.length()-1));
		
		System.out.println(s1.compareTo(s5));
		
		System.out.println(s1.compareToIgnoreCase(s5));
		
		System.out.println(s1.concat(" Ontipuli"));
		
		System.out.println(s1.contains("a"));
		
		System.out.println(s1.contentEquals("Venu Gopal"));
		
		System.out.println(s1.contentEquals("Venu Gopal"));
		
		System.out.println(s1.endsWith("l"));
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase("venu GOPAL"));
		
		System.out.println(s1.formatted(null));
		
		System.out.println(s1.indent(5));
		
		System.out.println(s1.indexOf("G"));
		
		System.out.println(s1.indexOf("pal"));
		
		System.out.println(s1.indexOf("G", 7));
		
		System.out.println(s1.indexOf("G", 4, 7));
		
		System.out.println(s1.indexOf("pal", 0, 9));
		
		System.out.println(s1.intern());
		
		System.out.println(s1.isBlank());
		
		String s = "  ";
		System.out.println(s.isBlank());
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s1.lastIndexOf("o"));
		
		String s11[] =s1.split(" ");
		System.out.println(Arrays.toString(s11));
		
		
		
	}

}
