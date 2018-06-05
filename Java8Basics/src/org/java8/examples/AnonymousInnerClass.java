package org.java8.examples;

public class AnonymousInnerClass {
	static String name = "jayaprada";
	// Anonymous classes example

	public static void main(String[] args) {

		// Runnable interface
		Runnable r1 = new Thread() {
			public void run() {
				System.out.println("Hello**************" + name);
			}
		};
		r1.run();
		AnonymousInnerClass obj = new AnonymousInnerClass();
		obj.sayHello();

	}

	public void sayHello() {
		// class inheritance
		class KannadaGreetings implements HelloWorld {
			@Override
			public void greetings(String s) {
				System.out.println("Namaskaara........." + s);
				printMessage();
			}

			void printMessage() {
				HelloWorld.super.testMsg();
				System.out.println("Just a message.................");
			}
		}

		// interface inheritance
		HelloWorld english = new HelloWorld() {

			@Override
			public void greetings(String s) {
				System.out.println("Hi there " + s);

			}

		};
		HelloWorld spanish = new HelloWorld() {

			@Override
			public void greetings(String s) {
				System.out.println("Gracious........... " + s);

			}
		};
		HelloWorld kannada = new KannadaGreetings();
		kannada.greetings(name);
		english.greetings(name);
		spanish.greetings(name);
	}

	interface HelloWorld {
		public void greetings(String s);
		default void testMsg() {
			System.out.println("this is default method....");
			greeter();
		}
		
		static void greeter() {
			System.out.println("inside static method............");
		}
		
	}
}
