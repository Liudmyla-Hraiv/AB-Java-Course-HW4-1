package com.company;

public class Main {

    public static void main(String[] args) {
        EmployeeNamePrinter namePrinter = new EmployeeNamePrinter();
        EmployeeSalaryPrinter salaryPrinter = new EmployeeSalaryPrinter();

//        Employee employee1 = new Employee("Ivan", "Ivanov", 25, "AQA", 400,POSITION.JUNIOR);
//        namePrinter.print(employee1);
//        salaryPrinter.print(employee1);
//        System.out.println("_____________________");
//        Employee employee2 = new Employee("", "", -40, "AQA", -40, POSITION.SENIOR);
//        namePrinter.print(employee2);
//        salaryPrinter.print(employee2);
//        System.out.println("_____________________");
//        Employee employee3 = new Employee( "Gleb", "Popov", 25, "AQA", POSITION.MIDDLE);
//        namePrinter.print(employee3);
//        salaryPrinter.print(employee3);
//        System.out.println("_____________________");


        Employee[] employees = new Employee[3];
        employees[0]= new Employee("Sasha", "Petrov", 30, "AQA", POSITION.JUNIOR);
        employees[1] = new Employee("Igor", "Astakhov", 45, "QML/JS Developer", POSITION.SENIOR);
        employees[2] = new Employee("Taras", "Sheva", 45, "Market", POSITION.SENIOR_POMIDOR);

//       for (int index = 0; index <employees.length; index++){
         for (Employee employee : employees){
           namePrinter.print(employee);
           salaryPrinter.print(employee);
           System.out.println("_____________________");
       }
    }
}
