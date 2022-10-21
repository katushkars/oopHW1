public class Car {
String marka;
String model;
double volume;
String color;
int year;
String country;

    public Car(String marka, String model, double volume, String color, int year, String country) {
        this.marka = marka;
        this.model = model;
        this.volume = volume;
        this.color = color;
        this.year = year;
        this.country = country;
    }
        void carInfo() {
            System.out.println(marka+model+", сборка "+country+", цвет кузова - "+color+", объем двигателя - "+volume+ ", год выпуска - " +year);
            //Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016

        }








//арка,модель,объем двигателя в литрах, цвет кузова,год производства, страна сборки.
}
