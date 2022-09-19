import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Menu extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage.setTitle("Ultimate tic tac toe");
        Scene scene=new Scene(root,600,400);
        stage.setScene(scene);
        stage.show();
    }
}
