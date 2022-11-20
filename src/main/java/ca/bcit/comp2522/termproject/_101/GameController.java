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
        newGame.setText("");
    }

    @FXML
    protected final void onInstructionsButtonClick(){
        instructions.setText("");
    }
}