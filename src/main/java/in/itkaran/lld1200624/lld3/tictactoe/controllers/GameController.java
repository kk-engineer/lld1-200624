package in.itkaran.lld1200624.lld3.tictactoe.controllers;

import in.itkaran.lld1200624.lld3.tictactoe.models.GameState;
import in.itkaran.lld1200624.lld3.tictactoe.models.Player;
import in.itkaran.lld1200624.lld3.tictactoe.services.GameService;
import in.itkaran.lld1200624.lld3.tictactoe.services.strategies.winningstrategy.WinningStrategy;

import java.util.List;

public class GameController {
    private GameService gameService;

    public GameController() {
        this.gameService = new GameService();
    }

    public void startGame(List<Player> players, List<WinningStrategy> winningStrategies) {
        gameService.startGame(players, winningStrategies);
    }

    public void makeMove() {
        gameService.makeMove();
    }

    public GameState getGameState() {
        return gameService.getGameState();
    }

    public Player getWinner() {
        return gameService.getWinner();
    }

    public void printBoard() {
        gameService.printBoard();
    }
}
