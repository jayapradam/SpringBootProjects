/**
 * 
 */
package org.java8.examples;

/**
 * @author Jayap
 *
 */
public class LambdaExample{


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LambdaExample lambdaExample = new LambdaExample();
		System.out.println("This is Java 8 lambda expression example");
		System.out.println("*****************************************");
		//Addition using method
		System.out.println("Sum is:  "+ lambdaExample.sum(10,20));
		//Addition using anonymous inner class
		LambdaExample lambdaExample1 = new LambdaExample() {
			public int sum(int x , int y) {
				return x+y;
			}
		};
		System.out.println("Sum using inner class is:: "+lambdaExample1.sum(6, 4));
		//Addition using lambda expressions
		SumEx sumEx = (a,b) -> a+b ;
		System.out.println("Sum using Lamda expression is :: "+sumEx.sum(8, 20));
		
	}
 public int sum(int a, int b) {
	 return a+b;
	 
 }
}
interface SumEx{
	public int sum(int a, int b);
	//public void sayHello();
}

