package in.itkaran.lld1200624.lld3.tictactoe.services.strategies.winningstrategy;

import in.itkaran.lld1200624.lld3.tictactoe.models.Board;
import in.itkaran.lld1200624.lld3.tictactoe.models.Move;

public interface WinningStrategy {
    boolean isWinning(Board board, Move move);
}
