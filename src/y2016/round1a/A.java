package y2016.round1a;

import commons.AbstractSolutionAdapter;
import commons.CodeJam;
import commons.CodeJamArgs;
import commons.Problem;
import commons.Problem.Size;
import commons.Round;

//Last Word
@CodeJamArgs(year="2016",round=Round.ROUND1A,problem=Problem.A,size=Size.LARGE,practice=true,filepresent=true) //set config heres
public class A extends AbstractSolutionAdapter implements CodeJam<String> { //the parameter for CodeJam is the return type of each testcase
	
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

	//don't change
	public static void main(String[] args) throws Exception {	
		setIOConfig();
		createSolutionInstance();
	}
}
