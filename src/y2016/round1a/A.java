package y2016.round1a;

import commons.AbstractSolutionAdapter;
import commons.CodeJam;
import commons.IOHandler;
import commons.Problem;
import commons.Round;

//Last Word
public class A extends AbstractSolutionAdapter implements CodeJam<String> { //the parameter is the return type of your solution
	
	public static void main(String[] args) {
		io = new IOHandler("2016",Round.ROUND1A, Problem.A, Problem.Size.LARGE,PRACTICE,FILE_PRESENT);		
		solver(new A());
	}

	//add solution in here  //the return type here is what will be printed as the result for that particular test case 
	@Override
	public String solve() {
		String s = io.getNextLine();
		int len = s.length();
		StringBuilder best = new StringBuilder(s.substring(0, 1));
		String next="";
		for(int i = 1;i<len;i++){
			next = s.substring(i,i+1);
			if(best.subSequence(0, 1).toString().compareTo(next)<=0){
				best.insert(0, next);
			}
			else{
				best.append(next);
			}
		}
		return best.toString();
	}
}
