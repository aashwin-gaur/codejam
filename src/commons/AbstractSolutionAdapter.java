package commons;

public abstract class AbstractSolutionAdapter {
	public static final boolean FILE_PRESENT = true;
	public static final boolean PRACTICE = true;
	
	public static IOHandler io;
	
	public static <T> void solver(Object object){
		CodeJam<T> solved = (CodeJam<T>)object;
		int tests = io.getNextInt();
		T result = null;
		for(int i =0;i< tests;i++) {
			try {
				result = solved.solve();
			} catch (Exception e) {
			}
			io.getWriter().println("Case #"+(i+1)+" : "+result);
		}
	io.getWriter().flush();
	}
	
	public static void createSolutionInstance() throws Exception{
		solver(Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()).newInstance());
	}
}
