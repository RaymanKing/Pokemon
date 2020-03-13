import java.util.ArrayList;
import java.util.Scanner;

import clases.*;

public class Main {

    final static String[] MOVIMIENTOS_NOMBRE = { "Pistola agua", "Llamarada", "Abocajarro", "Placaje", "Descarga",
            "Ascuas", "Tormenta" };

    final static String[] POKEMON_NOMBRE = { "Pikachu", "Charizard", "Squirtel", "RayKou", "Takamachi", "Bulbasur",
            "Norikt", "Stuff", "Gyarados", "Bull" };

    final static int[] MOVIMIENTOS_TIPO = { 0, 1, 2, 3 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleccion;

        Jugador entrenador = crearJugador();

        System.out.println("Bienvenido al mundo Pokemon, vamos a comenzar tu aventura como entrenador");
        System.out.println("Para comenzar el juego pulse 1.");
        eleccion = sc.nextInt();
        boolean juego;

        /*
         * switch (juego) { case 1:
         * 
         * break;
         * 
         * default: break; }
         */

    }

    // METODOS PARA LA CREACION DE LOS ENTRENADORES CON SUS 6 POKEMON

    public static Jugador crearJugador() {
        System.out.println("Introduce el nombre de tu entrenador");
        String nombre = leerTexto();
        return crearJugador(nombre);
    }

    public static Jugador crearJugador(String nombre) {
        ArrayList<Pokemon> pokes = crearPokemons(6);
        Jugador jugador = new Jugador(nombre, pokes);
        return jugador;
    }

    // Metodo para crear el array con sus 6 Pokemons
    public static ArrayList<Pokemon> crearPokemons(int n) {
        ArrayList<Pokemon> pokes = new ArrayList<Pokemon>();
        for (int i = 0; i < n; i++) {
            Pokemon poke = crearPokemon();
            pokes.add(poke);
        }
        return pokes;
    }

    // METODO PARA CREAR CADA POKEMON
    public static Pokemon crearPokemon() {
        String nombre = POKEMON_NOMBRE[(int) Math.floor(Math.random() * POKEMON_NOMBRE.length)];
        int[] tipos = { 0 };
        int vida = (int) Math.floor(Math.random() * 300 + 1);
        int atk = (int) Math.floor(Math.random() * 200 + 1);
        int atksp = (int) Math.floor(Math.random() * 200 + 1);
        int df = (int) Math.floor(Math.random() * 200 + 1);
        int dfsp = (int) Math.floor(Math.random() * 200 + 1);
        int vel = (int) Math.floor(Math.random() * 100 + 1);
        int id = (int) Math.floor(Math.random() * 1000 + 1);

        Pokemon poke = new Pokemon(nombre, tipos, vida, atk, atksp, df, dfsp, vel, id);
        // Añadir movimientos
        for (int i = 0; i < 4; i++) {
            Movimiento mov = crearMovimientos(1).get(0);
            poke.addMovimiento(mov);
        }

        return poke;
    }

    // METODO PARA CREAR CADA MOVIMIENTO
    public static ArrayList<Movimiento> crearMovimientos(int n) {
        ArrayList<Movimiento> movs = new ArrayList<Movimiento>();

        for (int i = 0; i < n; i++) {
            String nombre = MOVIMIENTOS_NOMBRE[(int) Math.floor(Math.random() * MOVIMIENTOS_NOMBRE.length)];
            int pp = (int) Math.floor(Math.random() * 30 + 1);
            int power = (int) Math.floor(Math.random() * 200 + 1);

            movs.add(new Movimiento(nombre, MOVIMIENTOS_TIPO[i], pp, power));
        }
        return movs;
    }

    // METODO PARA INSERTAR DATOS POR TECLADO

    public static String leerTexto() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}