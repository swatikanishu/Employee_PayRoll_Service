package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmpPayRollService {
    private List<EmpPayRollData> empPayRollList;
    public EmpPayRollService(){

    };
    public EmpPayRollService(List<EmpPayRollData> empPayRollList) {
        this.empPayRollList = empPayRollList;
    }
    public static void main(String[] args) {
        System.out.println("employee pay roll service");
        ArrayList<EmpPayRollData> empPayRollList = new ArrayList<>();
        EmpPayRollService empPayRollService = new EmpPayRollService(empPayRollList);
        Scanner consoleInputReader = new Scanner(System.in);
        empPayRollService.readEmpPayRollData(consoleInputReader);
        empPayRollService.writeEmpPayRollData();
    }
    private void readEmpPayRollData(Scanner consoleInputReader) {
        System.out.println("enter emp id");
        int id = consoleInputReader.nextInt();
        System.out.println("enter emp name");
        String name = consoleInputReader.next();
        System.out.println("enter emp salary");
        Double salary = consoleInputReader.nextDouble();
        empPayRollList.add(new EmpPayRollData(id, name,salary));
    }
    private void writeEmpPayRollData() {
        System.out.println("\nwriting emp pay roll list on console\n" + empPayRollList);
    }
}

