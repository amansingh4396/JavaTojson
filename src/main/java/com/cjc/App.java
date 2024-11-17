package com.cjc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonProcessingException
    {
        
    	
    	Student stu = new Student();
    	stu.setId(101);
    	stu.setAddress("Sangvi");
    	stu.setMarks(85.36f);
    	stu.setName("Aman");
    	
    	ObjectMapper obj = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    	
    	String str = obj.writeValueAsString(stu);
    	
    	System.out.println(str);
    	
    	
    	//Convert json to java
    	
    	ObjectMapper obj1 = new ObjectMapper();
    	
    	Student stu1 = obj1.readValue(str, Student.class);
    	
    	System.out.println(stu1.getAddress());
    	System.out.println(stu1.getId());
        System.out.println(stu1.getMarks());
        System.out.println(stu1.getName());
    	
    }
}
