package ca.bcit.comp2522.termproject._101;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.util.Duration;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class GameController {
    @FXML
    private Label newGame;

    @FXML
    private Label instructions;

//    ArrayList<Button> buttons = new ArrayList<>();
//
//    MemoryMatchingGame memoryMatchingGame = new MemoryMatchingGame();
//
//    @FXML
//    private Button button_0;
//    @FXML
//    private Button button_1;
//    @FXML
//    private Button button_2;
//    @FXML
//    private Button button_3;
//
//    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1.5), e -> hideButtons()));
//
//    private boolean firstButtonClicked = false;
//
//    private int indexOfFirstButton;
//    private int indexofSecondButton;
//    private boolean match;



    @FXML
    protected final void onNewGameButtonClick() {
        newGame.setText("Starting Game....");
    }

    @FXML
    protected final void onInstructionsButtonClick(){
        instructions.setText("This fun game tests your memory, observation, and matching skills!\n"
                + "\n" + "How to Play: The game starts with a grid of nine squares, with \n characters hiding underneath. "
                + "Clicking a square reveals a letter or " + "\n a picture. " + "If you find a corresponding square with "
                + "the same letter \n or picture, you have found a match!\n"
                + "\n" + "Objective: Find all matching pairs to win the game");
    }
}