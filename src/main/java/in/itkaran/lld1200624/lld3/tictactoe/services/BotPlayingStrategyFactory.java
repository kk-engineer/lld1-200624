package in.itkaran.lld1200624.lld3.tictactoe.services;

import in.itkaran.lld1200624.lld3.tictactoe.models.BotDifficultyLevel;
import in.itkaran.lld1200624.lld3.tictactoe.services.strategies.botplayingstrategy.BotPlayingStrategy;
import in.itkaran.lld1200624.lld3.tictactoe.services.strategies.botplayingstrategy.EasyBotPlayingStrategy;
import in.itkaran.lld1200624.lld3.tictactoe.services.strategies.botplayingstrategy.HardBotPlayingStrategy;
import in.itkaran.lld1200624.lld3.tictactoe.services.strategies.botplayingstrategy.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        // Implement a factory method to return the bot playing strategy based on the bot difficulty level
        return switch(botDifficultyLevel) {
            case EASY -> new EasyBotPlayingStrategy();
            case MEDIUM -> new MediumBotPlayingStrategy();
            case HARD -> new HardBotPlayingStrategy();
        };
    }
}
