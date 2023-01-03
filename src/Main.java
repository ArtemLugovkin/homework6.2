public class Main {
    public static void main(String[] args) {

        System.out.println("Часть 2. Задание 1");


        String name;
        int age;
        String city;
        String post;





        System.out.println("Часть 2. Задание 2");

        Car ladaGrande = new Car( "Lada", " Grande ", " в России", " желтого ", " 2015", " 1.7.");
        Car audiA8 = new Car("Auda", "A8", " в Германии", "черного ", "2020", " 3.0");
        Car bMWZ8 = new Car("BMW", "Z8", " в Германии", "черного", "2021", " 3.0");
        Car kiaSportage4 = new Car("Kia", "Sportage4", " в Южной Корее", "красного", "2018", " 2.4");
        Car hyundaiAvante = new Car("Hyundai", "Avante", "в Южной Корее", "оранжевого", "2016", " 1.6");

        ladaGrande.carInformation();
        audiA8.carInformation();
        bMWZ8.carInformation();
        kiaSportage4.carInformation();
        hyundaiAvante.carInformation();
    }
}
