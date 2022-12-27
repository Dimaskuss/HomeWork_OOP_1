import java.util.Calendar;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;



    public Car() {
        this(null);

    }
    public Car(String brand) {
        this(null, null);

    }
        public Car (String brand, String model) {
        this( null, null,0.0);

    }
    public Car(String brand  , String model, double engineVolume) {
        this(null, null, 0.0,null);

    }
    public Car(String brand  , String model, double engineVolume, String color) {
        this(null, null, 0.0,null,0);
    }

    public Car(String brand  , String model, double engineVolume, String color, int year) {
        this(null, null, 0.0,null,0,null);
    }
    public Car(String brand  , String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        if (this.brand == null|| brand.equals("")) {
            this.brand = "default";
        }


        this.model = model;
        if (model == null ||model.equals("")) {
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        if (Double.compare(engineVolume,0)==0) {
            this.engineVolume = 1.5;
        }
        this.color = color;
        if (color == null) {
            this.color = "белый";
        }
        this.year = year;
        if (year <= 0) {
            this.year = 2000;
        }
        this.country = country;
        if (country == null) {
            this.country = "СССР";
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
