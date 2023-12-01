package lab8;

import javax.swing.JTextArea;

public class CalculateMaxListener extends AbstractTextMatrixListener{
	
		long max;
		@Override 
		protected void initialization(matrix matrix) {
			max=matrix.getValue(0, 0);
		}
		@Override
		protected void nextStep(matrix matrix,int i,int j)
		{
			if(max<matrix.getValue(i,j)) {
				max=matrix.getValue(i,j);
			}
		}
		
		@Override
		protected void finalization(matrix matrix) {
			setText("Max="+String.valueOf(max));
		}
}
