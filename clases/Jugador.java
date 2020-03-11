package clases;

import java.util.ArrayList;

public class Jugador{

    private String nombre;
    private ArrayList<Pokemon> pokemons;

    // CREACION DE CONSTRUCTORES

    public Jugador(){}
    public Jugador(String nombre, ArrayList<Pokemon> pokemons){
        this.nombre = nombre;
        this.pokemons = pokemons;
    }

    // METODOS GET Y SET

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public ArrayList<Pokemon> getPokemons(){
        return this.pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons){
        this.pokemons = pokemons;
    }

    // OVERRIDE
    @Override
    public String toString(){
        return "El entrenador se llama "+nombre+" y tiene estos pokemons "+pokemons;
    }
}