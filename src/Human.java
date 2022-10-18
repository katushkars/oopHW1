public class Human {
    String name;
    String dob;
    String city;
    String jobTitle;

    void welcome(){
        System.out.println("Привет! Меня зовут"+name+" Я из города"+city+"Я родился в"+dob+"году. Я работаю на должности"+jobTitle+"Будем знакомы");
    }

    public Human(String name, String dob, String city, String jobTitle) {
        this.name = name;
        this.dob = dob;
        this.city = city;
        this.jobTitle = jobTitle;
    }
}
