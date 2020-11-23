public interface IIncreaseVisitor {
    void visitEmployeeSalary(Employee employee);
    void visitClerkSalary(Clerk clerk);
    void visitEmployeeVacation(Employee employee);
    void visitClerkVacation(Clerk clerk);
}
