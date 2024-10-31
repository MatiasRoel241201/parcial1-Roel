package ar.edu.davinci.parcial.tiposDeNaves;

import ar.edu.davinci.parcial.Nave;

public class Mixta extends Nave {

    private Integer danio, escudo, combustible, energia, cantDanioOfensivo, cantTripulantes, cantConsules, cantMisiles;

    public Mixta(Integer danio, Integer escudo, Integer combustible, Integer energia, Integer cantTripulantes, Integer cantConsules, Integer cantMisiles) {
        super(danio,escudo,combustible,energia);
        this.cantTripulantes = cantTripulantes;
        this.cantConsules = cantConsules;
        this.cantMisiles = cantMisiles;
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
        return this.danio;
    }

    @Override
    public void atacar(Nave nave) {
        Integer danioAtaque = this.danio * this.cantTripulantes;
        nave.recibirDano(danioAtaque);
        this.recibirDanio(danioAtaque);
    }

    @Override
    public void recibirDanio(Integer danio) {
        this.escudo -= danio;
    }

    public Integer getCantTripulantes() {
        return this.cantTripulantes;
    }

    public Integer getCantConsules() {
        return this.cantTripulantes;
    }
}
