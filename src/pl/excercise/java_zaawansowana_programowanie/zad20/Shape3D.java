package pl.excercise.java_zaawansowana_programowanie.zad20;

import pl.excercise.java_zaawansowana_programowanie.zad20.zad22.Fillable;

public abstract class Shape3D extends Shape implements Fillable {

    public abstract double calculateVolume();

    @Override
    public void fill(double waterAmount) {
        double volume = calculateVolume();
        if (waterAmount > volume) {
            System.out.println("Naczynie się przepełni");
        } else if (waterAmount < volume) {
            System.out.println("Naczynie nie wypełni się");
        } else {
            System.out.println("Naczynie wypełni się całkowicie");
        }
    }

}
