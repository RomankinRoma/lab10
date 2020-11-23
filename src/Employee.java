public class Employee implements  IWorker {
    private String name;
    private int salary;
    private int vacationDays;
    private int yearsOfExpirience;

    public Employee(String name, int salary, int vacationDays, int yearsOfExpirience) {
        this.name = name;
        this.salary = salary;
        this.vacationDays = vacationDays;
        this.yearsOfExpirience = yearsOfExpirience;
    }

    public int getYearsOfExpirience() {
        return yearsOfExpirience;
    }

    public void setYearsOfExpirience(int yearsOfExpirience) {
        this.yearsOfExpirience = yearsOfExpirience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    @Override
    public void Accept(IIncreaseVisitor iIncreaseVisitor) {
        iIncreaseVisitor.visitEmployeeSalary(this);
        iIncreaseVisitor.visitEmployeeVacation(this);
    }

    @Override
    public void Accept(ISortVisitor iSortVisitor) {
        iSortVisitor.visitEmployee(this);
    }

    @Override
    public String toString() {
        return "Name:"+getName()+"\nSalary:"+getSalary()+"\nVacation days:"+getVacationDays()+"\nExp:"+getYearsOfExpirience();
    }
}
