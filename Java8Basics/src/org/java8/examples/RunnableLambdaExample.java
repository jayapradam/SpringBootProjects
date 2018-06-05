package org.java8.examples;

public class RunnableLambdaExample {

	public static void main(String[] args) {

		// Runnable using anonymous inner class
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Helloworld 1..............");
			}
		};

		// Runnable using lambda expression

		Runnable r2 = () -> System.out.println("Hellowrold 2............");
		r1.run();
		r2.run();

	}

}	
