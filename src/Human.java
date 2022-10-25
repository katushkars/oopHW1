public class Human {
    private String name;
    private int year;
    private String city;
    String jobTitle;

    void welcome() {
        System.out.println("Привет! Меня зовут " + getName() + " Я из города " + getCity()+ "Я родился в " + getYear() + "году. Я работаю на должности " + jobTitle + " Будем знакомы");
    }

    public Human(String name, int year, String city, String jobTitle) {
        this.name = name;
        this.year = year;
        this.city = city;
        this.jobTitle = jobTitle;
    }

    public int setYear() {
        if (year < 0) {
            year = 0;
        } else year = year;

        return year;
    }

        public String getCity () {
            return city;
        }

        public void setCity (String city) {
            if (city == null) {
                this.city = "Инфорамция не указана";
            } else {
                this.city = city;
            }
        }
    public int getYear () {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "Инфорамция не указана";
        } else {
            this.name = name;
            this.name = name;
        }
    }




    }




