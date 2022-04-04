package fh.campus02;

import java.util.ArrayList;

public class DemoEmp {
    public static void main(String[] args) {
        EmployeeManager manager1= new EmployeeManager();
//        ArrayList<Employee> arr= new ArrayList<>();
        Employee employee1= new Employee(123,"Laura", 2300.40, "Sales");
        Employee employee2= new Employee(145,"Lucy", 2600.40, "R&D");
        Employee employee3= new Employee(193,"Lee", 2500.40, "Sales");
        manager1.addEmployee(employee1);
        manager1.addEmployee(employee2);
        manager1.addEmployee(employee3);

        System.out.println(manager1.findByEmpNumber(123));
        System.out.println(manager1.findByDepartment("Sales"));
        System.out.println(manager1.findByMaxSalary());

    }
}
