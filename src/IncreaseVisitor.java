import java.util.ArrayList;
import java.util.Collections;

public class IncreaseVisitor implements IIncreaseVisitor {

    @Override
    public void visitClerkSalary(Clerk clerk) {
        clerk.setSalary(clerk.getYearsOfExpireance()>2 ? (int) (clerk.getSalary() * 1.15) : clerk.getSalary());
    }

    @Override
    public void visitEmployeeVacation(Employee employee) {
        employee.setVacationDays(employee.getYearsOfExpirience()>2 ? (employee.getVacationDays() + 4) : employee.getVacationDays());
    }

    @Override
    public void visitClerkVacation(Clerk clerk) {
        clerk.setVacationDays(clerk.getYearsOfExpireance()>2 ? (clerk.getVacationDays() + 2) : clerk.getVacationDays());
    }

    @Override
    public void visitEmployeeSalary(Employee employee) {
        employee.setSalary(employee.getYearsOfExpirience()>2 ? (int) (employee.getSalary() * 1.1) :employee.getSalary());
    }

}
