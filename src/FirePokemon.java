package src;

public class FirePokemon extends Pokemon{
    private int temperature;
    private String flameColor;

    public FirePokemon(String name, int level, int temperature, String flameColor){
        super(name, level);
        this.temperature = temperature;
        this.flameColor = flameColor;
    }
    @Override
    void eats() {
        System.out.println(super.getName() + " eats wood");
    }

    public void flameAttack(){
        System.out.println(super.getName() + " fire attack with fire color " + flameColor);
    }

    public void heat(){
        System.out.println(super.getName() + " attack with temperature " + temperature);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

    public String getFlameColor(){
        return flameColor;
    }

    public void setFlameColor(String flameColor){
        this.flameColor = flameColor;
    }

}
