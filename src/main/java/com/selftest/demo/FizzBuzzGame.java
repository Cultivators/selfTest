package com.selftest.demo;

/**
 * 
 * @author Administrator
 * test case in com.selftest.SelftestApplicationTests
 */
public class FizzBuzzGame {
	
	public static void playStage1(){
		for(int num = 1; num <= 100; num++){
			String result = "";
			boolean flag = false;
			if(divisibleByNum(num, 3)){
				result += "Fizz";
				flag = true;
			}
			if(divisibleByNum(num, 5)){
				result += "Buzz";
				flag = true;
			}
			if(!flag){
				result = String.valueOf(num);
			}
			System.out.println(result);
		}
	}
	
	public static void playStage2(){
		for(int num = 1; num <= 100; num++){
			boolean isDivisibleByThree = divisibleByNum(num, 3);
			boolean isDivisibleByFive = divisibleByNum(num, 5);
			boolean isIncludeThree = String.valueOf(num).contains("3");
			boolean isIncludeFive = String.valueOf(num).contains("5");
			if((isDivisibleByThree && isDivisibleByFive)
					|| (isDivisibleByThree && isIncludeFive)
					|| (isIncludeThree && isDivisibleByFive)
					|| (isIncludeThree && isIncludeFive)){
				System.out.println("FizzBuzz");
			}else if(isDivisibleByThree || isIncludeThree){
				System.out.println("Fizz");
			}else if(isDivisibleByFive || isIncludeFive){
				System.out.println("Buzz");
			}else{
				System.out.println(num);
			}
		}
		
	}
	
	private static boolean divisibleByNum(int targetNum, int divisibleNum){
		return targetNum % divisibleNum == 0;
	}
	
	public static void main(String[] args) {
//		playStage1();
		playStage2();
	}
}
