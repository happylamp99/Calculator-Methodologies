package ict.methodologies.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class CalcController {
    @FXML
    private Label expression;

    public void insertNumber(String number){
        expression.setText(expression.getText() + number);
    }

    public void insertOperator(String operator){
        expression.setText(expression.getText()+ " " + operator + " ");
    }


    public void onMouseClick(MouseEvent mouseEvent){
        Button button = (Button) mouseEvent.getSource();
        String buttonText= button.getText();

        switch(buttonText){
            case("1"):
            case("2"):
            case("3"):
            case("4"):
            case("5"):
            case("6"):
            case("7"):
            case("8"):
            case("9"):
            case("0"):
                insertNumber(buttonText);
                break;
            case("+"):
            case("-"):
            case("/"):
            case("*"):
                insertOperator(buttonText);
                break;
            case("DEL"):
            case("C"):


        }
    }

}
