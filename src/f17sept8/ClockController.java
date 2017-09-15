package f17sept8;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class ClockController implements Initializable {
    //Labels for displaying the time or errors
    @FXML private Label militaryTimeLabel;
    @FXML private Label standardTimeLabel;
    @FXML private Label errorMessageLabel;
    
    //elements to set the time 
    @FXML private TextField hoursTextField;
    @FXML private TextField minutesTextField;
    @FXML private TextField secondsTextField;
    
    //Setup the button
    @FXML private Button updateTimeButton;
    
    /**
     * When the updateTimeButton is pushed, it should
     * read from the hours, minutes and seconds text fields,
     * try to create a Time1 object and display the time
     */
    public void updateTimeButtonPushed()
    {
        int hours = Integer.parseInt(hoursTextField.getText());
        int minutes = Integer.parseInt(minutesTextField.getText());
        int seconds = Integer.parseInt(secondsTextField.getText());
        
        try
        {
            Time1 time = new Time1(hours, minutes, seconds);
            this.errorMessageLabel.setVisible(false);
            militaryTimeLabel.setVisible(true);
            militaryTimeLabel.setText(time.toMilitaryTime());
            
            standardTimeLabel.setVisible(true);
            standardTimeLabel.setText(time.toStandardTime());
        } catch (IllegalArgumentException e)
        {
            militaryTimeLabel.setVisible(false);
            standardTimeLabel.setVisible(false);
            this.errorMessageLabel.setVisible(true);
            errorMessageLabel.setText(e.getMessage());
        }
    }

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.militaryTimeLabel.setVisible(false);
        this.standardTimeLabel.setVisible(false);
        this.errorMessageLabel.setVisible(false);
    }    
    
}
