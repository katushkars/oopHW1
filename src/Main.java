public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Human Maxim = new Human ("Максим", -1987,"Минск","бренд менджер");
        Human Anna = new Human (null,1993, "Москва","Методист образовательных программ");
        Human Kat = new Human ("Катя",1994, "Калининград","Проект менджер");
        Human Artem = new Human ("Артем",1995, "Москва","Директор по развитию бизнеса");
        Maxim.welcome();
        Anna.welcome();
        Kat.welcome();
        Artem.welcome();

        Car lada=new Car("Lada", "Granta",1.7, "Желтый",2015,"Россия");
        Car audi=new Car ("Audi", "A8", 3.0,"черный", 2020,"Германия");
        Car bmw=new Car ("BMW", "Z8", 3.0,"черный", 2021,"Германия");
        Car kia=new Car ("KIA", "Sportage 4го поколения", 2.4,"красный", 2018,"Южная Корея");
        Car hyundai =new Car ("Hyundai", "Avante", 1.6,"оранжевый", 2016,"Южная Корея");
        lada.carInfo();
        audi.carInfo();
        bmw.carInfo();
        kia.carInfo();
        hyundai.carInfo();
    }
}