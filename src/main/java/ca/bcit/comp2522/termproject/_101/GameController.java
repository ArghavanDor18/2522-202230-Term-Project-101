package ca.bcit.comp2522.termproject._101;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.util.Duration;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

/**
 * Initializes buttons and button matching functionality for game board.
 *
 * @author Kristopher Ocampo and Arghavan Dor
 * @version 2022
 */

public class GameController implements Initializable {
    @FXML
    private Label newGame;

    @FXML
    private Label instructions;

    /**
     * Creates an Array List of buttons.
     */
    ArrayList<Button> buttons = new ArrayList<>();

    /**
     * Creates a new object of type matching game.
     */
    MemoryMatchingGame memoryMatchingGame = new MemoryMatchingGame();

    @FXML
    private Button button_0;
    @FXML
    private Button button_1;
    @FXML
    private Button button_2;
    @FXML
    private Button button_3;

    @FXML
    private Button button_4;

    @FXML
    private Button button_5;

    @FXML
    private Button button_6;

    @FXML
    private Button button_7;

    @FXML
    private Button button_8;

    /**
     * Animation frames that are from the hideButtons() method that activate under certain conditions.
     */
    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1.0), e -> hideButtons()));

    private boolean firstButtonClicked = false;

    private int indexOfFirstButton;
    private int indexOfSecondButton;
    private boolean match;

    /**
     * Add all buttons to ArrayList.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        memoryMatchingGame.setupGame();

        buttons.addAll(Arrays.asList(button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7,
                button_8));

    }
    @FXML

    void buttonIsClicked(ActionEvent event) {
        if (!firstButtonClicked) {
            //If the chosen button is not a match, hide the button
            if (!match) {
                hideButtons();
                timeline.stop();
            }
            match = false;
            firstButtonClicked = true;

            //Reveal clicked button's letter
            String buttonId = ((Control) event.getSource()).getId();
            indexOfFirstButton = Integer.parseInt(buttonId.substring(buttonId.length() - 1));

            //Change text of clicked button
            buttons.get(indexOfFirstButton).setText(memoryMatchingGame.getOptionAtIndex(indexOfFirstButton));

            return;
        }

        String buttonId = ((Control) event.getSource()).getId();
        indexOfSecondButton = Integer.parseInt(buttonId.substring(buttonId.length() - 1));

        //Change the text of clicked button
        buttons.get(indexOfSecondButton).setText(memoryMatchingGame.getOptionAtIndex(indexOfSecondButton));

        firstButtonClicked = false;

        //Check if the two clicked buttons are a match
        if (memoryMatchingGame.checkTwoPositionsInArray(indexOfFirstButton, indexOfSecondButton)) {
            System.out.println("You found a Matching Pair! Great job!");
            match = true;
            return;
        }

        timeline.play();
    }
    // Hide the two clicked buttons should those two clicked buttons not be a match
    private void hideButtons() {
        buttons.get(indexOfFirstButton).setText("");
        buttons.get(indexOfSecondButton).setText("");
    }


        @FXML
        protected final void onNewGameButtonClick() {
            newGame.setText("Starting Game....");

        }

        @FXML
        protected final void onInstructionsButtonClick() {
            instructions.setText("""
                    This fun game tests your memory, observation, and matching skills!

                    How to Play: The game starts with a grid of nine squares, with\s
                     characters hiding underneath. Clicking a square reveals a letter. If you find a corresponding \s
                    square with the same letter, you have found a match!

                    Objective: Find all matching pairs to win the game""");
        }
    }
