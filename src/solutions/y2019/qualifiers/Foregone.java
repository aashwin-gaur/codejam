package solutions.y2019.qualifiers;

import commons.*;

@CodeJamArgs(year = "2019", round = Round.QUALIFIERS, problem = Problem.A, size = Problem.Size.LARGE, practice = true, filepresent = true)
public class Foregone extends AbstractSolutionAdapter implements CodeJam<String> {

    @Override
    public String solve() {
        char[] a = io.getNext().toCharArray();
        String b = "";
        int l = a.length;
        for(int i=l-1;i>=0;i--){
            if(a[i] == '4'){
                a[i] = '3';
                b = '1'+b;
            } else {
                b = '0'+b;
            }
        }
        return  new String(a) + " " +  b;
    }

    public static void main(String[] args) throws Exception {
        setIOConfig();
        createSolutionInstance();
    }
}
