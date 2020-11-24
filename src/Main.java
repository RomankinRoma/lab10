public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Name2", 60000, 10, 1);
        Employee employee2 = new Employee("Name1", 70000, 20, 2);
        Employee employee3 = new Employee("Name3", 80000, 30, 3);
        Clerk clerk1 = new Clerk("Name1", 60000, 10, 1);
        Clerk clerk2 = new Clerk("Name2", 70000, 20, 2);
        Clerk clerk3 = new Clerk("Name3", 80000, 30, 3);

        IncreaseVisitor increaseVisitor = new IncreaseVisitor();
        SortVisitor sortVisitor = new SortVisitor();

        sortVisitor.visitClerk(clerk1);
        sortVisitor.visitClerk(clerk2);
        sortVisitor.visitClerk(clerk3);
        sortVisitor.visitEmployee(employee1);
        sortVisitor.visitEmployee(employee2);
        sortVisitor.visitEmployee(employee3);

        System.out.println("-----------Before-----------");
        System.out.println("Clerks");
        for (Clerk clerk : sortVisitor.getClerks())
            System.out.println(clerk.toString());
        System.out.println();
        System.out.println("Employees");
        for (Employee employee : sortVisitor.getEmployees()) {
            System.out.println(employee.toString());
        }
        System.out.println();
        System.out.println("------------After------------");
        sortVisitor.sortedEmployees();
        sortVisitor.sortedClerks();

        //Тут можно было всех работников собрать в массив и пробегатся по нему
        // и звать функции Accept для двух посетителей но я решил просто собрать их сперва в массивы в сорт
        System.out.println();
        System.out.println("Clerks");
        for (Clerk clerk : sortVisitor.getClerks()) {
            clerk.Accept(increaseVisitor);
            System.out.println(clerk.toString());
        }
        System.out.println();
        System.out.println("Employees");
        for (Employee employee : sortVisitor.getEmployees()) {
            employee.Accept(increaseVisitor);
            System.out.println(employee.toString());
        }
    }
}
