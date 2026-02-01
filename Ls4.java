public class Ls4 {
    public static class Employee {
        private String id, name;
        private double salary;
        public Employee(String id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public void displayInfo() {
            System.out.println("Mã nhân viên: " + id );
            System.out.println("Tên nhân viên: " + name );
            System.out.println("Lương: " + salary );
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("E01", "Trần Thị B", 12000000);
        emp1.displayInfo();
    }
}