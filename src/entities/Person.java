package entities;

public abstract class Person {

    public String name;
    public Double anualIncome;

    public Person(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public abstract Double taxPaid();

    public String toString() {
        return name + ": $ " + String.format("%.2f", taxPaid());
    }
}
