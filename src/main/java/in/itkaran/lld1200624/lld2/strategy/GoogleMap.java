package in.itkaran.lld1200624.lld2.strategy;

import in.itkaran.lld1200624.lld2.strategy.strategies.PathCalculator;

import java.nio.file.Path;

public class GoogleMap {
    private PathCalculator pathCalculator;

    public GoogleMap(PathCalculator pathCalculator) {
        this.pathCalculator = pathCalculator;
    }

    public void findPath(String source, String destination) {
        pathCalculator.findPath(source, destination);
    }
}
