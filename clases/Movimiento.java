package clases;

public class Movimiento {

    public String nombre;
    public int tipo;
    public int pp;
    public int power;

    // CREACION DE CONSTRUCTOR
    public Movimiento() {
    }

    public Movimiento(String nombre, int tipo, int pp, int power) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.pp = pp;
        this.power = power;
    }

    // METODOS GET Y SET

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPp() {
        return this.pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getDanio() {
        return this.power;
    }

    public void setDanio(int power) {
        this.power = power;
    }

    // METODO OVERRIDE
    @Override
    public String toString() {
        return nombre + " es de tipo " + tipo + " tiene un PP: " + pp + " y un danio de " + power;
    }

    public void add(Movimiento movimiento) {
    }
}