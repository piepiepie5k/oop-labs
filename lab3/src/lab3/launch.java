package lab3;

public class launch {
	
	public static void main(String[] args) {
		
		Iop[] ops = {
				new sum(), new minus(), new multiply(), new max(), new min()
		};
		
		
		int a=13, b=-4;
		for (Iop op:ops)
		{
			System.out.println(op.getName());
			System.out.printf("%d %s %d = %d\n", a, op.getSign(), b, op.estimate(a, b));
		}
		
	}

}
