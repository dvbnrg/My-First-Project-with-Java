package calculator;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Prices:");
//        System.out.println("Bubblegum: $2");
//        System.out.println("Toffee: $0.2");
//        System.out.println("Ice Cream: $5");
//        System.out.println("Milk Chocolate: $4");
//        System.out.println("Doughnut: $2.5");
//        System.out.println("Pancake: $3.2");
//        System.out.println();
        System.out.println("Earned amount:");
        Integer bubblegum = 202;
        System.out.println("Bubblegum: $" + bubblegum);
        Integer toffee = 118;
        System.out.println("Toffee: $" + toffee);
        Integer iceCream = 2250;
        System.out.println("Ice Cream: $" + iceCream);
        Integer milkChocolate = 1680;
        System.out.println("Milk Chocolate: $" + milkChocolate);
        Integer doughnut = 1075;
        System.out.println("Doughnut: $" + doughnut);
        Integer pancake = 80;
        System.out.println("Pancake: $" + pancake);
        int income = bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;
        System.out.println("Income: $" + income + ".0");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Staff Expenses:");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other Expenses:");
        int otherExpenses = scanner.nextInt();
//        System.out.println("Total Expenses: $" + (staffExpenses + otherExpenses) + ".0");
        System.out.println("Net income: $" + (income - staffExpenses - otherExpenses) + ".0");
    }
}