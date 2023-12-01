package lab8;

import javax.swing.JTextArea;

public abstract class AbstractTextMatrixListener extends JTextArea 
implements IMatrixListener{
	@Override
	final public void matrixUpdated(matrix matrix) {
		initialization(matrix);
		for(int i=0;i<matrix.getSize();i++)
		{
			for (int j=0;j<matrix.getSize();j++) {
				nextStep(matrix,i,j);
			}
		}
		finalization(matrix);
		
	}
	
	
	protected abstract void initialization(matrix matrix);
	protected abstract void nextStep(matrix matrix,int i, int j);
	protected abstract void finalization(matrix matrix);

}
