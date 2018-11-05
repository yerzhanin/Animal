package Others;

public class Fish extends Pet {
    String color;
    int currentDepth=1;

    public int dive() {
        do {System.out.println("Ныряю на глубину " + currentDepth + " метров");
            currentDepth = currentDepth + 23;
        } while (currentDepth<100);
        System.out.println("НЕ могу нырять больше 100 метров");
        return currentDepth;
    }
    @Override
    public void sleep(){
        System.out.println("Пока!");
    }
}