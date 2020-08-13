package application;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i ++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c) ? ");
            char answer = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if (answer == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                personList.add(new PhysicalPerson(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                personList.add(new LegalPerson(name, annualIncome, numberEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double sum = 0.0;

        for (Person person : personList) {
            System.out.println(person);
            sum += person.taxPaid();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", sum);

        sc.close();
    }
}
