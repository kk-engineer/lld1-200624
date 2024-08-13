package in.itkaran.lld1200624.lld3.tictactoe.services.strategies.winningstrategy;

import in.itkaran.lld1200624.lld3.tictactoe.models.Board;
import in.itkaran.lld1200624.lld3.tictactoe.models.Move;
import in.itkaran.lld1200624.lld3.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy {
    private Map<Symbol, Integer> leftDiagonal = new HashMap<>();
    private Map<Symbol, Integer> rightDiagonal = new HashMap<>();

    @Override
    public boolean isWinning(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();
        // left diagonal => row==col
        if (row == col) {
            if (!leftDiagonal.containsKey(symbol)) {
                leftDiagonal.put(symbol, 0);
            }
            leftDiagonal.put(symbol, leftDiagonal.get(symbol) + 1);
            if(leftDiagonal.get(symbol) == board.getDimension()) return true;
        }

        // right diagonal => row+col == board.getDimension()-1
        if (row + col == board.getDimension() - 1) {
            if (!rightDiagonal.containsKey(symbol)) {
                rightDiagonal.put(symbol, 0);
            }
            rightDiagonal.put(symbol, rightDiagonal.get(symbol) + 1);
            return rightDiagonal.get(symbol) == board.getDimension();
        }

        return false;
    }
}
