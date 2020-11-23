
public class Clerk implements IWorker {
    private String name;
    private int yearsOfExpireance;
    private int salary;
    private int vacationDays;

    public Clerk(String name, int salary, int vacationDays, int yearsOfExpireance) {
        this.name = name;
        this.yearsOfExpireance = yearsOfExpireance;
        this.salary = salary;
        this.vacationDays = vacationDays;
    }

    public int getYearsOfExpireance() {
        return yearsOfExpireance;
    }

    public void setYearsOfExpireance(int yearsOfExpireance) {
        this.yearsOfExpireance = yearsOfExpireance;
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

    public void setVacationDays(Integer vacationDays) {
        this.vacationDays = vacationDays;
    }

    @Override
    public void Accept(IIncreaseVisitor iIncreaseVisitor) {
        iIncreaseVisitor.visitClerkSalary(this);
        iIncreaseVisitor.visitClerkVacation(this);
    }

    @Override
    public void Accept(ISortVisitor iSortVisitor) {
        iSortVisitor.visitClerk(this);

    }

    @Override
    public String toString() {
        return "Name:" + getName() + "\nSalary:" + getSalary() + "\nVacation days:" + getVacationDays() + "\nExp:" + getYearsOfExpireance();
    }
}
