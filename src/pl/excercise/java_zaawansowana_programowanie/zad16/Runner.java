package pl.excercise.java_zaawansowana_programowanie.zad16;

public enum Runner {

    BEGINNER(6, 5),
    INTERMEDIATE(5, 4),
    ADVANCED(4, 3);

    private final double minimalTime;
    private final double maximalTime;

    Runner(double maximalTime, double minimalTime) {
        this.minimalTime = minimalTime;
        this.maximalTime = maximalTime;
    }

    public static Runner getFitnessLevel(double time) {

        for (Runner runner : Runner.values()) {
            if (time > runner.minimalTime && time <= runner.maximalTime) {
                return runner;
            }
        }

        return null;
    }
}
