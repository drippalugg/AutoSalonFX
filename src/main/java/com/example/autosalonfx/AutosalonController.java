package com.example.autosalonfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class AutosalonController {
    @FXML
    private TableView<?> carTable;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private void initialize() {
        addButton.setOnAction(event -> System.out.println("Добавление авто"));
        deleteButton.setOnAction(event -> System.out.println("Удаление авто"));
    }
}