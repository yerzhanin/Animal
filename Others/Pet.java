package Others;

public class Pet {
    private int age;
    private double height;
    double weight;
    String color;

    public void eat(){
        System.out.println("Я очень голоден...давай поедим");
    };
    public void sleep(){
        System.out.println("Спокойной ночи, до завтра");
    };
    public String say(String phrase){
        String petResponse = "Ну Ок "+phrase;
        return petResponse;
    };
}
