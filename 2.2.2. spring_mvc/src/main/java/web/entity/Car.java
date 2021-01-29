package web.entity;

public class Car {
    private String model;
    private int series;
    private double volume;

    public Car() {
    }

    public Car(String model, int series, double volume) {
        this.model = model;
        this.series = series;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", volume=" + volume +
                '}';
    }
}
