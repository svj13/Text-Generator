package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import sample.Main;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ResourceBundle;

public class TextGeneratorController implements Initializable {


    @FXML
    private ComboBox<String> typeOfDesigner; //what best suits you?

    @FXML
    private VBox generatedQuestions;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    //Populate the combo box
        typeOfDesigner.getItems().addAll(
                "as a freelancer",
                "for a small studio",
                "for an agency"
        );

        //
        // Create an ActionListener for the JComboBox component.
        //

        typeOfDesigner.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FXMLLoader questionLoader = null;
                if (typeOfDesigner.getValue().equals("as a freelancer")) {
                    questionLoader = new FXMLLoader(getClass().getResource("freeLancer.fxml"));
                } else if (typeOfDesigner.getValue().equals("for an agency")) {
                    questionLoader = new FXMLLoader(getClass().getResource("agency.fxml"));
                } else if (typeOfDesigner.getValue().equals("for a small studio")) {
                    questionLoader = new FXMLLoader(getClass().getResource("smallStudio1.fxml"));
                }

                try {
                    generatedQuestions.getChildren().clear();
                    generatedQuestions.getChildren().add(questionLoader.load());
                }
                catch (Exception e) {
                    // Do nothing
                    e.printStackTrace();
                }


            }
        });



    }

}





