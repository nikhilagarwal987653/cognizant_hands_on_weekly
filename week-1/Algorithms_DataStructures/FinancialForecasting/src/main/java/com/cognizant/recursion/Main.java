package com.cognizant.recursion;

public class Main {
    public static void main(String[] args) {
        double currentValue=1000;
        double growthRate=0.10;
        int years=3;

        double futureValue=FinancialForecast.futureValue(currentValue,growthRate,years);

        System.out.println("Current Value: " + currentValue);
        System.out.println("Growth Rate: " + growthRate);
        System.out.println("Years: " + years);
        System.out.println("Future value: " + futureValue);

    }
}
