package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.example.demo.DataHandler.readData;

@RestController
public class DataController {

    @PostMapping("/getData")
    public void uploadData(@RequestBody File data) throws SQLException {
        // Установление соединения с базой данных
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydatabase", "myuser", "secret");

        readData();

        connection.close();
    }
}
