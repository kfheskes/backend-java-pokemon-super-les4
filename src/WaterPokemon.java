package src;

public class WaterPokemon extends Pokemon {
    private int amountLiters;
    private String typeOfWater;

    public WaterPokemon(String name, int level, int amountLiters, String typeOfWater){
        super(name, level);
        this.amountLiters = amountLiters;
        this.typeOfWater = typeOfWater;
    }
    @Override
    void eats() {
        System.out.println(super.getName() + " eats fish");
    }

    public void surf(){
        if(amountLiters > 4){
            System.out.println(super.getName() + " attack surf");
        } else {
            System.out.println(super.getName() + " no suf attack possible");
        }
    }

    public void hydroPump(){
        System.out.println(super.getName() + " attack with" + typeOfWater);
    }

    public int getAmountLiters() {
        return amountLiters;
    }

    public void setAmountLiters(int amountLiters ){
        this.amountLiters = amountLiters;
    }

    public String getTypeOfWater() {
        return typeOfWater;
    }
    public void setTypeOfWater(String typeOfWater) {
        this.typeOfWater = typeOfWater;
    }
}

