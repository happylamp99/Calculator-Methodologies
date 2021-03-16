package ict.methodologies;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Stage historyStage=null;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("calcForm.fxml"));
        stage.setTitle("Calc");
        stage.setScene(new Scene(root));
        stage.show();
        createHistoryStage();
    }

    public void createHistoryStage(){
        historyStage=new Stage();
        historyStage.setTitle("Calculation History");
        historyStage.setAlwaysOnTop(true);
        historyStage.setResizable(false);
        historyStage.initModality(Modality.APPLICATION_MODAL);
    }

    public static Stage getHistoryStage(){
        return historyStage;
    }
    public static void main(String[] args) {
        launch();
    }

}