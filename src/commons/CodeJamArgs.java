package commons;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import commons.Problem.Size;

@Retention(RUNTIME)
@Target(TYPE)
@Documented
public @interface CodeJamArgs {
	String year();
	Round round();
	Problem problem();
	Size size();
	boolean practice();
	boolean filepresent();
}
