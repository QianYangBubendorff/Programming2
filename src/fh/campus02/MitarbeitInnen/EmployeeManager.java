package fh.campus02.MitarbeitInnen;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
    ArrayList<Employee> empList;

    public EmployeeManager() {
        empList = new ArrayList<>();
    }

    public double calcTotalSalary() {
        double sumSalary = 0;
        for (Employee e : empList) {
            sumSalary += e.getFullSalary();
        }
        return sumSalary;
    }

    public void addEmployee(Employee e) {
        empList.add(e);
    }

    public HashMap<String, Double> getSalaryByDepartment() {
        HashMap<String, Double> h = new HashMap<>();
        for (Employee e : empList) {
            if (!h.containsKey(e.department)) {
                h.put(e.department, e.getFullSalary());
            } else {
                double sumDepartmentSalary = 0;
                sumDepartmentSalary = h.get(e.department) + e.getFullSalary();
                h.put(e.department, sumDepartmentSalary);
            }
        }
        return h;
    }

}