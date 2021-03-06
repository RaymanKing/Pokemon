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
        int masinfo = 0;

        boolean juego;

        System.out.println("Bienvenidos al mundo Pokemon.");
        System.out.println("Vamos a comenzar la aventura.");
        System.out.println("Primero vamos a crear al primer entrenador Pokemon");
        Jugador entrenador1 = crearEntrenadorPokemon();
        System.out.println(entrenador1.toString());
        System.out.println("Si quieres mas informacion de los Pokemons pulse 1");
        masinfo = sc.nextInt();
        if (masinfo == 1) {
            for (int j = 0; j < 6; j++) {
                System.out.println(entrenador1.getPokemons().get(j).getInfo());
            }
            masinfo = 0;
        }
        System.out.println("Ahora vamos a crear el segundo entrenador Pokemon");
        Jugador entrenador2 = crearEntrenadorPokemon2();
        System.out.println(entrenador2.toString());
        System.out.println("Si quieres mas informacion de los Pokemons pulse 1");
        masinfo = sc.nextInt();
        if (masinfo == 1) {
            for (int j = 0; j < 6; j++) {
                System.out.println(entrenador2.getPokemons().get(j).getInfo());
            }
        }
        System.out.println("Ahora vamos a comenzar la batalla sientensen y disfruten");
        System.out.println(batallaPokemon(entrenador1, entrenador2));
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
        int vida = (int) Math.floor(Math.random() * 600 + 1);
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

    // METODO PARA CREAR CADA ENTRENADOR

    public static Jugador crearEntrenadorPokemon() {
        Jugador entrenador1 = crearJugador();
        return entrenador1;
    }

    public static Jugador crearEntrenadorPokemon2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de tu entrenador");
        String nombre = sc.nextLine();
        Jugador entrenador2 = crearJugador(nombre);

        return entrenador2;
    }

    // METODO BATALLA POKEMON

    public static String batallaPokemon(Jugador entrenador1, Jugador entrenador2) {
        int aleatorioPok1 = (int) (Math.random() * 6);
        int aleatorioPok2 = (int) (Math.random() * 6);
        System.out.println("Bienvenido a la batalla Pokemons");
        System.out.println("Entre el entrenador " + entrenador1.getNombre());
        System.out.println("contra el entrenador " + entrenador2.getNombre());
        System.out.println("Vamos a comenzar " + entrenador1.getNombre() + " tiene que sacar un pokemon");
        System.out.println("El entrenador " + entrenador1.getNombre() + " saca a "
                + entrenador1.getPokemons().get(aleatorioPok1).getNombre());
        System.out.println("El entrenador " + entrenador2.getNombre() + " saca a "
                + entrenador2.getPokemons().get(aleatorioPok2).getNombre());
        System.out.println("Comienza el combate el primero en atacar sera el Pokemon con mas velocidad");
        String ganador = "nadie";
        if (entrenador1.getPokemons().get(aleatorioPok1).getVel() > entrenador2.getPokemons().get(aleatorioPok2)
                .getVel()) {
            int vida = 10;
            while (vida > 0) {
                int ataque = entrenador1.getPokemons().get(aleatorioPok1).getAt();
                vida = entrenador2.getPokemons().get(aleatorioPok2).getPs();
                vida = vida - ataque;
                entrenador2.getPokemons().get(aleatorioPok2).setPs(vida);
                System.out.println(entrenador1.getPokemons().get(aleatorioPok1).getNombre() + " ataca a "
                        + entrenador2.getPokemons().get(aleatorioPok2).getNombre() + " dejandolo a "
                        + entrenador2.getPokemons().get(aleatorioPok2).getPs() + " de HP");
                if (entrenador2.getPokemons().get(aleatorioPok2).getPs() <= 0) {
                    System.out.println(
                            entrenador2.getPokemons().get(aleatorioPok2).getNombre() + " se ha quedado sin vida.");
                    ganador = "El ganador es " + entrenador1.getNombre();
                } else {
                    ataque = entrenador2.getPokemons().get(aleatorioPok2).getAt();
                    vida = entrenador1.getPokemons().get(aleatorioPok1).getPs();
                    vida = vida - ataque;
                    entrenador1.getPokemons().get(aleatorioPok1).setPs(vida);
                    System.out.println(entrenador2.getPokemons().get(aleatorioPok2).getNombre() + " ataca a "
                            + entrenador1.getPokemons().get(aleatorioPok1).getNombre() + " dejandolo a "
                            + entrenador1.getPokemons().get(aleatorioPok1).getPs() + " de HP");
                    if (entrenador1.getPokemons().get(aleatorioPok1).getPs() <= 0) {
                        System.out.println(
                                entrenador1.getPokemons().get(aleatorioPok1).getNombre() + " se ha quedado sin vida.");
                        ganador = "El ganador es " + entrenador2.getNombre();
                    }
                }

            }
        } else {
            int vida = 10;
            while (vida > 0) {
                int ataque = entrenador2.getPokemons().get(aleatorioPok2).getAt();
                vida = entrenador1.getPokemons().get(aleatorioPok1).getPs();
                vida = vida - ataque;
                entrenador2.getPokemons().get(aleatorioPok2).setPs(vida);
                System.out.println(entrenador2.getPokemons().get(aleatorioPok2).getNombre() + " ataca a "
                        + entrenador1.getPokemons().get(aleatorioPok1).getNombre() + " dejandolo a "
                        + entrenador1.getPokemons().get(aleatorioPok1).getPs() + " de HP");
                if (entrenador1.getPokemons().get(aleatorioPok1).getPs() <= 0) {
                    System.out.println(
                            entrenador1.getPokemons().get(aleatorioPok1).getNombre() + " se ha quedado sin vida.");
                    ganador = "El ganador es " + entrenador1.getNombre();
                } else {
                    ataque = entrenador1.getPokemons().get(aleatorioPok1).getAt();
                    vida = entrenador2.getPokemons().get(aleatorioPok2).getPs();
                    vida = vida - ataque;
                    entrenador1.getPokemons().get(aleatorioPok1).setPs(vida);
                    System.out.println(entrenador1.getPokemons().get(aleatorioPok1).getNombre() + " ataca a "
                            + entrenador2.getPokemons().get(aleatorioPok2).getNombre() + " dejandolo a "
                            + entrenador2.getPokemons().get(aleatorioPok2).getPs() + " de HP");
                    if (entrenador1.getPokemons().get(aleatorioPok1).getPs() <= 0) {
                        System.out.println(
                                entrenador1.getPokemons().get(aleatorioPok1).getNombre() + " se ha quedado sin vida.");
                        ganador = "El ganador es " + entrenador2.getNombre();
                    }
                }
            }
        }
        return ganador;
    }

}