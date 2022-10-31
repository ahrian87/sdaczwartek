public class Main {
    public static void main(String[] args) {
        Car auto1 = new Car(4, 4, "red", true);
        auto1.changeColour("blue");
        System.out.println(auto1.showColour());
        auto1.changeAmerican(false);
        System.out.println(auto1.showAmerican());

    }
}