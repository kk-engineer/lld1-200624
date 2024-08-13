package in.itkaran.lld1200624.lld3.tictactoe.models;

import in.itkaran.lld1200624.lld3.tictactoe.services.BotPlayingStrategyFactory;
import in.itkaran.lld1200624.lld3.tictactoe.services.strategies.botplayingstrategy.BotPlayingStrategy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bot extends Player{
    private BotDifficultyLevel difficultyLevel;

    public Bot(String name, Symbol symbol, BotDifficultyLevel difficultyLevel) {
        super(name, symbol, PlayerType.BOT);
        this.difficultyLevel = difficultyLevel;
    }

    public Cell makeMove(Board board) {
        System.out.println(this.getName() + "'s turn");
        BotPlayingStrategy botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(difficultyLevel);
        return botPlayingStrategy.makeMove(board);
    }

}
