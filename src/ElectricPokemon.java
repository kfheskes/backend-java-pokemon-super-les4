package src;

public class ElectricPokemon extends Pokemon {
    private int volt;
    private boolean magnet;

    public ElectricPokemon(String name, int level, int volt, boolean magnet){
        super(name, level);
        this.volt = volt;
        this.magnet = magnet;
    }
    @Override
    void eats() {
        System.out.println(super.getName() + " eats power");
    }

    public void thunder(){
        if(volt >= 0){
            System.out.println(super.getName() + " thunder attack");
        } else {
            System.out.println(super.getName() + " no thunder available");
        }
    }

    public void power(){
        if (magnet){
            System.out.println(super.getName() + " increase power with 20 %");
        } else {
            System.out.println(super.getName() + " no increase of power");
        }
    }

    public int getVolt(){
        return volt;
    }

    public void setVolt(int volt){
        this.volt = volt;
    }

    public boolean getMagnet(){
        return magnet;
    }

    public void setMagnet(boolean magnet) {
        this.magnet = magnet;
    }
}
