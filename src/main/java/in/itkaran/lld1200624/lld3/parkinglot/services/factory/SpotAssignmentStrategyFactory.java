package in.itkaran.lld1200624.lld3.parkinglot.services.factory;

import in.itkaran.lld1200624.lld3.parkinglot.models.SpotAssignmentStrategyType;
import in.itkaran.lld1200624.lld3.parkinglot.services.strategies.spotassignment.NearestSpotAssignmentStrategy;
import in.itkaran.lld1200624.lld3.parkinglot.services.strategies.spotassignment.RandomSpotAssignmentStrategy;
import in.itkaran.lld1200624.lld3.parkinglot.services.strategies.spotassignment.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategy(
            SpotAssignmentStrategyType  spotAssignmentStrategyType) {
        switch(spotAssignmentStrategyType) {
            case RANDOM:
                return new RandomSpotAssignmentStrategy();
            case NEAREST:
                return new NearestSpotAssignmentStrategy();
            default:
                return null;
        }
    }
}
