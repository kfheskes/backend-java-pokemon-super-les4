package src;



public class Main {
    public static void main(String[] args) {
        FirePokemon fp1 = new FirePokemon("Charizard", 30, 100, "Red");
        WaterPokemon wp1 = new WaterPokemon("Blastoise", 40, 200, "sea water");
        GrassPokemon gp1 = new GrassPokemon("Bulbasaur", 5, 10, false);
        ElectricPokemon ep1 = new ElectricPokemon("Pikachu", 20, 50, false);


            fp1.flameAttack();
            fp1.eats();
            fp1.heat();
            fp1.printNameLevel();
        }

    }



