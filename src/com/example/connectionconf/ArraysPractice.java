package com.example.connectionconf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer [] integers= {3,1,7};
List<Integer> i1=Arrays.asList(integers);
int sum=i1.stream().filter(e->e%2!=0).map(e->e*e).reduce(0,(e1,e2)->e1+e2);
//int sum=i1.stream().reduce(0,(e1,e2)->e1+e2);
//System.out.println(sum);
List<String> names=new ArrayList<String>();
names.add("jack");
names.add("john");
names.add("Jill");
names.add("Jim");
names.add("Garry");
names.add("Frank");
//decided to give prize to those participants whose name started with “J” and has exactly 4 letters in it
//List<String> l1=names.stream().filter(e->e.toLowerCase().startsWith("j") && e.length()==4).collect(Collectors.toList());
//l1.forEach(System.out::println);
//names.stream().filter((n)->n.startsWith("J") && n.length()==4).forEach((n)->System.out.println(n));

	}

}
