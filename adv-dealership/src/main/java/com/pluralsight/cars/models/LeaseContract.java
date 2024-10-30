package com.pluralsight.cars.models;

public class LeaseContract extends Contract {
    private double expectedEndValue;
    private double leaseFee;
    private double monthlyPayment;

    public LeaseContract(String date, String customerName, String customerEmail, boolean vehicleSold) {
        super(date, customerName, customerEmail, vehicleSold);
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
