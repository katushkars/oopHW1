import transport.Car;

public class Main {
    public static void main(String[] args) {
        Human Maxim = new Human ("Максим", -1987,"Минск","бренд менджер");
        Human Anna = new Human (null,1993, "Москва","Методист образовательных программ");
        Human Kat = new Human ("Катя",1994, "Калининград","Проект менджер");
        Human Artem = new Human ("Артем",1995, "Москва","Директор по развитию бизнеса");
        Human Vladimir = new Human("Владимир", 2022,"Казань","нигде");
        Vladimir.welcome();
        Maxim.welcome();
        Anna.welcome();
        Kat.welcome();
        Artem.welcome();

        Car lada=new Car("Lada", "Granta",1.7, "Желтый",2015,"Россия","АКПП","хэтчбек", 5, "зима","C230AB907");
        Car audi=new Car ("Audi", "A8", 3.0,"черный", 2020,"Германия","КПП","седан", 6, "лето","CA30AB907");
        Car bmw=new Car ("BMW", "Z8", 3.0,"черный", 2021,"Германия","АКПП","хэтчбек", 2, null,"CC230AB907");
        Car kia=new Car ("KIA", "Sportage 4го поколения", 2.4,"красный", 2018,"Южная Корея","АКПП","хэтчбек", 5, "лето", "C230Aj907");
        Car hyundai =new Car ("Hyundai", "Avante", 1.6,"оранжевый", 2016,"Южная Корея","АКПП","седан", 0, "зима","C230AB90");
        lada.carInfo();
        audi.carInfo();
        bmw.carInfo();
        kia.carInfo();
        hyundai.carInfo();


        Flowers rose= new Flowers(null,"Голандия",35.59,0,"Роза");
        Flowers hrizentema = new Flowers(null,null,15.00,5,"Хризентема");
        Flowers pion = new Flowers (null, "Англия", 69.90,1, "Пион");
        Flowers gipsofilla = new Flowers(null,"Турция", 19.5, 10, "Гипсофилла");
        rose.welcomeFlowers();
        hrizentema.welcomeFlowers();
        pion.welcomeFlowers();
        gipsofilla.welcomeFlowers();
        double costBuket=0.0;
        int countRose=3;
        int countHriz=5;
        int countPion = 0;
        int countGipsofilla=1;
        costBuket=(countRose*rose.getCost()+countHriz*hrizentema.getCost()+countPion*pion.getCost()+countGipsofilla*gipsofilla.getCost())*1.1;
        System.out.println(costBuket);

        hyundai.newSeason();
        System.out.println(lada.checkRegNumber());

    }
  
}


