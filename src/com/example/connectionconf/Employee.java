package com.example.connectionconf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Employee implements Comparable<Employee>{
	int eid;
    String ename;
    int salary;
    int deptid;
    String designation;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(int eid, String ename, int age,int salary, String designation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.deptid = deptid;
		this.designation = designation;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", age=" + deptid
				+ ", designation=" + designation + "]";
	}
public static void main(String[] args) throws SQLException, ClassNotFoundException {

	 List<Employee> empList = Arrays.asList(new Employee(1,"Ajay",31,4500,"IT"),
             new Employee(2,"Cat",34,5600,"Manager"),new Employee(3,"Ball",45,7800,"IT"),
             new Employee(4,"Dog",27,2300,"Associate"));
	 Collections.sort(empList);
	// System.out.println(empList);
	 
	 Consumer<Employee> c1=(Emp)->System.out.println(Emp);
	 
	 Function<Employee, Integer> f1=(emp)->{return emp.getDesignation().equals("Manager")?emp.getSalary()+10000:emp.getSalary();};
	 for (Employee e:empList) {
		
		System.out.println(f1.apply(e));
	 }
	
	
}



@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	return this.getEname().compareTo(o.getEname());
}
}


