package com.pluralsight.cars.models;

public class LeaseContract extends Contract {
    private final double expectedEndValue = 0.50;
    private final double leaseFee = 0.07;
    private double monthlyPayment;

    public LeaseContract(String date, String customerName, String customerEmail, Vehicle vehicleSold) {
        super(date, customerName, customerEmail, vehicleSold);
    }

    public double getExpectedEndValue() {
        return expectedEndValue * getVehicleSold().getPrice();
    }

    public double getLeaseFee() {
        return leaseFee * getVehicleSold().getPrice();
    }

    @Override
    public double getTotalPrice() {
        return getExpectedEndValue() + getLeaseFee() + 100.00;
    }

    @Override
    public double getMonthlyPayment() {
        //Interest rate = 4/2400 --> 0.0017 rounded
        double interestRate = 0.0017;
        //In months
        int leaseTerm = 36;

        //Math may be off - (MSRP for vehicle * interestRate) + (totalPrice of contract with fees / lease duration)
        return (getVehicleSold().getPrice() * interestRate) + (getTotalPrice() / leaseTerm);
    }

    @Override
    public String toString() {
        return String.format("%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%.2f|%.2f|%.2f|%.2f|%.2f", "LEASE", getDate(), getCustomerName(), getCustomerEmail(), getVehicleSold().getVin(), getVehicleSold().getYear(), getVehicleSold().getMake(), getVehicleSold().getModel(), getVehicleSold().getVehicleType(), getVehicleSold().getColor(), getVehicleSold().getOdometer(), getVehicleSold().getPrice(), getExpectedEndValue(), getLeaseFee(), getTotalPrice(), getMonthlyPayment());
    }
}
