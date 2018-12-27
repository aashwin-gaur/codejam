package solutions.y2018.qualifiers;

import commons.*;


@CodeJamArgs(year = "2018", round = Round.QUALIFIERS, problem = Problem.A, size = Problem.Size.SMALL, practice = true, filepresent = true)
//set config heres
public class SaveUniverse extends AbstractSolutionAdapter implements CodeJam<String> {

    @Override
    public String solve() {
        int d = io.getNextInt();
        char[] instructions = io.getNext().toCharArray();
        int instructionsLength = instructions.length;

        //strategy - replace the last shoot with the first charge to get maximal change through the chain.
        // **** cant do this, only adjacent instructions can be swapped ****

        int chargeIndex = 0, shootIndex = instructionsLength - 1;
        int switches = 0;
        if (getDamage(instructions) <= d) {
            return "0";
        }
        while (chargeIndex < shootIndex) {

            if (instructions[chargeIndex] == 'C') {
                if (instructions[shootIndex] == 'S') {
                    swap(instructions, chargeIndex, shootIndex);
                    switches++;
                    if (getDamage(instructions) <= d) {
                        break;
                    }
                } else {
                    shootIndex--;
                }
            } else {
                chargeIndex++;
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

    private int getDamage(char[] instructions) {
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
