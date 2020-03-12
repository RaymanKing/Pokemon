import java.util.ArrayList;
import java.util.Scanner;

import clases.*;

public class Main{

    final static String[] nombre_movimientos = {
        "Meneito",
        "Brrr",
        "Tumbale",
        "Prendido"
    };

    final static String[] nombre_pokemon = {
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
    public static void main(String[] args){


        
    }

    // METODOS PARA LA CREACION DE LOS ENTRENADORES CON SUS 6 POKEMON

    public String crearJugador(String nombre,ArrayList<Pokemon> Pokes){
        System.out.println("Introduce el nombre de tu entrenador");
        nombre = leerTexto();
        Pokes = addPokemon(Pokes);
    }


    // Metodo para crear el array con sus 6 Pokemons
    public ArrayList<Pokemon> addPokemon(ArrayList<Pokemon> Pokemons){
        for(int i = 0; i < 6; i++){
            crearPokemon();
            add.Pokemons1[i];
        }
    }

    // METODO PARA CREAR CADA POKEMON
    public crearPokemon(){
        for(int i = 0; i < 4; i++){
            crearMovimientos();
        }
    }

    // METODO PARA CREAR CADA MOVIMIENTO
    public crearMovimientos(){
        movimientosPokemon1.add(new Movimiento(nombre_movimientos[i],
         tipos_movimiento[i],
          (int)Math.floor(Math.random()*20+1),
          (int)Math.floor(Math.random()*500+1)));
    }



    // METODO PARA INSERTAR DATOS POR TECLADO

    public String leerTexto(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    //CREACION DE LOS MOVIMIENTOS


    int[] tipos_movimiento = {0,1,2,3};

    //Movimiento mov1 = new Movimiento("Carga de Choque",3,10,250);
    // Movimientos para el primer Pokemon
    ArrayList<Movimiento> movimientosPokemon1 = new ArrayList<Movimiento>();
    for(int i = 0 ; i < 4; i++){
        movimientosPokemon1.add(new Movimiento(nombre_movimientos[i], tipos_movimiento[i], (int)Math.floor(Math.random()*20+1),(int)Math.floor(Math.random()*500+1)));
    }
    for(Movimiento mov : movimientosPokemon1){
        System.out.println(mov.toString());

    }

    // Creacion de Pokemons

    

    int[] tipo_pokemon = { 0,1,2,3,4,5,6 };
  /*  String[] tipo_pokemon = {
        "Tierra",
        "Fuego",
        "Agua",
        "Electrico",
        "Volador",
        "Fantasma",
        "Dragon"
    };*/

    int[] tipos_tipos = {0,1,2,3};

    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    for(int i = 0; i < 6; i++){
        pokemons.add(new Pokemon(
            nombre_pokemon[i],
            tipo_pokemon,
            (int)Math.floor(Math.random()*20+1), /*Vida*/
            (int)Math.floor(Math.random()*50+1), /* Ataque*/
            (int)Math.floor(Math.random()*20+1), /*Ataque especial */
            (int)Math.floor(Math.random()*20+1), /*Defensa */
            (int)Math.floor(Math.random()*20+1), /*Defensa especial */
            (int)Math.floor(Math.random()*20+1), /*Velocidad */
            (int)Math.floor(Math.random()*500+1), /*Id */
            movimientosPokemon1
        ));
    }


}