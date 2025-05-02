package com.stringhandling;

public class CountOccurencesOfaSubstring {

	public static int countSubstring(String s, String substring) {
        int count = 0;
        int subLen = substring.length();
        for (int i = 0; i <= s.length() - subLen; i++) {
            if (s.substring(i, i + subLen).equals(substring)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstring("hello world", "o"));  // Output: 2
        
    }

}
