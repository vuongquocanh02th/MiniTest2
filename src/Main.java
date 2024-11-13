public class Main {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement(10);

        // Them nhan vien full time
        FullTimeEmployee emp1 = new FullTimeEmployee("NV01", "Nguyen Van A", 30, 923456789, "a@example.com", 500, 20000, 5000);
        FullTimeEmployee emp2 = new FullTimeEmployee("NV02", "Tran Thi B", 25, 117654321, "b@example.com", 60000, 30000, 7000);
        management.addEmployee(emp1);
        management.addEmployee(emp2);

        // Them nhan vien part time
        PartTimeEmployee emp3 = new PartTimeEmployee("NV03", "Le Thi C", 22, 123984567, "c@example.com", 8);
        PartTimeEmployee emp4 = new PartTimeEmployee("NV04", "Pham Hoang D", 20, 987234599, "d@example.com", 7);
        management.addEmployee(emp3);
        management.addEmployee(emp4);

        // Tinh TB luong
        double wageAvg = management.calWageAvg();
        System.out.println("Luong trung binh toan bo nhan vien: " + wageAvg);

        // Liet ke nhan vien full time luong thap hon trung binh
        management.listFullTimeWageLessThanAvg();

        // tinh tong luong phai tra cho nv part-time
        double totalWagePartTime = management.calTotalWagePartTime();
        System.out.println("Tong luong phai tra NV part-time: " + (long) totalWagePartTime);
    }
}
