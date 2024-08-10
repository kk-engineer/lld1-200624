package in.itkaran.lld1200624.lld3.tictactoe.models;

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

}
