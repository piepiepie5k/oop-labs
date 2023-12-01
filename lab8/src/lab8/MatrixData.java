package lab8;

public class MatrixData {
	public static IGenerator[] generators = {
			new ZeroGen(),
			new IdentityGen(),
			new DiagonalGen(),
			new RandomGen(),
			new TriangleGen()
			
	};
	public static IMatrixListener[] listeners = {
			new CalculateMaxListener(),
			new CalculateSumListener(),
			new CalculateTraceListener(),
			new CalculateMinListener()
	};

}
