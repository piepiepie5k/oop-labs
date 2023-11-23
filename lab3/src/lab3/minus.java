package lab3;

public class minus implements Iop{
	@Override
	public String getSign() {
		return "-";
		
	}
	@Override
	public String getName() {
		return "разность";
		
	}
	
	@Override
	
	public int estimate(int a, int b) {
		return a-b;
	}

}
