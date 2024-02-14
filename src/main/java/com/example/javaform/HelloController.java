package com.example.javaform;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class HelloController {

    InternalEmployee internalEmployee;
    ExternalEmployee externalEmployee;
    @FXML
    TextArea textArea = new TextArea();

    @FXML
    protected void getInternalEmployee() {
        textArea.clear();
        internalEmployee = new InternalEmployee("Celeste", "Monter", "123", "123-456-678", "ABC");

        textArea.setText(
                "Nombre:" + internalEmployee.name + "\n" +
                        "Apellido:" + internalEmployee.lastname + "\n" +
                        "ID:" + internalEmployee.id + "\n" +
                        "Telefono:" + internalEmployee.phone + "\n" +
                        "Posicion:" + internalEmployee.position
        );
    }

    @FXML
    protected void getExternalEmployee() {
        textArea.clear();
        externalEmployee = new ExternalEmployee("Carlos", "Alvarado", "456", "qwerty");
        textArea.setText(
                "Nombre:" + externalEmployee.name + "\n" +
                        "Apellido:" + externalEmployee.lastname + "\n" +
                        "ID:" + externalEmployee.id + "\n" +
                        "Company:" + externalEmployee.company + "\n"
        );
    }

    @FXML
    protected void clearTextArea() {
        textArea.clear();
    }


}