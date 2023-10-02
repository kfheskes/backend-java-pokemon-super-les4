package src;

public abstract class Pokemon {
    private String name;
    private int level;

    public Pokemon(String name, int level){
        this.name = name;
        this.level = level;
    }

    abstract void eats();
    public void speaks(){
        System.out.println(name + " speaks");
    }

    public void levelUp(){
        this.level++;
        System.out.println("Well done " + name + " has reached level " + level);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

}
