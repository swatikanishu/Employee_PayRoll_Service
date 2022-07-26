package com.bridgelabz;

import java.util.ArrayList;
//import java.sql.Connection;
//import java.sql.Driver;
//import java.sql.DriverManager;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    public enum IOService{
        CONSOLE_IO,FILE_IO,DB_IO,REST_IO
    }
    private List<EmployeePayrollData> EmployeePayrollList;
    public EmployeePayrollService() {

    }
    public EmployeePayrollService(List<EmployeePayrollData> EmployeePayrollList) {
        this.EmployeePayrollList = EmployeePayrollList;
    }
    void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID:");
        int id = consoleInputReader.nextInt();

        System.out.println("Enter Employee Name:");
        String name = consoleInputReader.next();

        System.out.println("Enter Employee salary:");
        double salary = consoleInputReader.nextDouble();

        EmployeePayrollList.add(new EmployeePayrollData(id,name,salary));
    }
    public void writeEmployeePayrollData(IOService ioService) {
        if(ioService.equals(IOService.CONSOLE_IO)) {
            System.out.println("\nWriting Employee Payroll Roaster to console");
        }
        else if(ioService.equals(IOService.FILE_IO)) {
            new EmployeePayrollFileIOService().writeData(EmployeePayrollList);

        }
    }
    public void printData(IOService ioService) {
        if(ioService.equals(IOService.FILE_IO));
    }
    public long countEntries(IOService fileIo) {
        if(fileIo.equals(IOService.FILE_IO))
            return new EmployeePayrollFileIOService().countEntries();

        return 0;
    }


    public long readDataFromFile(IOService fileIo) {

        List<String> employeePayrollFromFile = new ArrayList<String>();
        if(fileIo.equals(IOService.FILE_IO)) {
            System.out.println("Employee Details from payroll-file.txt");
            employeePayrollFromFile = new EmployeePayrollFileIOService().readDataFromFile();

        }
        return employeePayrollFromFile.size();
    }
    public static void main(String[] args) {

        System.out.println("---------- Welcome To Employee Payroll Application ----------\n");
        ArrayList<EmployeePayrollData> employeePayrollList  = new ArrayList<EmployeePayrollData>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);

        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData(IOService.CONSOLE_IO);
    }

}
