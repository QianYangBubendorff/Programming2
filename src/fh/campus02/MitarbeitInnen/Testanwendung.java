package fh.campus02.MitarbeitInnen;

public class Testanwendung {
    public static void main(String[] args) {
        Employee e=new Employee("An","Mei","IT", 2000.20);
        FixComissionEmployee f=new FixComissionEmployee("Assman","Jackie","IT",3500.20,300.0);
        PercentCommissionEmployee p=new PercentCommissionEmployee("Cheng","Jun","HR",2500.20,0.10);
        EmployeeManager m=new EmployeeManager();
        m.addEmployee(e);
        m.addEmployee(f);
        m.addEmployee(p);
        System.out.println(m.calcTotalSalary());
        System.out.println(m.getSalaryByDepartment());

    }


}
