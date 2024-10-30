package com.pluralsight.cars.models;

public class SalesContract extends Contract {
    private final double salesTax = 0.05;
    private final int recordingFee = 100;
    private int processingFee;
    private boolean isFinanced;
    private double monthlyPayment;

    public SalesContract(String date, String customerName, String customerEmail, boolean vehicleSold) {
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
