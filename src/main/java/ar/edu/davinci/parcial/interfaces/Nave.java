package ar.edu.davinci.parcial.interfaces;
// --- Patron composite ---
// Esta clase es la utilizo para modelar el comportamiento en comun que tienen mis clases
public abstract class Nave {
    protected int energia, escudo, combustible;

    public Nave(int combustible) {
        this.combustible = combustible;
        this.escudo = 100;
        this.energia = 100;
    }

    public abstract void atacar();

    public abstract int calcularDanoNave();

    public void recibirDano(int dano) {
        escudo -= dano;
        if (escudo < 0) escudo = 0;
    }

    public boolean estaActiva() {
        return escudo > 0;
    }
}

