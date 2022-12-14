
package transport;
import java.time.LocalDate;
public class Car {
private String marka;
    private String model;
    private double volume;
    private String color;
    private int year;
    private String country;
    private String transmission;
    private String bodyType;
    private int numbersOfSeats;
    private String season;

    private String regNumber;
   private  Key key;
    private Insurance insurance;




    public Car(String marka, String model, double volume, String color, int year, String country, String transmission, String bodyType, int numbersOfSeats, String season,String regNumber) {
       this.marka= checkCar(marka,"default");
        this.model=checkCar(model,"default");
        this.country=checkCar(country,"default");
        this.color=checkCar(color,"white");
        this.transmission=checkCar(transmission,"default");
        this.bodyType=checkCar(bodyType,"default");
        this.numbersOfSeats = numbersOfSeats;
       this.season= checkCar(season,"default");;
        if (volume==0){
        this.volume = 1.5;} else {
            this.volume=volume;
        };
        if(year==0){
            this.year = 2000;
        }else{this.year = year;}
        ;
        this.regNumber=regNumber;

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumbersOfSeats() {
        return numbersOfSeats;
    }

    public void setNumbersOfSeats(int numbersOfSeats) {
        this.numbersOfSeats = numbersOfSeats;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void carInfo() {
            System.out.println(getMarka()+" "+getModel()+
                    ", ???????????? "+getCountry()+
                    ", ???????? ???????????? - "+getColor()+
                    ", ?????????? ?????????????????? - " +getVolume()+
                    ", ?????? ?????????????? - " +getYear()+
                    ", ?????????????? ?????????????? - " +getTransmission()+
                    ", ?????? ???????????? - " +getBodyType()+
                    ", ???????????????????? ???????? - "+getNumbersOfSeats()+
                    ", ???????? - "+getSeason());
            //Hyundai Avante, ???????????? ?? ?????????? ??????????, ???????? ???????????? ??? ??????????????????, ?????????? ?????????????????? ??? 1,6 ??, ?????? ?????????????? ??? 2016

        }
        public String checkCar(String value,String defaultValue) {
            if (value == null) {
                return defaultValue;
            } else {
                return value;
            }
        }
        public void newSeason(){
           int nowDate= LocalDate.now().getMonthValue();
           String realSeason;

        if (nowDate<=4 || nowDate>=10) {
            realSeason = "????????";
        }else{realSeason ="????????";}
        if (realSeason.equals(getSeason())){
            System.out.println("?????????? ????????????!");
        }else{
            System.out.println("???????? ???????????? ????????!");
        }
        }
        public boolean checkRegNumber(){
        if (regNumber.length()!=9){
            return false;
        }
        char[] regNumberChar=this.regNumber.toCharArray();
        return isLetter(regNumberChar[0])
                && isLetter(regNumberChar[4])
                && isLetter(regNumberChar[5])
                && isNumber(regNumberChar[1])
                && isNumber(regNumberChar[2])
                && isNumber(regNumberChar[3])
                && isNumber(regNumberChar[6])
                && isNumber(regNumberChar[7])
                && isNumber(regNumberChar[8]);
        }
        private boolean isLetter (char symbol){
        String allRightSymbols = "ABEKMHOPCTYX";
        return allRightSymbols.contains(""+symbol);
        }
        private boolean isNumber (char symbol ){
        return Character.isDigit(symbol);
        }
        public static class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

            public Key(boolean remoteEngineStart, boolean keylessAccess) {
                this.remoteEngineStart = remoteEngineStart;
                this.keylessAccess = keylessAccess;
            }
        }
        public static class Insurance{

        private final LocalDate validUntil;
        private final int cost;
        private final String number;

            public Insurance(LocalDate validUntil, int cost, String number) {
                this.validUntil = validUntil!=null ? validUntil : LocalDate.now().plusDays(10);
                this.cost = cost;
                if (number.length()==9){
                    this.number=number;} else{ this.number="default";};

            }

                public boolean isInshuranceValid (){
                return LocalDate.now().isBefore (this.validUntil);
            }

        }

        }

