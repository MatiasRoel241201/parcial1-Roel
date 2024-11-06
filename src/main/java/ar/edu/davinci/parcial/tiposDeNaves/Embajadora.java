package ar.edu.davinci.parcial.tiposDeNaves;

import ar.edu.davinci.parcial.Nave;
import ar.edu.davinci.parcial.interfaces.IMisionHandler;
import ar.edu.davinci.parcial.misiones.Mision;

public class Embajadora extends Nave implements IMisionHandler{

    private Integer danio,escudo,combustible, energia, cantConsules;
    private IMisionHandler siguienteManejador;

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
    public int modificarDanioParaAtaquePoderoso(int danio) {
        return 1;
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

    @Override
    public void setSiguienteManejador(IMisionHandler manejador) {
        this.siguienteManejador = manejador;
    }

    @Override
    public void manejarMision(Mision mision) {
        if (mision.getTipo() == Mision.TipoMision.DIPLOMATICA) {
            System.out.println("Nave Embajadora atendiendo misión diplomática en " + mision.getObjetivo());
        } else if (siguienteManejador != null) {
            siguienteManejador.manejarMision(mision);
        }
    }

}
