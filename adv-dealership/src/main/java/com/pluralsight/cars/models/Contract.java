package com.pluralsight.cars.models;

//Abstract Contract Class - cannot be used to instantiate a new object
public abstract class Contract {
    private String date;
    private String customerName;
    private String customerEmail;
    private boolean vehicleSold;
    private double totalPrice;
    private double monthlyPayment;

    protected Contract(String date, String customerName, String customerEmail, boolean vehicleSold) {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public boolean isVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(boolean vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    //Subclasses have to provide their own implementation of each of these abstract methods
    public abstract double getTotalPrice();
    public abstract double getMonthlyPayment();
}
