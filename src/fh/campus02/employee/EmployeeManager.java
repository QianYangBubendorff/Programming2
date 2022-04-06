package fh.campus02.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private ArrayList<Employee> employees;// = new ArrayList<>();

    public EmployeeManager(){
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Employee findByEmpNumber(int number) {
        for (Employee emp : employees) {
            if (number == emp.getEmpNumber()) {
                return emp;
            }
        }
        return null;
    }

    public ArrayList<Employee> findByDepartment(String department) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getDepartment().equals(department)) {
                list.add(emp);
            }
        }
        return list;
    }

//    two different methods, one with index and the other one with a null object to compare.
    public Employee findByMaxSalary() {
        int index = 0;
//        Employee highestE = null;
        double max = (employees.get(0)).getSalary();
//        double max = 0;

//        for(Employee e : employess){
//                if(max<e.getSalary()){
//                    max = e.getSalary();
//                    highestE = e;
//                }
//            }
        for (Employee emp : employees) {
            if (max < emp.getSalary()) {
                max=emp.getSalary();
                index = employees.indexOf(emp);
            }

        }
        return employees.get(index);
    }
}