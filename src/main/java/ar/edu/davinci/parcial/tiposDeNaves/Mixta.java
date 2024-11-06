package ar.edu.davinci.parcial.tiposDeNaves;

import ar.edu.davinci.parcial.Nave;
import ar.edu.davinci.parcial.interfaces.IMisionHandler;
import ar.edu.davinci.parcial.misiones.Mision;

public class Mixta extends Nave implements IMisionHandler{

    private Integer danio, escudo, combustible, energia, cantDanioOfensivo, cantTripulantes, cantConsules, cantMisiles;
    private IMisionHandler siguienteManejador;

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
    public int modificarDanioParaAtaquePoderoso(int danio) {
        return danio * 2;
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

    @Override
    public void setSiguienteManejador(IMisionHandler manejador) {
        this.siguienteManejador = manejador;
    }

    @Override
    public void manejarMision(Mision mision) {
        if (mision.getTipo() == Mision.TipoMision.BELICA) {
            System.out.println("Nave Mixta atendiendo misión bélica y atacando " + mision.getObjetivo());
        } else if (mision.getTipo() == Mision.TipoMision.DIPLOMATICA) {
            System.out.println("Nave Mixta atendiendo misión diplomática en " + mision.getObjetivo());
        } else if (siguienteManejador != null) {
            siguienteManejador.manejarMision(mision);
        }
    }
}
