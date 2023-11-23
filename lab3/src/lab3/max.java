package lab3;

public class max implements Iop{
	@Override
	public String getSign() {
		return "MAX";
		
	}
	@Override
	public String getName() {
		return "максимум";
		
	}
	
	@Override
	
	public int estimate(int a, int b) {
		return a>b ? a : b;
	}

}
