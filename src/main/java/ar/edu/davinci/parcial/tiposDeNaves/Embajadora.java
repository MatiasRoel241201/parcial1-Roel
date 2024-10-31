package ar.edu.davinci.parcial.tiposDeNaves;

import ar.edu.davinci.parcial.Nave;

public class Embajadora extends Nave {

    private Integer danio,escudo,combustible, energia, cantConsules;

    public Embajadora(Integer danio, Integer escudo, Integer combustible, Integer energia, Integer cantConsules) {
        super(danio,escudo,combustible,energia);
        this.danio= 0;
        this.cantConsules = cantConsules;
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
        System.out.println("La nave embajadora no emite daño");
    }

    @Override
    public void recibirDanio(Integer danio) {
        this.escudo -= danio;
    }

    public Integer getCantConsules() {
        return this.cantConsules;
    }
}
