package in.itkaran.lld1200624.lld3.tictactoe.services.strategies.botplayingstrategy;

import in.itkaran.lld1200624.lld3.tictactoe.models.Board;
import in.itkaran.lld1200624.lld3.tictactoe.models.Cell;
import in.itkaran.lld1200624.lld3.tictactoe.models.CellState;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    public Cell makeMove(Board board) {
        // Generate a random move
        int row, col;
        do {
            row = (int) (Math.random() * board.getDimension());
            col = (int) (Math.random() * board.getDimension());
        } while (board.getBoard().get(row).get(col).getCellState() != CellState.EMPTY);

        return new Cell(row, col);
    }
}
