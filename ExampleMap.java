package com.training.day2.handson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ExampleMap {
	
	
public static void main(String[] args) {
	List<Student> list1 = new ArrayList<>();
	
	List<Student> list2 = new ArrayList<>();
	Map<String,List<Student>> resMap = new TreeMap<>(); 
	
	list1.add(new Student(1,"jayKrish"));
	list1.add(new Student(2,"Guruteja"));
	list2.add(new Student(3,"Bablu"));
	list2.add(new Student(4,"tyuio"));
resMap.put("CS",list1);
resMap.put("EC",list2);
System.out.println(resMap.get("CS"));
	
	
}
}
