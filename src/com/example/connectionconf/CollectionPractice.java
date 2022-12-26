package com.example.connectionconf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class CollectionPractice {
public static void main(String[] args) {
	 List<Employee> employees = List.of(
             new Employee(1 , "nikhil" , 21 , 200000, "IT"),
             new Employee(2 , "nitin" , 22 , 100000, "IT"),
             new Employee(3 , "amit" , 23 , 150000, "SALES"),
             new Employee(4 , "vishal" , 21 , 270000, "SALES"),
             new Employee(5 , "neha" , 22 , 130000, "IT"),
             new Employee(6 , "nishtha" , 19 , 120000, "MARKETING"),
             new Employee(7 , "amita" , 20 , 110000, "MARKETING"),
             new Employee(8 , "sneha" , 18 , 160000, "MARKETING"),
             new Employee(9 , "vaibhav" , 28 , 120000, "IT"));
	Map<Integer, String> m1= employees.stream().collect(Collectors.toMap(e->e.getEid(), e->e.getDesignation()));
	List<String> s1 = new ArrayList<String>();
	employees.stream().filter(e->e.getDesignation().equals("IT")).map(e-> s1.add(e.getEname()));
	//System.out.println(s1);
//	Map<String, Long> map2=employees.stream().collect(Collectors.groupingBy(Employee::getDesignation,Collectors.counting()));
	  System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDesignation,Collectors.minBy((e1,e2)->e1.getSalary()-e2.getSalary()))));
	
//	employees.stream().sorted(((e1,e2)->e2.getSalary()-e1.getSalary())).limit(3).forEach(System.out::println);


}

}
