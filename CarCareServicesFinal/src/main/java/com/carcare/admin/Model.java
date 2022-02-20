package com.carcare.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Model {
	Connection con;
	private String username, name, password, phoneno;
	private String newCustomerPassword;
	private String carModel, carVH, service, status;
	private String ausername, apwd, oldapwd;

	public String getOldapwd() {
		return oldapwd;
	}
	public void setOldapwd(String oldapwd) {
		this.oldapwd = oldapwd;
	}
	public String getAusername() {
		return ausername;
	}
	public void setAusername(String ausername) {
		this.ausername = ausername;
	}
	public String getApwd() {
		return apwd;
	}
	public void setApwd(String apwd) {
		this.apwd = apwd;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarVH() {
		return carVH;
	}
	public void setCarVH(String carVH) {
		this.carVH = carVH;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}

	
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	public String getNewCustomerPassword() {
		return newCustomerPassword;
	}

	public void setNewCustomerPassword(String newCustomerPassword) {
		this.newCustomerPassword = newCustomerPassword;
	}

	void connect()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","password");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	int Customerlogin() {
		try {
			String s = "Select * from customerAccounts where username=? and password=?"; 
						
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1,username);
			pstmt.setString(2,password);
			
			ResultSet rs = pstmt.executeQuery();
				
			if(rs.next() == true) {
				return 1;
			}
			else {
				return 0;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	int CustomerChangePassword(){
		try {
			String s = "update customeraccounts set password = ? where username = ? and password = ?"; 
			
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1,newCustomerPassword);
			pstmt.setString(2,username);
			pstmt.setString(3, password);
			
			int rs = pstmt.executeUpdate();
			if(rs == 1) {
				System.out.println("Customer password has been change!");
				
				return 1;
			}
			else {
				return 0;
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;

	}
	
	int register() {
		int result = 0;
		try {
		
			String s = "INSERT INTO customerAccounts" + 
			"(username, name, password, phoneno) VALUES " + 
			"(?,?,?,?);";
			
			// Create a statement using the getters/setters
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1,  username);
			pstmt.setString(2,  name);
			pstmt.setString(3,  password);
			pstmt.setString(4, phoneno);
			
			System.out.println(pstmt);
			
			// Execute/update query
			result = pstmt.executeUpdate();
			System.out.println("Your account has been registered!");
		
			}
			catch(Exception e)
			{
				System.out.println("Some problem");
				e.printStackTrace();
			}
		return result;
		}
	
	public int insertService()
	{
		int registered = 0;
		String s = " Insert into booking values(?,?,?,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) con.prepareStatement(s);
			pstmt.setString(1, username);
			pstmt.setString(2, carModel);
			pstmt.setString(3, carVH);
			pstmt.setString(4, service);
			pstmt.setString(5, status);
			registered= pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return registered;
	
	}

}


