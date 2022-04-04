package fh.campus02;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<Employee>();

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
            if (emp.getDepartment() == department) {
                list.add(emp);
            }
        }
        return list;
    }

    public Employee findByMaxSalary() {
        int index = 0;
        double max = (employees.get(0)).getSalary();

//        for(int i=1; i<employees.size(); i++){
//                if(max<(employees.get(i)).getSalary()){
//                    m
//                    index=i;
//                }
//            }
        for (Employee emp : employees) {
            if (max < emp.getSalary()) {
                index = employees.indexOf(emp);
                max=emp.getSalary();
            }

        }
        return employees.get(index);
    }
}