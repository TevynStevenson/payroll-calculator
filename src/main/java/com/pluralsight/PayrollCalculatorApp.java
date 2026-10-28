package com.pluralsight;

//Import scanner
//Import FileReader and BufferedReader

import java.util.*;
import java.io.*;


public class PayrollCalculatorApp {
    public static void main(String[] args) {

        //Try to keep main method clean
        //Run methods from outside main

        //Initialize FileReader and BufferedReader
        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            bufferedReader.readLine();

            String line = bufferedReader.readLine();


            //Add while loops for reading the file
            //!= will run until it is equal to (null)---> there is no more data left
            while (line != null) {

            //Split the String[]-->list, by the way it's split in the file |--> "Pipe"
                String[] fields = line.split("\\|");

                String id = fields[0];
                String name = fields[1];
                double hoursWorked = Double.parseDouble(fields[2]);
                double payRate = Double.parseDouble(fields[3]);

                double grossPay = hoursWorked * payRate;


            //Get system to print out Employee, Id, Name, and Grosspay.
            //Keep this inside the while loop

                System.out.print("=====Employee===== \n");
                System.out.printf("Id: %s\n", id);
                System.out.printf("Name: %s\n", name);
                System.out.printf("Gross Pay: $%.2f%n\n", grossPay);

            //Use to go to the next line of the bufferedreader
                line = bufferedReader.readLine();

            }

            //Close the reader
            bufferedReader.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

}





