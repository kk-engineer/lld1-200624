package in.itkaran.lld1200624.lld3.tictactoe;

import in.itkaran.lld1200624.lld3.tictactoe.controllers.GameController;
import in.itkaran.lld1200624.lld3.tictactoe.models.*;
import in.itkaran.lld1200624.lld3.tictactoe.services.strategies.winningstrategy.ColumnWinningStrategy;
import in.itkaran.lld1200624.lld3.tictactoe.services.strategies.winningstrategy.DiagonalWinningStrategy;
import in.itkaran.lld1200624.lld3.tictactoe.services.strategies.winningstrategy.RowWinningStrategy;
import in.itkaran.lld1200624.lld3.tictactoe.services.strategies.winningstrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;


public class Client {
    public static void main(String[] args) {
        
        playTicTacToe();
    }

    private static void playTicTacToe() {
        System.out.println("Let's play to Tic Tac Toe!");
        List<Player> players = new ArrayList<>();

        players.add(new Player("Nishant", new Symbol('N'), PlayerType.HUMAN));
        //players.add(new Player("Gautam", new Symbol('G'), PlayerType.HUMAN));
        // BOT
        players.add(new Bot("Bot1", new Symbol('B'), BotDifficultyLevel.EASY));
        players.add(new Bot("Bot2", new Symbol('C'), BotDifficultyLevel.EASY));

        List<WinningStrategy> winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColumnWinningStrategy(),
                new DiagonalWinningStrategy()
        );

        // Start the game
        GameController gameController = new GameController();
        gameController.startGame(players, winningStrategies);

        System.out.println(gameController.getGameState());

        // Play the game
        while (gameController.getGameState() == GameState.IN_PROGRESS) {
            gameController.printBoard();
            gameController.makeMove();
        }

        // Game over
        System.out.println("Game Over!");
        gameController.printBoard();
        if (gameController.getGameState() == GameState.ENDED) {
            System.out.println("Winner is: " + gameController.getWinner().getName());
        } else {
            System.out.println("It's a draw!");
        }
    }
}
