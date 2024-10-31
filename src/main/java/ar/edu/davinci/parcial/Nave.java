package ar.edu.davinci.parcial;

import ar.edu.davinci.parcial.interfaces.INave;
import ar.edu.davinci.parcial.interfaces.IPlaneta;

public abstract class Nave implements INave {
    protected Integer danio, escudo, energia, combustible;
    private static final Integer CONSUMO_POR_ANIO_LUZ = 1;

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

    @Override
    public boolean viajarAOtroPlaneta(IPlaneta planeta) {
        Integer distancia = planeta.getDistancia();
        Integer combustibleNecesario = distancia * CONSUMO_POR_ANIO_LUZ;

        if (this.combustible >= combustibleNecesario) {
            this.combustible -= combustibleNecesario;
            System.out.println("La nave ha viajado a " + planeta.getNombre());
            return true;
        } else {
            System.out.println("No hay suficiente combustible para llegar a " + planeta.getNombre());
            return false;
        }
    }

}

