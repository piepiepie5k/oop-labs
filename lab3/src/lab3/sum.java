package lab3;

public class sum implements Iop{
	@Override
	public String getSign() {
		return "+";
		
	}
	@Override
	public String getName() {
		return "Сумма";
		
	}
	
	@Override
	
	public int estimate(int a, int b) {
		return a+b;
	}

}
