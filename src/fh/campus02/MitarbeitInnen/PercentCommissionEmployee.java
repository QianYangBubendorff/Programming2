package fh.campus02.MitarbeitInnen;

public class PercentCommissionEmployee extends Employee{
    protected double percentCommission;

    public PercentCommissionEmployee(String lastname, String firstname, String department, double baseSalary, double percentCommission) {
        super(lastname, firstname, department, baseSalary);
        this.percentCommission = percentCommission;
    }

    @Override
    public double getFullSalary() {
        return baseSalary+percentCommission*baseSalary;
    }
}
