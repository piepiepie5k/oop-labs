package lab8;

public class ZeroGen implements IGenerator {
	@Override
	public String getName() {
		return "Нулевая";
	}
	
	
	@Override
	public long getElement(int i, int j)
	{
		return 0;
	}
}
