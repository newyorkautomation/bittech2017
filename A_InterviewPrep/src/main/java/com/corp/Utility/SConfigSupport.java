package com.corp.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class SConfigSupport
{
	@Test
	public void database()
	{
		String data0 = null;
		try
		{
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students", null);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Customers");
			data0 = rs.getString("");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(data0);
	}
}
