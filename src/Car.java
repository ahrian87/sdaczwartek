public class Car {
    private int wheels;
    private int seats;
    private String colour;
    private boolean american;

    Car(int wheels, int seats, String colour, boolean american){
        this.wheels = wheels;
        this.seats = seats;
        this.colour = colour;
        this.american = american;
    }

    public void changeColour(String colour){
        this.colour = colour;
    }

    public String showColour(){
        return colour;
    }

    public void changeAmerican(boolean american){
        this.american = american;
    }

    public boolean showAmerican(){
        return american;
    }
}
