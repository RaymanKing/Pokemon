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

        Pokemon poke = new Pokemon(nombre, tipos, (int) Math.floor(Math.random() * 20 + 1), /* Vida */
                (int) Math.floor(Math.random() * 50 + 1), /* Ataque */
                (int) Math.floor(Math.random() * 20 + 1), /* Ataque especial */
                (int) Math.floor(Math.random() * 20 + 1), /* Defensa */
                (int) Math.floor(Math.random() * 20 + 1), /* Defensa especial */
                (int) Math.floor(Math.random() * 20 + 1), /* Velocidad */
                (int) Math.floor(Math.random() * 500 + 1), /* Id */
                crearMovimientos(4));

        return poke;
    }

    // METODO PARA CREAR CADA MOVIMIENTO
    public ArrayList<Movimiento> crearMovimientos(int n) {
        ArrayList<Movimiento> movs = new ArrayList<Movimiento>();
        String nombre = MOVIMIENTOS_NOMBRE[(int) Math.floor(Math.random() * MOVIMIENTOS_NOMBRE.length)];

        for (int i = 0; i < n; i++) {
            movs.add(new Movimiento(nombre, MOVIMIENTOS_TIPO[i], (int) Math.floor(Math.random() * 20 + 1),
                    (int) Math.floor(Math.random() * 500 + 1)));
        }
        return movs;
    }

    // METODO PARA INSERTAR DATOS POR TECLADO

    public String leerTexto() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}