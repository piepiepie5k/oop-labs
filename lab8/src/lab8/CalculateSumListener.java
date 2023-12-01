package lab8;

import javax.swing.JTextArea;

public class CalculateSumListener extends AbstractTextMatrixListener{
	
	long sum;
	
	@Override 
	protected void initialization(matrix matrix) {
		sum=0;
	}
	@Override
	protected void nextStep(matrix matrix, int i, int j) {
		sum+=matrix.getValue(i, j);
	}
	@Override
	protected void finalization(matrix matrix) {
		setText("Sum="+String.valueOf(sum));
	}
	

}
