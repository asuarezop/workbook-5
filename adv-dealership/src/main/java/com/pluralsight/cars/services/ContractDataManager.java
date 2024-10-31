package com.pluralsight.cars.services;

import com.pluralsight.cars.models.Contract;
import java.io.BufferedWriter;
import java.io.IOException;

public class ContractDataManager {
    //String variable to hold contract CSV file path
    private static final String contractCSV = "src/main/resources/contracts.csv";


    public static void saveContract(Contract c) {

        try {
            BufferedWriter bufWriter = FileHandler.getBufferedWriter(contractCSV);

            bufWriter.write(String.format("%s|%s|%s|%s", "SALE", c.getDate(), c.getCustomerName(), c.getCustomerEmail(), c.getVehicleSold()));

        } catch (IOException e) {
//            throw new IOException(e);
        }
    }
}
