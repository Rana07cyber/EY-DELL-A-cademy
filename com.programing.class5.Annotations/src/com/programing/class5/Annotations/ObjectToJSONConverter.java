package com.programing.class5.Annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;

import java.util.Objects;

public class ObjectToJSONConverter {

	public String convertToJSON(Object obj) {

		try {

			CheckifSerializable(obj);

			initializeObject(obj);

			return getJsonString(obj);

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

	private void CheckifSerializable(Object obj) throws JsonSerializableException {

		if (Objects.isNull(obj)) {

			throw new JsonSerializableException("Can't serialize null object");

		}

		Class<?> clazz = obj.getClass();

		if (!clazz.is AnnotationPresent(JsonSerializable.class)) {

			throw new JsonSerializableException(
					("This class" + clazz.getSimpleName() + "is not annotated with" + "Json Serializable annotation"));

		}

	}

	private void initializeObject(Object object) throws IllegalAccessException, InvocationTargetException {

		Class<?> clazz = object.getClass();

		for (Method method : clazz.getDeclaredMethods()) {

			method.setAccessible(true);

			method.invoke(object);

		}

	}

	}

	catch(

	Exception e)
	{

	            System.out.println(e.getMessage());

	        }

	}

	private void CheckIfSerializable(Object obj) throws JsonSerializableException {

		if (Objects.isNull(obj)) {

			throw new JsonSerializableException("Can't serialize null object");

		}

		Class<?> clazz = obj.getClass();

		if (!clazz.isAnnotationPresent(JsonSerializable.class)) {

			throw new JsonSerializableException("This class " + clazz.getSimpleName() + " is not annotated with "
					+ " JSON Serializable annotation");

		}

	}

	private void initializeObject(Object object) throws IllegalAccessException, InvocationTargetException {

		Class<?> clazz = object.getClass();

		for (Method method : clazz.getDeclaredMethods()) {

			method.setAccessible(true);

			method.invoke(object);

			
			//*******************************
			
			private String getJasonString(Object object) {
				Class<?> clazz = object.getClass();
				Map<String, String> jasonELementMap = new Hashmap<>();
				for(Field field: clazz.getDeclaredField()) {
					field.setAccessible(true);
					if(field.isAnnotationPresent(JasonElement.class)) {
						jasonElementMap.put(getKey(field),(String)field.get(object));
						
					}
				}

				
				
			
			
		}

	}

}

