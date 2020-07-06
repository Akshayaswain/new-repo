package Package;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException 
	{
		Class<TestExample> t=TestExample.class;
		Method[] m=t.getDeclaredMethods();
		for(Method x:m) {
			if (x.isAnnotationPresent(Test.class)){
				Annotation a=x.getAnnotation(Test.class);
				Test al=(Test)a;
				if(al.disable()) {
					TestExample y=new TestExample();
					x.invoke(y);
				}
			}
			
		}

	}

}
