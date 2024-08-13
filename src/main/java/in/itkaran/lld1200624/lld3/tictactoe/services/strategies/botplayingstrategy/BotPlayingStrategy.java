package in.itkaran.lld1200624.lld3.tictactoe.services.strategies.botplayingstrategy;

import in.itkaran.lld1200624.lld3.tictactoe.models.Board;
import in.itkaran.lld1200624.lld3.tictactoe.models.Cell;
import in.itkaran.lld1200624.lld3.tictactoe.models.CellState;

public interface BotPlayingStrategy {
    public Cell makeMove(Board board);
}
