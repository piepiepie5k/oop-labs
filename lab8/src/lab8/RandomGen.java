package lab8;

public class RandomGen implements IGenerator {
	@Override
	public String getName() {
		return "Случайая";
	}
	
	
	@Override
	public long getElement(int i, int j)
	{
		return (long) Math.floor(Math.random()*100);
	}

}
