import java.util.ArrayList;

public class SortVisitor implements ISortVisitor {

    ArrayList<Employee> employees;
    ArrayList<Clerk> clerks;

    public SortVisitor() {
        this.employees = new ArrayList<>();
        this.clerks = new ArrayList<>();
    }

    @Override
    public void visitClerk(Clerk clerk) {
        clerks.add(clerk);
    }

    @Override
    public void visitEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void sortedEmployees() {
        employees.sort(this::compare);
    }

    @Override
    public void sortedClerks() {
        clerks.sort(this::compare);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Clerk> getClerks() {
        return clerks;
    }

    public int compare(Clerk clerk1, Clerk clerk2) {
        return clerk1.getSalary() - clerk2.getSalary();
    }

    public int compare(Employee employee1, Employee employee2) {
        return employee1.getSalary() - employee2.getSalary();
    }
}
