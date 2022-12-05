package ca.bcit.comp2522.termproject._101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 * Creates the game board for the Memory Matching game.
 *
 * @author Kristopher Ocampo and Arghavan Dor
 * @version 2022
 */

public class MemoryMatchingGame {

        private final int gameBoardRows = 3;
        private final int gameBoardColumns = 3;
        private final int gameBoardSize = gameBoardRows * gameBoardColumns;
        private final Random random = new Random();

        private final ArrayList<String> memoryBoard = new ArrayList<>(Arrays.asList("", "", "", "", "", "", "", "", ""));
        private final ArrayList<String> memoryOptions = new ArrayList<>(Arrays.asList("A", "A", "B", "B", "C", "C", "D", "D"));

      /**
       * Sets up the game board.
      */
        public void setupGame() {
            setupMemoryBoard();
            System.out.println(memoryBoard);
        }
      /**
       * Retrieves the index of a clicked button from the memoryBoard ArrayList.
       * @param index represents the clicked button's location in the memoryBoard ArrayList.
       *
       * @return the index of the clicked button.
       */
        public String getOptionAtIndex(int index) {
            return memoryBoard.get(index);
        }

        private void setupMemoryBoard() {
            for (int i = 0; i < gameBoardSize - 1; i++) {
                String memoryOption = memoryOptions.get(i);
                int position = random.nextInt(gameBoardSize - 1);

                while (!Objects.equals(memoryBoard.get(position), "")) {
                    position = random.nextInt(gameBoardSize - 1);
                }
                memoryBoard.set(position, memoryOption);
            }
        }
    /**
     * Checks two positions in the memoryOptions ArrayList.
     *
     * @param firstIndex index of the first button clicked in ArrayList.
     * @param secondIndex index of the second button clicked in ArrayList.
     *
     * @return Values of the index of first and second button clicked.
     */
        public boolean checkTwoPositionsInArray(int firstIndex, int secondIndex) {
            return memoryBoard.get(firstIndex).equals(memoryBoard.get(secondIndex));
        }
}

