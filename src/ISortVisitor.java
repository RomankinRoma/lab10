
public interface ISortVisitor {
    void visitClerk(Clerk clerk);
    void visitEmployee(Employee employee);
    void sortedEmployees();
    void sortedClerks();
}
