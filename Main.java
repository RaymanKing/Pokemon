import java.util.ArrayList;
import java.util.Scanner;

import clases.*;

public class Main {

    final static String[] MOVIMIENTOS_NOMBRE = { "Meneito", "Brrr", "Tumbale", "Prendido" };

    final static String[] POKEMON_NOMBRE = { "Pikachu", "Charizard", "Squirtel", "RayKou", "Takamachi", "Bulbasur",
            "Norikt", "Stuff", "Gyarados", "Bull" };

    int[] MOVIMIENTOS_TIPO = { 0, 1, 2, 3 };

    public static void main(String[] args) {

    }

    // METODOS PARA LA CREACION DE LOS ENTRENADORES CON SUS 6 POKEMON

    public Jugador crearJugador() {
        System.out.println("Introduce el nombre de tu entrenador");
        String nombre = leerTexto();
        return crearJugador(nombre);
    }

    public Jugador crearJugador(String nombre) {
        ArrayList<Pokemon> pokes = crearPokemons(6);
        Jugador jugador = new Jugador(nombre, pokes);
        return jugador;
    }

    // Metodo para crear el array con sus 6 Pokemons
    public ArrayList<Pokemon> crearPokemons(int n) {
        ArrayList<Pokemon> pokes = new ArrayList<Pokemon>();
        for (int i = 0; i < n; i++) {
            Pokemon poke = crearPokemon();
            pokes.add(poke);
        }
        return pokes;
    }

    // METODO PARA CREAR CADA POKEMON
    public Pokemon crearPokemon() {
        String nombre = POKEMON_NOMBRE[(int) Math.floor(Math.random() * POKEMON_NOMBRE.length)];
        int[] tipos = { 0 };
        int vida = (int) Math.floor(Math.random() * 300 + 1);
        int atk = (int) Math.floor(Math.random() * 200 + 1);
        int atksp = (int) Math.floor(Math.random() * 200 + 1);
        int df = (int) Math.floor(Math.random() * 200 + 1);
        int dfsp = (int) Math.floor(Math.random() * 200 + 1);
        int vel = (int) Math.floor(Math.random() * 100 + 1);
        int id = (int) Math.floor(Math.random() * 1000 + 1);

        Pokemon poke = new Pokemon(nombre, tipos, vida, atk, atksp, df, dfsp, vel, id, crearMovimientos(4));

        return poke;
    }

    // METODO PARA CREAR CADA MOVIMIENTO
    public ArrayList<Movimiento> crearMovimientos(int n) {
        ArrayList<Movimiento> movs = new ArrayList<Movimiento>();
        String nombre = MOVIMIENTOS_NOMBRE[(int) Math.floor(Math.random() * MOVIMIENTOS_NOMBRE.length)];
        int pp = (int) Math.floor(Math.random() * 30 + 1);
        int power = (int) Math.floor(Math.random() * 200 + 1);

        for (int i = 0; i < n; i++) {
            movs.add(new Movimiento(nombre, MOVIMIENTOS_TIPO[i], pp, power));
        }
        return movs;
    }

    // METODO PARA INSERTAR DATOS POR TECLADO

    public String leerTexto() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}