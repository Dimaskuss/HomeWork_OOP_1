public class Main {

   public static  Car[] cars = new Car[10];
    public static void main(String[] args) {

        cars[0] = new Car();
        cars[1] = new Car();
        cars[2] = new Car();
        cars[3] = new Car();
        cars[4] = new Car();

        cars[5] = new Car("lada","Granta", 1.7, "желтый", 2015, "Россия");
        cars[6] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        cars[7] = new Car("BMW","" , 3.0, "черный", 2021, "Германия");
        cars[8] = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        cars[9] = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

//        Car lada = new Car("lada","Granta", 1.7, "желтый", 2015, "Россия");
//        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
//        Car  bmw= new Car("BMW","" , 3.0, "черный", 2021, "Германия");
//        Car kia = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
//        Car hyu = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
//
//        System.out.println(lada);

      printCars();

    }

    static void printObjects() {

    }
         static void printCars() {
            for (int i = 0; i < cars.length; i++) {
                System.out.println(cars[i].toString());
            }
    }





}