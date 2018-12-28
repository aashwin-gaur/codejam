package solutions.y2018.qualifiers;

import commons.*;


@CodeJamArgs(year = "2018", round = Round.QUALIFIERS, problem = Problem.A, size = Problem.Size.SMALL, practice = true, filepresent = true)
public class SaveUniverse extends AbstractSolutionAdapter implements CodeJam<String> {

    @Override //O(n^2) solution
    public String solve() {
        int d = io.getNextInt();
        char[] instructions = io.getNext().toCharArray();
        int instructionsLength = instructions.length;

        int switches = 0;
        if (getDamage(instructions) <= d) {
            return "0";
        }
        for (int i = 0; i < instructionsLength - 1; i++) {
            if (instructions[i] == 'C' && instructions[i + 1] == 'S') {
                swap(instructions, i, i + 1);
                switches++;
                if (getDamage(instructions) <= d) {
                    break;
                }
                if (i > 1) {
                    i -= 2;
                }
            }
        }
        if (switches == 0) {
            return "IMPOSSIBLE";
        }
        return Integer.toString(switches);
    }

    private void swap(char[] array, int a, int b) {
        char temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    private int getDamage(char[] instructions) { //is it possible to make this constant time?
        int instructionsLength = instructions.length;
        int damage = 0, charges = 0;
        for (int i = 0; i < instructionsLength; i++) {
            switch (instructions[i]) {
                case 'S':
                    damage += Math.pow(2, charges);
                    break;
                case 'C':
                    charges++;
                    break;
                default:
                    break;
            }
        }
        return damage;
    }

    //don't change
    public static void main(String[] args) throws Exception {
        setIOConfig();
        createSolutionInstance();
    }
}
