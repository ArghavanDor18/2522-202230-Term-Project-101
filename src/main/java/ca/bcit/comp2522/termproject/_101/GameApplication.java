package ca.bcit.comp2522.termproject._101;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Loads game resources, assembles interface, and launches game.
 *
 * @author Kristopher Ocampo and Arghavan Dor
 * @version 2022
 */

public final class GameApplication extends Application {

    /**
     * Loads game resources from the game-view.fxml file.
     *
     * @param stage contains the Scene.
     */
    @Override
    public void start(final Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(GameApplication.class.getResource("game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 300);
        stage.setTitle("Memory Matching Game. This fun game tests your memory, observation, and matching skills! \n"
        + "How to Play: Find all matching pairs to win the game!");
        stage.setScene(scene);
        stage.show();

    }
   /**
    * Launches the JavaFX application.
    * @param args command line arguments
    */
    public static void main(String[] args) {
        launch();
    }
}