package entities;

public class LegalPerson extends Person {

    private final Integer numberEmployees;

    public LegalPerson(String name, Double anualIncome, Integer numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    @Override
    public Double taxPaid() {
        if (numberEmployees <= 10) {
            return super.anualIncome * 0.16;
        } else {
            return super.anualIncome * 0.14;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
