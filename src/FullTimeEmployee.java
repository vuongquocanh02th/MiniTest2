public class FullTimeEmployee extends Employee {
    private double fixedWage;
    private double bonusWage;
    private double fineWage;

    public FullTimeEmployee(String empCode, String empName, int age, long phoneNumber, String eMail,
                            double fixedWage, double bonusWage, double fineWage) {
        super(empCode, empName, age, phoneNumber, eMail);
        this.fixedWage = fixedWage;
        this.bonusWage = bonusWage;
        this.fineWage = fineWage;
    }

    @Override
    public double calWage() {
        return fixedWage + (bonusWage - fineWage);
    }

    public double getFixedWage() {
        return fixedWage;
    }

    public void setFixedWage(double fixedWage) {
        this.fixedWage = fixedWage;
    }

    public double getBonusWage() {
        return bonusWage;
    }

    public void setBonusWage(double bonusWage) {
        this.bonusWage = bonusWage;
    }

    public double getFineWage() {
        return fineWage;
    }

    public void setFineWage(double fineWage) {
        this.fineWage = fineWage;
    }
}

