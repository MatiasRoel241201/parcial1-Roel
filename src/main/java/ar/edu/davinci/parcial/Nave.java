package ar.edu.davinci.parcial;

import ar.edu.davinci.parcial.interfaces.INave;

// --- Patron composite ---
// Esta clase es la utilizo para modelar el comportamiento en comun que tienen mis clases
public abstract class Nave implements INave {
    protected Integer danio, escudo, energia;
    protected Float combustible;

    public Nave(Integer danio, Integer escudo, Float combustible) {
        this.combustible = combustible;
        this.escudo = 100;
        this.energia = 100;
    }

    public abstract void atacar(Nave nave);

    public abstract int calcularDanoNave();

    public void recibirDano(Integer danio) {
        this.energia -= danio;
    }

    public Integer getDanio(){
        return null;
    }

    public boolean estaActiva() {
        return escudo > 0;
    }
}

