package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label operacioText;
    @FXML

    private double resultat;
    private double numero1;
    private double numero2;


    @FXML
    protected void on1BottonClick(){
        operacioText.setText(operacioText.getText()+"1");
    }
    @FXML
    protected void on2BottonClick(){
        operacioText.setText(operacioText.getText()+"2");
    }
    @FXML
    protected void on3BottonClick(){
        operacioText.setText(operacioText.getText()+"3");
    }
    @FXML
    protected void on4BottonClick(){
        operacioText.setText(operacioText.getText()+"4");
    }
    @FXML
    protected void on5BottonClick(){
        operacioText.setText(operacioText.getText()+"5");
    }
    @FXML
    protected void on6BottonClick(){
        operacioText.setText(operacioText.getText()+"6");
    }
    @FXML
    protected void on7BottonClick(){
        operacioText.setText(operacioText.getText()+"7");
    }
    @FXML
    protected void on8BottonClick(){
        operacioText.setText(operacioText.getText()+"8");
    }
    @FXML
    protected void on9BottonClick(){
        operacioText.setText(operacioText.getText()+"9");
    }
    @FXML
    protected void onEqualsBottonClick(){
        operacioText.setText(String.valueOf(resultat));
    }
    @FXML
    protected void onSumaBottonClick(){
        try{
            if (operacioText.getText().charAt(operacioText.getText().length()-1) !='+' || operacioText.getText().charAt(operacioText.getText().length()-1) !='-' || operacioText.getText().charAt(operacioText.getText().length()-1) !='*' || operacioText.getText().charAt(operacioText.getText().length()-1) !='/' || operacioText.getText().charAt(operacioText.getText().length()-1) !='.'){
                numero1 = Double.parseDouble(operacioText.getText());
                operacioText.setText(operacioText.getText()+" + ");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    protected void onRestaBottonClick(){
        operacioText.setText(operacioText.getText()+"-");
    }
    @FXML
    protected void onMultiplicarBottonClick(){
        operacioText.setText(operacioText.getText()+"*");
    }
    @FXML
    protected void onDividirBottonClick(){
        operacioText.setText(operacioText.getText()+"/");
    }
    @FXML
    protected void onComaBottonClick(){
        operacioText.setText(operacioText.getText()+".");
    }
    @FXML
    protected void on0BottonClick() {
        operacioText.setText(operacioText.getText()+"0");
    }
    @FXML
    protected void onCBottonClick() {
        operacioText.setText("");
        resultat = 0;
    }
}