package solutions.y2018.qualifiers;

import commons.*;

@CodeJamArgs(year = "2018", round = Round.QUALIFIERS, problem = Problem.B, size = Problem.Size.SMALL, practice = true, filepresent = true)
public class TroubleSort extends AbstractSolutionAdapter implements CodeJam<String> {


    @Override
    public String solve() {
        int len = io.getNextInt();
        int[] list = new int[len];
        for (int i = 0; i < len; i++) {
            list[i] = io.getNextInt();
        }
        for (int i = 0; i < len - 2; i++) {
            if (middleNumIsSmallest(list, i) || middleNumIsLargest(list, i)) {
                return Integer.toString(i + 1);
            } else if (thirdLessThanFirst(list, i)) {
                reverse(list, i);
            }
        }
        return "OK";
    }

    private boolean thirdLessThanFirst(int[] list, int i) {
        return list[i + 2] > list[i];
    }

    private boolean middleNumIsSmallest(int[] list, int i) {
        return (list[i + 1] < list[i] && (list[i + 1] < list[i + 2]));
    }

    private boolean middleNumIsLargest(int[] list, int i) {
        return (list[i + 1] > list[i] && (list[i + 1] > list[i + 2]));
    }

    private void reverse(int[] list, int i) {
        swap(list, i, i + 2);
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


    //don't change
    public static void main(String[] args) throws Exception {
        setIOConfig();
        createSolutionInstance();
    }
}
