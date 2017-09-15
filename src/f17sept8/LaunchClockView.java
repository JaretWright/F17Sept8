package f17sept8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class LaunchClockView extends Application{

    public static void main(String[] args)
    {
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Clock.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Worlds ugliest clock");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
