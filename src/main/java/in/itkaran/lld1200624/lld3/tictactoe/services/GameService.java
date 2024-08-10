package in.itkaran.lld1200624.lld3.tictactoe.services;

import in.itkaran.lld1200624.lld3.tictactoe.models.Game;
import in.itkaran.lld1200624.lld3.tictactoe.models.GameState;
import in.itkaran.lld1200624.lld3.tictactoe.models.Player;
import in.itkaran.lld1200624.lld3.tictactoe.services.strategies.winningstrategy.WinningStrategy;

import java.util.List;

public class GameService {
    private Game game;

    public void startGame(List<Player>players, List<WinningStrategy> winningStrategies) {
        game = Game.getBuilder()
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void makeMove() {
        game.makeMove();
    }

    public GameState getGameState() {
        return game.getGameState();
    }

    public Player getWinner() {
        return game.getWinner();
    }

    public void printBoard() {
        game.getBoard().printBoard();
    }
}
