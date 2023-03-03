package pl.excercise.java_zaawansowana_programowanie.zad18;

import java.util.Objects;

public class Computer {

    private String processor;
    private String ram;
    private String graphicCard;

    public Computer(String processor, String ram, String graphicCard, String producer, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicCard = graphicCard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(processor, computer.processor) && Objects.equals(ram, computer.ram) && Objects.equals(graphicCard, computer.graphicCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicCard);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                '}';
    }
}
