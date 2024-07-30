package in.itkaran.lld1200624.lld2.strategy;

import in.itkaran.lld1200624.lld2.strategy.factory.PathCalculatorFactory;
import in.itkaran.lld1200624.lld2.strategy.strategies.PathCalculator;

public class Client {
    public static void main(String[] args) {
        demoStrategy();
    }

    private static void demoStrategy() {
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(ModeType.WALK);
        GoogleMap googleMap = new GoogleMap(pathCalculator);
        googleMap.findPath("Kashmir", "Kanyakumari");
    }
}
