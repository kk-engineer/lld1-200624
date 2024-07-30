package in.itkaran.lld1200624.lld2.strategy.factory;

import in.itkaran.lld1200624.lld2.strategy.ModeType;
import in.itkaran.lld1200624.lld2.strategy.strategies.BikePathCalculator;
import in.itkaran.lld1200624.lld2.strategy.strategies.CarPathCalculator;
import in.itkaran.lld1200624.lld2.strategy.strategies.PathCalculator;
import in.itkaran.lld1200624.lld2.strategy.strategies.WalkPathCalculator;

public class PathCalculatorFactory {

    public static PathCalculator getPathCalculator(ModeType mode){
        if (mode.equals(ModeType.CAR)) return new CarPathCalculator();
        else if (mode.equals(ModeType.BIKE)) return new BikePathCalculator();
        else if (mode.equals(ModeType.WALK)) return new WalkPathCalculator();
        else return null;
    }
}
