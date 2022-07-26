package com.bridgelabz;
import java.util.Enumeration;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;



    public class DBDemo {
        public static void main(String[] args) {
            String jdbcURL = "jdbc:mysql://localhost:3306/employee_payroll_service?useSSL=false";
            String userName = "root";
            String password = "mynewpassword";

            Connection con;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Driver loaded!");
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Cannot find the driver in the classpath!", e);
            }

            listDrivers();

            try{
                System.out.println("Connecting to database"+jdbcURL);
                con = DriverManager.getConnection(jdbcURL, userName, password);
                System.out.println("Connection is successful!!!!!!"+con);
            }
            catch(Exception e ) {
                e.printStackTrace();
            }
        }
        public static void listDrivers() {
            Enumeration<Driver> driverList = DriverManager.getDrivers();
            while (driverList.hasMoreElements()) {
                Driver driverClass = (Driver) driverList.nextElement();
                System.out.println(" "+driverClass.getClass().getName());

            }
        }
    }



