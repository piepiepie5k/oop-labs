package lab8;

import javax.swing.JTextArea;

public class CalculateTraceListener extends AbstractTextMatrixListener{
	long trace;
	@Override
	protected void initialization(matrix matrix) {
		trace=0;
	}
	@Override
	protected void nextStep(matrix matrix, int i, int j)
	{	if(i==j) {
		trace+=matrix.getValue(i, j);
		}
	}
	
	@Override
	protected void finalization(matrix matrix) {
		setText("Trace="+String.valueOf(trace));
	}
	

}
