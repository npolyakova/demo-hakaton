package com.example.demo;

import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.PreparedStatement;

public class DataHandler {

    public static void readData() {
        // Чтение CSV-файла
//        CSVReader reader = new CSVReader(new BufferedReader(new FileReader("path/to/file.csv")));
//        String[] nextLine;
//        while ((nextLine = reader.readNext()) != null) {
//            // Преобразование данных CSV в объект
//            MyData data = new MyData();
//            data.setName(nextLine[0]);
//            data.setAge(Integer.parseInt(nextLine[1]));
//        }
//        reader.close();
//        writeData();
    }

    private static void writeData() {
        // Запись данных в базу
//        PreparedStatement statement = connection.prepareStatement("INSERT INTO my_table (name, age) VALUES (?, ?)");
//        statement.setString(1, data.getName());
//        statement.setInt(2, data.getAge());
//        int rowsAffected = statement.executeUpdate();
//
//        if (rowsAffected == 0) {
//            System.out.println("Ошибка при записи данных в БД.");
//        }
    }
}
