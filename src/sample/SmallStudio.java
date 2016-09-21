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
public class SmallStudio {


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



        String paragraphString = "{0} is a multidiscipline design stuido based in {1}, and are a truly unique " +
                "business covering the areas of {2}. With over {3} years experience in the graphic design industry," +
                " working on varied projects from new start-up businesses to the corporate sector, we take pride in" +
                " working closely with clients, providing stunning professional solutions every time. With our " +
                "wealth of knowledge and experience, we provide the expertise of a large design agency. We are " +
                "extremely passionate about {4} and thrive on the results we gain for our clients. These surprisingly " +
                "affordable solutions provide a striking product that not only looks great, but is great for the " +
                "earth too. {0} really are the graphic design experts.";

        String formattedParagraph = MessageFormat.format(paragraphString, userNameString, basedString, experienceGainedString,
                yearsExperienceString, skillsString);


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
