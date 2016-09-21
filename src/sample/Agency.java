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
public class Agency {


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



        String paragraphString = "{0} is based in {1} and prides itself on {2} and getting to know your unique " +
                "requirements so we can deliver the best results for you and help you grow your business. {0} works" +
                " directly with clients including {3} to name a few. We make sure we always keep our eye on the ball. " +
                "What is the ball? The ball is your goal, your sales growth, your increased market profile. We have won" +
                " some awards but that is not our focus. We strive to do great work for our clients not for industry " +
                "accolades. Our skill and expertise, combined over with {4} years of industry exposure, enable us to" +
                " provide businesses and organisations with effective, lasting impressions for brands. We understand " +
                "brands and the digital world better than any traditional agency but we create using lean and agile methods. We have" +
                " pretty much done it all.";

        String formattedParagraph = MessageFormat.format(paragraphString, userNameString, basedString, experienceGainedString,
                skillsString, yearsExperienceString);


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



    }
}
