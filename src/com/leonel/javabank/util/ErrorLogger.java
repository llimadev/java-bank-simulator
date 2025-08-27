package com.leonel.javabank.util;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.leonel.javabank.exception.AccountValidationException;


public class ErrorLogger {

    private static final String LOG_FOLDER_PATH = "./logs";
    private static final String LOG_FILE_PATH = "./logs/error_logs.csv";
    private static final String HEADER = "Timestamp,ErrorCode,OperatingSystem";

    public static void log(AccountValidationException e) {
        ensureLogFolderExists();
        ensureHeaderExists();

        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyy/dd/MM HH:mm:ss"));
        String os = System.getProperty("os.name") + " " + System
                .getProperty("os.version");
        String line = String.format("%s,%s,%s%n", timestamp, e
                .getErrorCode(), os);

        try (FileWriter writer = new FileWriter(LOG_FILE_PATH, true)) {
            writer.write(line);
        } catch (IOException ioException) {
            System.err.println("Failed to register error: " +
                    ioException.getMessage());
        }
    }

    private static void ensureLogFolderExists() {
        File folder = new File(LOG_FOLDER_PATH);
        if (!folder.exists()) {
            boolean created = folder.mkdirs();
            if (!created) {
                System.err.println("Failed to create log folder. " +
                        "Open the program with administrator privileges or check the path: "
                        + LOG_FOLDER_PATH);
            }
        }
    }

    private static void ensureHeaderExists() {
        File file = new File(LOG_FILE_PATH);
        if (!file.exists() || file.length() == 0) {
            try (FileWriter writer = new FileWriter(file, true)) {
                writer.write(HEADER + System.lineSeparator());
            } catch (IOException e) {
                System.err.println("Failed to create log file Header: " + e.getMessage());
            }
        }
    }
}