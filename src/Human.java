public class Human {
    String name;
    int year;
    String city;
    String jobTitle;

    void welcome(){
        System.out.println("Привет! Меня зовут "+name+" Я из города "+city+"Я родился в "+year+"году. Я работаю на должности "+jobTitle+" Будем знакомы");
    }

    public Human(String name, int year, String city, String jobTitle) {
        if (name==null) {
            this.name="Инфорамция не указана";
        }else{this.name = name;
        };

        if (year<0){
            this.year=0;
        } else {this.year = year;
        };
        if (city==null) {
            this.city="Инфорамция не указана";
        }else{this.city = city;
        };
        this.jobTitle = jobTitle;
    }
}
