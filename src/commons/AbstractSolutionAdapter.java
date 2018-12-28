package commons;

import java.lang.annotation.Annotation;

public abstract class AbstractSolutionAdapter {
    public static final boolean FILE_PRESENT = true;
    public static final boolean PRACTICE = true;

    public static IOHandler io;

    public static <T> void solver(Object object) {
        //argument could have been CodeJam<T> but then the generics in the createSolutionInstance() wouldn't work, hence we pass in an object and recast to CodeJam<T>
        CodeJam<T> solved = (CodeJam<T>) object;
        int tests = io.getNextInt();
        T result = null;
        for (int i = 0; i < tests; i++) {
            try {
                result = solved.solve();
            } catch (Exception e) {
            }
            io.getWriter().println("Case #" + (i + 1) + " : " + result);
        }
        io.getWriter().flush();
    }

    public static void createSolutionInstance() throws Exception {
        //using stack trace [2] we can get the name of the calling class(name of the class which is creating an instance in the main method)
        //and pass it in since thats where the solve method is overridden and implemented
        solver(Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()).newInstance());
    }

    //get IOConfig from the annoation in the calling class and create the io object
    public static void setIOConfig() {
        Class callingClass = null;
        try {
            callingClass = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Annotation anns = callingClass.getAnnotation(CodeJamArgs.class);
        CodeJamArgs args = (CodeJamArgs) anns;
        io = new IOHandler(args.year(), args.round(), args.problem(), args.size(), args.practice(), args.filepresent());
    }

}
