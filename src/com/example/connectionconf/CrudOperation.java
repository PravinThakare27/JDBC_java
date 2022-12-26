package com.example.connectionconf;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;


public class CrudOperation {
Connection connectionmaster=Connectionmaster.getconnection();
Scanner scanner=new Scanner(System.in);
void insertdata() {
	//System.out.println(connectionmaster);
	try {
		PreparedStatement pStatement=connectionmaster.prepareStatement("insert into Doctor values(?,?,?,?)");
		pStatement.setInt(1, 6);
		pStatement.setString(2, "Yash");
		pStatement.setString(3,"3798556373" );
		pStatement.setString(4, "Pranita");
		int b=pStatement.executeUpdate();
		System.out.println(b);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
void updatedata() {
	try {
		System.out.println("Enter the id ");
		int id=scanner.nextInt();
		PreparedStatement pStatement=connectionmaster.prepareStatement("update Doctor set graduation_university=?,contact=?,name=? where doctorid=? ");
		

		pStatement.setString(1, "Yash");
		pStatement.setString(2,"3798556373" );
		pStatement.setString(3, "Priti");
		pStatement.setInt(4, 6);
		int k =pStatement.executeUpdate();
		System.out.println(k);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
void deletedata() {
	try {
		System.out.println("Enter the id ");
		int id=scanner.nextInt();
		PreparedStatement pStatement=connectionmaster.prepareStatement("delete  from doctor where doctorid=? ");
		

		
		pStatement.setInt(1, 6);
		int k =pStatement.executeUpdate();
		System.out.println(k);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
void fetchdata() {
	try {
		

		PreparedStatement pStatement=connectionmaster.prepareStatement("select * from Doctor");
		ResultSet rs =pStatement.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString("name"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
void storeselect() {
	CallableStatement cs;
	try {
		cs = connectionmaster.prepareCall("call storeselecttable()");
		ResultSet rs=cs.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString("name"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
void selectdctbyidandname() throws SQLException {
	CallableStatement cs1=connectionmaster.prepareCall("call selectdctbyidandname(?,?)");
	cs1.setInt(1, 2);
	cs1.setString(2, "Ajay");
	ResultSet rs=cs1.executeQuery();
rs.next();
	System.out.println(rs.getInt(1)+" "+rs.getString("name"));
}
void USAdct() {
	try {
		CallableStatement cs1=connectionmaster.prepareCall("call USAdct(?,?)");
		cs1.setString(1, "USA");
		cs1.registerOutParameter(2, Types.INTEGER);
		int k=cs1.executeUpdate();
		int k1=cs1.getObject(2,Integer.class);
		System.out.println(k+" count "+k1);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		CrudOperation crudOperation=new CrudOperation();
		//crudOperation.insertdata();
		//crudOperation.updatedata();
		//crudOperation.deletedata();
//		crudOperation.fetchdata();
//		crudOperation.storeselect();
//		crudOperation.selectdctbyidandname();
		crudOperation.USAdct();
	}

}
