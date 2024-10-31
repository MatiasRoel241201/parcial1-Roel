package ar.edu.davinci.parcial.tiposDeNaves;

import ar.edu.davinci.parcial.Nave;
import ar.edu.davinci.parcial.interfaces.IConstructorDeNaves;

public class Ataque extends Nave {

    private Integer danioOfensivo, escudo, combustible, energia, cantidadTripulantes, cantidadMisiles;

    public Ataque(Integer danioOfensivo, Integer combustible,Integer escudo,Integer energia, Integer cantidadTripulantes, Integer cantidadMisiles) {
        super(danioOfensivo,combustible,escudo,energia);
        //TODO: SIEMPRE MAYOR A CERO
        this.cantidadTripulantes = cantidadTripulantes;
        this.cantidadMisiles = cantidadMisiles;
    }


    @Override
    public Integer getCombustible() {
        return this.combustible;
    }

    @Override
    public Integer getNivelEscudo() {
        return this.escudo;
    }

    @Override
    public Integer getEnergia() {
        return this.energia;
    }

    @Override
    public Integer getDanioOfensivo() {
        return this.danio * this.cantidadTripulantes;
    }

    @Override
    public void atacar(Nave nave) {
        nave.recibirDano(this.danioOfensivo);
    }

    @Override
    public void recibirDanio(Integer danio) {
        this.escudo -= danio;
    }

}
