package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        // TODO: Implement method
        double minimumcharge = 18.84;
        double ccf = 748;

        if (gallonsUsage <= (2*ccf)) {
            return minimumcharge;
        } else {
            double extra = gallonsUsage - (2*ccf);
            double totalcost = Math.ceil(extra /ccf) * 3.90;
            return minimumcharge + totalcost;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
