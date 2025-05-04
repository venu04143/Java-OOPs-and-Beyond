package com.stringhandling;

import java.util.Scanner;

public class CaseStudy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to Check Palindrome or not : ");
		
		String str = sc.next();
		sc.nextLine();
		
		boolean ans = isPalindrome(str);
		
		if(ans) {
			System.out.println("Given String "+str+" is Palindrome");
		}else {
			System.out.println("Given String "+str+" is not  Palindrome");
		}

	}
	static boolean isPalindrome(String str) {
		
		int start=0;
		int end=str.length()-1;
		
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}

/* 
 * select e.ename, e.sal from emp as e 
 *  inner join (select deptno,avg(sal) as avgSal 
 *  from emp group by deptno) as D
 *  on e.deptno=d.deptno
 *  where e.sal >d.avgSal */
 