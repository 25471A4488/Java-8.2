import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Window title
        primaryStage.setTitle("Text and Image Display");

        // Create label
        Label label = new Label("Hello, JavaFX!");

        // Load image
        Image image = new Image("file:imagePath.jpg");

        // Create ImageView
        ImageView imageView = new ImageView(image);

        // Set image size
        imageView.setFitWidth(400);
        imageView.setFitHeight(300);

        // Preserve image ratio
        imageView.setPreserveRatio(true);

        // Create VBox
        VBox vbox = new VBox(10);

        // Add label and image
        vbox.getChildren().addAll(label, imageView);

        // Create scene
        Scene scene = new Scene(vbox, 600, 400);

        // Set scene
        primaryStage.setScene(scene);

        // Show window
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}