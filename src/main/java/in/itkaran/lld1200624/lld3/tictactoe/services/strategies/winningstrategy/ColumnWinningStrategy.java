package in.itkaran.lld1200624.lld3.tictactoe.services.strategies.winningstrategy;

import in.itkaran.lld1200624.lld3.tictactoe.models.Board;
import in.itkaran.lld1200624.lld3.tictactoe.models.CellState;
import in.itkaran.lld1200624.lld3.tictactoe.models.Move;
import in.itkaran.lld1200624.lld3.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy {
    private Map<Integer, Map<Symbol, Integer>> colMap = new HashMap<>();

    @Override
    public boolean isWinning(Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        // check if current column is present in map
        if (!colMap.containsKey(col)) {
            colMap.put(col, new HashMap<>());
        }

        Map<Symbol, Integer> colCount = colMap.get(col);

        // Check if current symbol is present in the map
        if (!colCount.containsKey(symbol)) {
            colCount.put(symbol, 0);
        }

        colCount.put(symbol, colCount.get(symbol) + 1);
        return colCount.get(symbol) == board.getDimension();
    }
}
