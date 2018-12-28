package commons;

import java.io.*;
import java.util.StringTokenizer;

public class IOHandler {

    private BufferedReader in;
    private PrintWriter out;
    private String fileName;
    private StringTokenizer tokenizer;

    public IOHandler(String year, Round round, Problem problem, Problem.Size problemSize, boolean practice, boolean filePresent) {
        this.fileName = new StringBuffer("resources").append("/")
                .append(year).append("/")
                .append(round).append("/")
                .append(problem).append("-")
                .append(problemSize)
                .append(practice ? "-" : "")
                .append(practice ? "practice" : "")
                .toString();

        try {
            if (filePresent) {
                this.in = new BufferedReader(new FileReader(this.fileName + ".in"));
                this.out = new PrintWriter(new FileWriter(this.fileName + ".out"));
            } else {
                this.in = new BufferedReader(new InputStreamReader(System.in));
                this.out = new PrintWriter(System.out, true);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public String getNext() {
        while (this.tokenizer == null || !this.tokenizer.hasMoreTokens()) {
            try {
                this.tokenizer = new StringTokenizer(this.in.readLine());
            } catch (IOException e) {
                System.err.println("Problem while tokenizing");
            } catch (NullPointerException e) {
                System.err.println("The BufferReader is Null");
            }
        }
        return tokenizer.nextToken();
    }

    public String getNextLine() {
        try {
            return this.in.readLine();
        } catch (IOException e) {
            System.err.println("Failed to return line");
        }
        return "";
    }

    public int getNextInt() {
        return Integer.parseInt(this.getNext());
    }

    public double getNextDouble() {
        return Double.parseDouble(this.getNext());
    }

    public PrintWriter getWriter() {
        return this.out;
    }

}
