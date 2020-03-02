package solutions.y2019.qualifiers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Sol{
    public static void main(String[] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for(int i = 1;i<=t;i++){
            String response = solve(in.next());
            System.out.println("Case #" + i + ": " + response);
        }
    }

    public static String solve(String testCase) {
        char[] a = testCase.toCharArray();
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

}