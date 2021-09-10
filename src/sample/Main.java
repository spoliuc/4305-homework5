package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.*;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception{

        //set labels
        Label name = new Label("Name: ");
        Label street = new Label("Street: ");
        Label city = new Label("City: ");
        Label state = new Label("State: ");
        Label zip = new Label("Zip: ");
        Label chooseOne = new Label("Choose One: ");
        Label musicType = new Label("Type of Music: ");
        Label appType = new Label("Type of App: ");
        Label enterTitle = new Label("Enter Title: ");
        Label purchaseDate = new Label("Date Purchased: ");
        Label accNumber = new Label("Account Number: ");

        //creating checkboxes
        CheckBox cb1 = new CheckBox("APP");
        CheckBox cb2 = new CheckBox("MUSIC");
        HBox checkHBox=new HBox(cb1,cb2);

        //creating text fields
        TextField field1 = new TextField();
        TextField field2 = new TextField();
        TextField field3 = new TextField();
        TextField field4 = new TextField();
        TextField field5 = new TextField();
        TextField field6 = new TextField();
        TextField field7 = new TextField();
        TextField field8 = new TextField();

        //creating combobox
        ComboBox<String> dropdown = new ComboBox<String>();
        dropdown.setPromptText("Choose one: ");
        ObservableList<String> list = dropdown.getItems();

        //adding to dropdown
        list.add("Pop");
        list.add("Rock");
        list.add("Hip Hop");


        //radio button setup
        ToggleGroup buttonGroup = new ToggleGroup();
        RadioButton gameToggle = new RadioButton("GAME");
        RadioButton prodToggle = new RadioButton("PRODUCTIVITY");
        RadioButton eduToggle = new RadioButton("EDUCATION");
        gameToggle.setToggleGroup(buttonGroup);
        prodToggle.setToggleGroup(buttonGroup);
        eduToggle.setToggleGroup(buttonGroup);
        HBox buttonBox=new HBox(gameToggle,prodToggle,eduToggle);

        //last two action buttons
        Button bSubmit = new Button("Submit");
        Button bFinish = new Button("Finish");



        //drawing actual UI elements
        GridPane root = new GridPane();
        root.addRow(0, name, field1);
        root.addRow(1, street, field2);
        root.addRow(2, city,field3);
        root.addRow(3, state,field4);
        root.addRow(4, zip,field5);

        root.addRow(5, chooseOne,checkHBox);
        root.addRow(6, musicType,dropdown);
        root.addRow(7,appType,buttonBox);
        root.addRow(8,enterTitle,field6);
        root.addRow(9,purchaseDate,field7);
        root.addRow(10,accNumber,field8);
        root.addRow(11,bSubmit,bFinish);

        Scene mavScene = new Scene(root,360,360);
        primaryStage.setScene(mavScene);
        primaryStage.setTitle("Mav Tunes");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
