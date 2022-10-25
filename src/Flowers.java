public class Flowers {
   private String flowerColor;
   private String country;
   private double cost;
    int lifeSpan;
   private String name;

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor==null){
            flowerColor="white";
        }
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country==null){
            country="Россия";
        }
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            cost = 1.00;
        }
        this.cost = cost;
    }
    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan<0){
            lifeSpan=3;
        }
        this.lifeSpan = lifeSpan;
    }

    public Flowers(String flowerColor, String country, double cost, int lifeSpan, String name) {
        if (flowerColor==null){
            flowerColor="белый";
        }this.flowerColor = flowerColor;
        if(country==null){
            country="Россия";
        }
        this.country = country;
        if (cost <= 0) {
            cost = 1.00;
        }this.cost = cost;

        if (lifeSpan<=0){
            lifeSpan=3;}this.lifeSpan = lifeSpan;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    void welcomeFlowers() {
        System.out.println("Название "+getName()+", цвет: "+getFlowerColor()+", страна происхождения:  "+getCountry()+", цена: "+getCost()+", срок стояния: "+getLifeSpan());
    }
}

