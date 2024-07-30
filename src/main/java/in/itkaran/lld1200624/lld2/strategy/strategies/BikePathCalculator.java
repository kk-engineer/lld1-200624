package in.itkaran.lld1200624.lld2.strategy.strategies;

public class BikePathCalculator implements PathCalculator {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Bike path calculator from source: " + source + " to destination: " + destination );
    }
}
