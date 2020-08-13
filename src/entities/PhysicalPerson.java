package entities;

public class PhysicalPerson extends Person {

    private final Double healthExpenditure;

    public PhysicalPerson(String name, Double anualIncome, Double healthExpenditure) {
        super(name, anualIncome);
        this.healthExpenditure = healthExpenditure;
    }

    @Override
    public Double taxPaid() {
        if (super.anualIncome < 20.000) {
            return super.anualIncome * 0.15 - healthExpenditure / 2;
        } else {
            return super.anualIncome * 0.25 - healthExpenditure / 2;
        }
    }

    public String toString() {
        return super.toString();
    }
}
