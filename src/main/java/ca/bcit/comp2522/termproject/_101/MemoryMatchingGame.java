package ca.bcit.comp2522.termproject._101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class MemoryMatchingGame {

        private final int gameBoardRows = 2;
        private final int gameBoardColumns = 2;
        private final int gameBoardSize = gameBoardRows * gameBoardColumns;
        private final Random random = new Random();

        private final ArrayList<String> memoryBoard = new ArrayList<>(Arrays.asList("", "", "", ""));
        private final ArrayList<String> memoryOptions = new ArrayList<>(Arrays.asList("A", "A", "B", "B"));

        public void setupGame(){
            setupMemoryBoard();
            System.out.println(memoryBoard);
        }

        public String getOptionAtIndex(int index){
            return memoryBoard.get(index);
        }

        private void setupMemoryBoard(){
            for (int i = 0; i < gameBoardSize - 1; i++) {
                String memoryOption = memoryOptions.get(i);
                int position = random.nextInt(gameBoardSize - 1);

                while (!Objects.equals(memoryBoard.get(position), "")){
                    position = random.nextInt(gameBoardSize - 1);
                }
                memoryBoard.set(position, memoryOption);
            }
        }

        public boolean checkTwoPositionsInArray(int firstIndex, int secondIndex){
            return memoryBoard.get(firstIndex).equals(memoryBoard.get(secondIndex));
        }
}

