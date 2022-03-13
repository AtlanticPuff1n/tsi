package lv.tsi.practice1.exercise1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GravityCalculator {

    private static final double GRAVITY = 9.81;
    private int fallingTime;
    private double initialPosition;
    private double initialVelocity;

    public double calculateFinalPosition() {
        return Math.pow(fallingTime, 2) * GRAVITY * 0.5 + initialVelocity * fallingTime + initialPosition;
    }
}
