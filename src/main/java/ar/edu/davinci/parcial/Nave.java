package ar.edu.davinci.parcial;

import ar.edu.davinci.parcial.interfaces.INave;

public abstract class Nave implements INave {
    protected Integer danio, escudo, energia, combustible;

    public Nave(Integer danio, Integer escudo, Integer combustible, Integer energia) {
        this.danio = danio;
        this.combustible = combustible;
        this.escudo = 100;
        this.energia = 100;
    }

    public abstract void atacar(Nave nave);

    public abstract Integer getDanioOfensivo();

    public void recibirDano(Integer danio) {
        this.energia -= danio;
    }

    public Integer getDanio(){
        return null;
    }

}

