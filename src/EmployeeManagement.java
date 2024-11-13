public class EmployeeManagement {
    private Employee[] listEmployee;
    private int countEmp; // So nv hien tai

    public EmployeeManagement(int maxSize) {
        this.listEmployee = new Employee[maxSize];
        this.countEmp = 0;
    }

    // Them nhan vien vao danh sach
    public void addEmployee(Employee emp) {
        if (countEmp < listEmployee.length) {
            listEmployee[countEmp++] = emp;
        } else {
            System.out.println("Khong the them, danh sach da day");
        }
    }

    // Tinh trung binh luong
    public double calWageAvg() {
        double tongLuong = 0;
        for (int i = 0; i < countEmp; i++) {
            tongLuong += listEmployee[i].calWage();
        }
        return countEmp > 0 ? tongLuong / countEmp : 0;
    }

    // Liet ke nhan vien full time luong thap hon TB
    public void listFullTimeWageLessThanAvg() {
        double wageAvg = calWageAvg();
        System.out.println("Nhan vien full time co luong thap hon trung binh:");
        for (int i = 0; i < countEmp; i++) {
            if (listEmployee[i] instanceof FullTimeEmployee) {
                FullTimeEmployee emp = (FullTimeEmployee) listEmployee[i];
                if (emp.calWage() < wageAvg) {
                    System.out.println(emp.getEmpName() + " - Luong: " + emp.calWage());
                }
            }
        }
    }

    // Tinh tong luong phai tra cho nv part-time
    public double calTotalWagePartTime() {
        double totalWage = 0;
        for (int i = 0; i < countEmp; i++) {
            if (listEmployee[i] instanceof PartTimeEmployee) {
                totalWage += listEmployee[i].calWage();
            }
        }
        return totalWage;
    }
}
