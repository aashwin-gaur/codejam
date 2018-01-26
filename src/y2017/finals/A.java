package y2017.finals;

import commons.AbstractSolutionAdapter;
import commons.CodeJam;
import commons.IOHandler;
import commons.Problem;
import commons.Round;


//Dice Straight
public class A extends AbstractSolutionAdapter implements CodeJam<Integer>{
	
	public static void main(String[] args) {
		io = new IOHandler("2017",Round.FINALS, Problem.A, Problem.Size.SMALL,PRACTICE,FILE_PRESENT);
		solver(new A());
	}
	
	
	@Override
	public Integer solve() {
		
		final int noOfDice = io.getNextInt();
		final int sides = 6;
		int[] allSides = new int[noOfDice*sides];
		for(int i=0;i<noOfDice*sides;i++) {
			allSides[i] = io.getNextInt();
		}
		return 0;
	}

	
}
