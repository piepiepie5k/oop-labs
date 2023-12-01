package lab5;

import java.util.Scanner;

public class launch {
	public static void main(String args[]) {
		int a= 0,b = 0;
		char op= ' ';
		double res;
		Scanner in = new Scanner(System.in);
		try
		{
			System.out.print("введите целое число:");
			a = in.nextInt();
			System.out.print("введите второе целое число:");
			b = in.nextInt();
			System.out.print("введите операнд:");
			op = in.next().charAt(0);
		}
		catch(Exception e) {
			System.out.println("введено в неверном формате");
			return;
			
		}
		calculator calc = new calculator(a,b,op);
		res = calc.calc();
		System.out.printf("результат: %f", res);
		in.close();
	}

}
