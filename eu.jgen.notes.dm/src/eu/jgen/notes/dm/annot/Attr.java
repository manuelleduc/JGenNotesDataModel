package eu.jgen.notes.dm.annot;

import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

@Documented
@Retention(CLASS)
public @interface Attr {	
	short length() default 9; 
	short decimalPlaces() default 2;
	boolean optional() default false;
	boolean caseSensitive() default false;
	boolean varyingLengt() default false;
}
