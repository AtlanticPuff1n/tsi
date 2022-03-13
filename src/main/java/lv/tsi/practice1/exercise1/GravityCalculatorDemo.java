package lv.tsi.practice1.exercise1;

public class GravityCalculatorDemo {

    public static void main(String[] args) {
        GravityCalculator gravityCalculator = new GravityCalculator();

        //If an element doesn't exist then the var init with 0
        gravityCalculator.setFallingTime((args.length >= 1 && args[0] != null) ? Integer.parseInt(args[0]) : 0);
        gravityCalculator.setInitialPosition((args.length >= 2 && args[1] != null) ? Double.parseDouble(args[1]) : 0);
        gravityCalculator.setInitialVelocity((args.length >= 3 && args[2] != null) ? Double.parseDouble(args[2]) : 0);

        System.out.println(gravityCalculator.getFallingTime());
        System.out.println(gravityCalculator.getInitialPosition());
        System.out.println(gravityCalculator.getInitialVelocity());

        double finalPosition = gravityCalculator.calculateFinalPosition();
        System.out.println("Position in " + gravityCalculator.getFallingTime() + " seconds: " + finalPosition);
    }
}
