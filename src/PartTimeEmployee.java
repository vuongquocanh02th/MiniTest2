public class PartTimeEmployee extends Employee {
    private int workHours;

    public PartTimeEmployee(String empCode, String empName, int age, long phoneNumber, String eMail, int workHours) {
        super(empCode, empName, age, phoneNumber, eMail);
        this.workHours = workHours;
    }

    @Override
    public double calWage() {
        return workHours * 100;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}
