import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class rentr {
    public void start(Stage primaryStage) throws Exception {
        Button like = new Button("Like");
        Button pass = new Button("Pass");

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 150, 100);
        primaryStage.setTitle("MyKeyEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class likeHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {

        }
    }

    class passHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {

        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}