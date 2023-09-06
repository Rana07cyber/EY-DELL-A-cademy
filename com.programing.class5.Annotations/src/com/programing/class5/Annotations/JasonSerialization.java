package com.programing.class5.Annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//public class JsonSerializable {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
	
public @interface JasonSerialization {

}
