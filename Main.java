import java.util.ArrayList;

import clases.*;

public class Main{
    public static void main(String[] args){


        //CREACION DE LOS MOVIMIENTOS
        String[] nombre_movimientos = {
            "Meneito",
            "Brrr",
            "Tumbale",
            "Prendido",
            "Carga de choque"
        };

        int[] tipos_movimiento = {0,1,2,3};

        //Movimiento mov1 = new Movimiento("Carga de Choque",3,10,250);

        ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();
        for(int i = 0 ; i < nombre_movimientos.length; i++){
            movimientos.add(new Movimiento(nombre_movimientos[i], tipos_movimiento[i], (int)Math.floor(Math.random()*20+1),(int)Math.floor(Math.random()*500+1)));
        }
        for(Movimiento mov : movimientos){
            System.out.println(mov.toString());

        }

        // Creacion de Pokemons

        String[] nombre_pokemon = {
            "Pikachu",
            "Charizard",
            "Squirtel",
            "RayKou",
            "Takamachi",
            "Bulbasur",
            "Norikt",
            "Stuff",
            "Gyarados",
            "Bull"
        };

        int[] tipos_tipos = {0,1,2,3};
    
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        for(int i = 0; i < nombre_pokemon.length; i++){
            pokemons.add(new Pokemon(, tipo, ps, at, ats, df, dfs, vel, id, movimientos))
        }
    }
}