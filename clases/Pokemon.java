package clases;

import java.util.ArrayList;

public class Pokemon {

    private String nombre;
    private int[] tipo;
    private ArrayList<Movimiento> movimientos;
    private int ps;
    private int at;
    private int ats;
    private int df;
    private int dfs;
    private int vel;
    private int id;

    // CREACION DE CONSTRUCTORES
    public Pokemon() {
    }

    public Pokemon(int id) {
        // Cargar de BBDD FICHERO O API
    }

    public Pokemon(String nombre, int[] tipo, int ps, int at, int ats, int df, int dfs, int vel, int id,
            ArrayList<Movimiento> movimientos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ps = ps;
        this.at = at;
        this.ats = ats;
        this.df = df;
        this.dfs = dfs;
        this.vel = vel;
        this.id = id;
        this.movimientos = movimientos;
    }

    // METODOS GET Y SET

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getTipo() {
        return this.tipo;
    }

    public void setTipo(int[] tipo) {
        this.tipo = tipo;
    }

    public int getPs() {
        return this.ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getAt() {
        return this.at;
    }

    public void setAt(int at) {
        this.at = at;
    }

    public int getAts() {
        return this.ats;
    }

    public void setAts(int ats) {
        this.ats = ats;
    }

    public int getDf() {
        return this.df;
    }

    public void setDf(int df) {
        this.df = df;
    }

    public int getDfs() {
        return this.dfs;
    }

    public void setDfs(int dfs) {
        this.dfs = dfs;
    }

    public int getVel() {
        return this.vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public int getId() {
        return this.vel;
    }

    public void setId(int id) {
        this.id = id;
    }

    // METODO OVERRIDE
    @Override
    public String toString() {
        return nombre + " es de tipo " + tipo + " con el id " + id;
    }

    public String getInfo() {
        return "Las caracteristicas de " + nombre + " son [Ataque " + at + "| Ataque especial " + ats + "][Defensa "
                + df + "| Defensa especial " + dfs + "][Velocidad " + vel + "]";
    }
}
