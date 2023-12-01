package lab8;

public class DiagonalGen implements IGenerator{
	@Override
	public String getName() {
		return "Дианональная";
	}
	
	
	@Override
	public long getElement(int i, int j)
	{
		return i==j? (long) Math.floor(Math.random()*100):0;
	}

}
