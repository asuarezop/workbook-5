package com.pluralsight.cars.services;

import java.io.BufferedWriter;
import java.io.IOException;

public class ContractDataManager {
    //String variable to hold contract CSV file path
    private static final String contractCSV = "src/main/resources/contracts.csv";


    public static void saveContract() {

        try {
            BufferedWriter bufWriter = FileHandler.getBufferedWriter(contractCSV);

        } catch (IOException e) {
//            throw new IOException(e);
        }
    }
}
