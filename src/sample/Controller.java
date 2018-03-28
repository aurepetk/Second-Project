package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.util.InputMismatchException;
import java.util.Random;

public class Controller {

    @FXML
    private TextField numberTextField;

    @FXML
    private Label answerLabel;

    public void tryMe (javafx.event.ActionEvent event){
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(10) + 1;
        try {
            int guessNumber = Integer.valueOf(numberTextField.getText());
            if (rndNumber == guessNumber) {
                answerLabel.setText("ATSPEJOTE!!! :) Generuotas skaicius buvo " + rndNumber + ". Jusu spejimas buvo " + guessNumber + ".");
            } else {
                answerLabel.setText("NOP! :P Sugeneruotas skaicius buvo " + rndNumber + ". Jusu spetas skaicius buvo " + guessNumber + ".");
            }
            numberTextField.setText("");
        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Ka cia darai? O_o");
            alert.show();
        }
    }


}
