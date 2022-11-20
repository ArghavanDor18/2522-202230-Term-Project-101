package ca.bcit.comp2522.termproject._101;

import javafx.fxml.FXML;
import javafx.scene.control.Label;



public class GameController {
    @FXML
    private Label newGame;

    @FXML
    private Label instructions;

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