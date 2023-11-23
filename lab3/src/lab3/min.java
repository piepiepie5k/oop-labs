package lab3;

public class min implements Iop{
	@Override
	public String getSign() {
		return "MIN";
		
	}
	@Override
	public String getName() {
		return "минимум";
		
	}
	
	@Override
	
	public int estimate(int a, int b) {
		return a<b ? a : b;
	}

}
