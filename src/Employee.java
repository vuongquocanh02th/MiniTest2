public abstract class Employee {
    private String empCode;
    private String empName;
    private int age;
    private long phoneNumber;
    private String eMail;

    public Employee(String empCode, String empName, int age, long phoneNumber, String eMail) {
        this.empCode = empCode;
        this.empName = empName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    // Abstract method
    public abstract double calWage();

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
