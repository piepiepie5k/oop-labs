package lab5;

public class calculator {
	int a,b, zero=0;
	char op;
	double res;
	
	public calculator(int a, int b, char op) {
		this.a=a;
		this.b=b;
		this.op=op;
		
	}
	public double calc() {

		switch(op) {
		default:
			System.out.println("неверный операнд");
			return zero;
			
			
		case '+':
			{return a+b;}
		case '-':
			{return a-b;}
		case '*':
			{return a*b;}
		case '/':{
			try {
				if (b == 0) throw new ArithmeticException("ошибка деления на 0");
				res = (double)a / b;
			}
			catch(ArithmeticException e){
				System.out.println(e);
				return zero;
			}
			return res;}
		}
	}

}
