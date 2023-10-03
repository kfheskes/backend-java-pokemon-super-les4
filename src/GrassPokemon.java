package src;

public class GrassPokemon extends Pokemon {
    private int leaves;
    private boolean poison;

    public GrassPokemon(String name, int level, int leaves, boolean poison){
        super(name,level);
        this.leaves = leaves;
        this.poison = poison;
    }
    @Override
    void eats() {
        System.out.println(super.getName() + " eats grass");
    }

    public void leavesAttack(){
        if (leaves <= 0){
            System.out.println(super.getName() + " out of leaves");
        } else {
            System.out.println(super.getName() + " throw leaves");
        }
    }

    public void poisonAttack(){
        if(poison){
            System.out.println(super.getName() + " poison attack");
        } else {
            System.out.println(super.getName() + " no poison attack available");
        }
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves){
        this.leaves = leaves;
    }

    public boolean getPoison(){
        return poison;
    }

    public void setPoison(boolean poison){
        this.poison = poison;
    }

}
