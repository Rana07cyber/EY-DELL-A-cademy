package com.programing.class11;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class callablestatementAPI {

	//public static void main(String[] args) {
		static {

			try {

				Class.forName("com.mysql.cj.jdbc.Driver");

			}

			catch (ClassNotFoundException e) {

				e.printStackTrace();

			}

		}

		public static void main(String[] args) {

			Connection conn = null;

			//Statement stmt = null;

			CallableStatement stmt = null;
			Scanner sc= new Scanner (System.in);
			
			try {

				String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=Vu9qzSegqw";

				conn = DriverManager.getConnection(dbURL);

				if (conn != null) {

					System.out.println("Connection establised using conn1");

				}
				//Scanner sc= new Scanner (System.in);
				System.out.println("enter employee Id");
				int id = Integer.parseInt(sc.nextLine());
				
				System.out.println("enter employee name");
				String empName = sc.nextLine();
				
				System.out.println("enter employee role");
				String empRole = sc.nextLine();
				
				System.out.println("enter employee city");
				String empCity = sc.nextLine();
				
				System.out.println("enter employee country");
				String empCountry = sc.nextLine();
				
				stmt=conn.prepareCall("{call insertEmployee(?,?,?,?,?,?)}");
				stmt.setInt(1,id);
				stmt.setString(2,empName);
				stmt.setString(3,empRole);
				stmt.setString(4,empCity);
				stmt.setString(5,empCountry);

				
				stmt.registerOutParameter(6,java.sql.Types.VARCHAR);
				
				stmt.executeUpdate();
				
				String result =stmt.getString(6);
				
				System.out.println("employee recod saved successs"+ result);
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					stmt.close();
					conn.close();
					sc.close();
					
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
}
