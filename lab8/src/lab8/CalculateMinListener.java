package lab8;

public class CalculateMinListener extends AbstractTextMatrixListener{
	
	long min;
	@Override 
	protected void initialization(matrix matrix) {
		min=matrix.getValue(0, 0);
	}
	@Override
	protected void nextStep(matrix matrix,int i,int j)
	{
		if(min>matrix.getValue(i,j)) {
			min=matrix.getValue(i,j);
		}
	}
	
	@Override
	protected void finalization(matrix matrix) {
		setText("Min="+String.valueOf(min));
	}
}