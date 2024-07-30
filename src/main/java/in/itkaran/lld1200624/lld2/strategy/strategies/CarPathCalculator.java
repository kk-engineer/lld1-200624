package in.itkaran.lld1200624.lld2.strategy.strategies;

public class CarPathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Car path calculator from source: " + source + " to destination: " + destination );
    }
}
