package com.xmlautowire.XmlAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xmlautowire.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext obj = new ClassPathXmlApplicationContext("/com/xmlautowire/config/autowireconfg.xml");
        
        System.out.println(obj);

        Student s = (Student)obj.getBean("studentid");
        
        System.out.println(s);
        
    }
}
