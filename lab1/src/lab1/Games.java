package lab1;

import java.io.PrintStream;

public class Games {

	
	String title;
	String developer;
	double price;
	int age;
		
		public Games(String title,String developer,double price,int age) {
			this.title=title;
			this.developer=developer;
			this.price=price;
			this.age=age;
		}
		//игра от создателей магазина
		public Games(String title, double price, int age) {
			this.title=title;
			this.developer="Valve";
			this.price=price;
			this.age=age;
		}
		
		
		public void print() {
			System.out.printf("%40s %30s %10.2f %d\n", title, developer, price, age);
		}
		
		public void filesave(PrintStream stream) {
			stream.printf("%40s %40s %10.2f %d\n", title, developer, price, age);
		}
	
}
