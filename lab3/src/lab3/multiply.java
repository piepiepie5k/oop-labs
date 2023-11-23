package lab3;

public class multiply implements Iop{
	@Override
	public String getSign() {
		return "*";
		
	}
	@Override
	public String getName() {
		return "Умножение";
		
	}
	
	@Override
	
	public int estimate(int a, int b) {
		return a*b;
	}

}
