package com.example.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Arrays;

public class HelloController {
    @FXML
    private Label resultatLabel;
    @FXML
    private Label entradaUsuariLabel;

    @FXML
    protected void on1BottonClick() {
        entradaUsuariLabel.setText(entradaUsuariLabel.getText() + "1");
    }

    @FXML
    protected void on2BottonClick() {
        entradaUsuariLabel.setText(entradaUsuariLabel.getText() + "2");
    }

    @FXML
    protected void on3BottonClick() {
        entradaUsuariLabel.setText(entradaUsuariLabel.getText() + "3");
    }

    @FXML
    protected void on4BottonClick() {
        entradaUsuariLabel.setText(entradaUsuariLabel.getText() + "4");
    }

    @FXML
    protected void on5BottonClick() {
        entradaUsuariLabel.setText(entradaUsuariLabel.getText() + "5");
    }

    @FXML
    protected void on6BottonClick() {
        entradaUsuariLabel.setText(entradaUsuariLabel.getText() + "6");
    }

    @FXML
    protected void on7BottonClick() {
        entradaUsuariLabel.setText(entradaUsuariLabel.getText() + "7");
    }

    @FXML
    protected void on8BottonClick() {
        entradaUsuariLabel.setText(entradaUsuariLabel.getText() + "8");
    }

    @FXML
    protected void on9BottonClick() {
        entradaUsuariLabel.setText(entradaUsuariLabel.getText() + "9");
    }

    @FXML
    protected void onEqualsBottonClick() {
        try {
            String[] elementsSeparats;
            String operacio = entradaUsuariLabel.getText();
            elementsSeparats = operacio.split(" ");

            double resultat = 0;
            double num1 = Double.parseDouble(elementsSeparats[0]);
            if (elementsSeparats.length == 1) {
                resultat = num1;
            }else {
                double num2 = Double.parseDouble(elementsSeparats[2]);

                switch (elementsSeparats[1]) {
                    case "+" -> resultat = num1 + num2;
                    case "-" -> resultat = num1 - num2;
                    case "*" -> resultat = num1 * num2;
                    case "/" -> resultat = num1 / num2;
                }
            }

            resultatLabel.setText(String.valueOf(resultat));
        }catch (Exception e){
            resultatLabel.setText("Syntax Error");
        }
    }

    @FXML
    protected void onSumaBottonClick() {
        try {
            entradaUsuariLabel.setText(entradaUsuariLabel.getText() + " + ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onRestaBottonClick() {
        try {
            entradaUsuariLabel.setText(entradaUsuariLabel.getText() + " - ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onMultiplicarBottonClick() {
        try {
            entradaUsuariLabel.setText(entradaUsuariLabel.getText() + " * ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onDividirBottonClick() {
        try {
            entradaUsuariLabel.setText(entradaUsuariLabel.getText() + " / ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onComaBottonClick() {
        entradaUsuariLabel.setText(entradaUsuariLabel.getText() + ".");
    }

    @FXML
    protected void on0BottonClick() {
        entradaUsuariLabel.setText(entradaUsuariLabel.getText() + "0");
    }

    @FXML
    protected void onCBottonClick() {
        entradaUsuariLabel.setText("");
        resultatLabel.setText("");
    }
}