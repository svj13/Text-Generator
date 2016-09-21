package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.MessageFormat;

/**
 * Created by Sarah on 11/09/2016.
 */
public class FreeLancer {


    @FXML
    private TextField userName; //what is your name

    @FXML
    private TextField based; //where are you based

    @FXML
    private TextArea experienceGained;

    @FXML
    private TextField yearsExperience;

    @FXML
    private TextArea skills; //what skills do you have

    @FXML
    private TextArea fuelsWork; //what fuels your work

    @FXML
    private TextArea paragraph; //main paragraph to generate

    @FXML
    private Button clearDataButton;

    @FXML
    private Button createParagraphButton;

    /**
     * When the create paragraph button is clicked, generates the paragraph
     * @param event
     */
    @FXML
    void createParagraph(ActionEvent event) {
        paragraph.clear();


        String userNameString = userName.getText();
        String basedString = based.getText();
        String experienceGainedString = experienceGained.getText();
        String yearsExperienceString = yearsExperience.getText();
        String skillsString = skills.getText();
        String fuelsWorkString = fuelsWork.getText();


        String paragraphString = "My name is {0}. I am a self-employed graphic designer working from {1}. " +
                "With diverse experience in {2} along with {3} years as a Graphic Designer, I have the creativity and " +
                "{4} skills to provide you with a unique design solution whatever your business. My work " +
                "is driven by concepts, guided by passion and fuelled by {5}. I take great pleasure in " +
                "watching my clients develop and discover the new opportunities that await them. I create artwork to help you "+
                "effectively communicate with your audience. My job is to get you seen, and more importantly… remembered!";

        String formattedParagraph = MessageFormat.format(paragraphString, userNameString, basedString, experienceGainedString,
                yearsExperienceString, skillsString, fuelsWorkString);


        paragraph.setText(formattedParagraph);

    }

    /**
     * Clears all of the text fields
     * @param event
     */
    @FXML
    void clearData(ActionEvent event) {
        userName.clear();
        based.clear();
        experienceGained.clear();
        yearsExperience.clear();
        skills.clear();
        paragraph.clear();
        fuelsWork.clear();


    }
}
