package com.techelevator;

import java.awt.print.PrinterAbortException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {

    public Log() {
    }


    public static void writeToFile(File actionLog, double currentMoney, double updatedMoney, String action) {
            try {
                    PrintWriter writer = new PrintWriter(new FileOutputStream(actionLog.getAbsoluteFile(), true));
                    LocalDateTime dateTime = LocalDateTime.now();
                    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
                    String dateTimeFormatted = dateTime.format(dateFormatter);
                    writer.append(dateTimeFormatted + " " + action + " $" + updatedMoney + " $" + currentMoney + "\n");
                    writer.flush();
                    writer.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }
    }


