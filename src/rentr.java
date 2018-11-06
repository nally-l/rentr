import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class rentr {
    ArrayList<Rental> likedRentals = new ArrayList<>();
    ArrayList<Purchase> likedPurchases = new ArrayList<>();
    ArrayList<Rental> seenRentals = new ArrayList<>();
    ArrayList<Purchase> seenPurchases = new ArrayList<>();

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
        private Rental tempRental;
        private Purchase tempPurchase;
        public void setCurrentProperty(Rental rental) {
            tempRental = rental;
        }

        public void setCurrentProperty(Purchase purchase) {
            tempPurchase = purchase;
        }

        public void addCurrentProperty() {
            if (tempRental != null) {
                likedRentals.add(tempRental);
                seenRentals.add(tempRental);
                tempRental = null;
            } else if (tempPurchase != null) {
                likedPurchases.add(tempPurchase);
                seenPurchases.add(tempPurchase);
                tempPurchase = null;
            }
        }

        @Override
        public void handle(ActionEvent event) {
            addCurrentProperty();
        }
    }

    class passHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
        /*
        Adds that property to the "seen" list
         */
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}