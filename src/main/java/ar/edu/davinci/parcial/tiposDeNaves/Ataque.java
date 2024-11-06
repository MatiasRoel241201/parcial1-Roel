package ar.edu.davinci.parcial.tiposDeNaves;

import ar.edu.davinci.parcial.Nave;
import ar.edu.davinci.parcial.interfaces.IConstructorDeNaves;
import ar.edu.davinci.parcial.interfaces.IMisionHandler;
import ar.edu.davinci.parcial.misiones.Mision;

public class Ataque extends Nave implements IMisionHandler {

    private Integer danioOfensivo, escudo, combustible, energia, cantidadTripulantes, cantidadMisiles, contadorAtaques;
    private IMisionHandler siguienteManejador;

    public Ataque(Integer danioOfensivo, Integer combustible,Integer escudo,Integer energia, Integer cantidadTripulantes, Integer cantidadMisiles) {
        super(danioOfensivo,combustible,escudo,energia);
        this.cantidadTripulantes = cantidadTripulantes;
        this.cantidadMisiles = cantidadMisiles;
        this.contadorAtaques = 0;
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
    public int modificarDanioParaAtaquePoderoso(int danio) {
        return danio * 2;
    }

    @Override
    public void atacar(Nave nave) {
        Integer danioDeAtaque = nave.calcularDanio();
        if (contadorAtaques >= 10) {
            reiniciarModoPelea();
        }else{
            nave.recibirDano(danioDeAtaque);
        }
    }

    @Override
    public void recibirDanio(Integer danio) {
        this.escudo -= danio;
    }

    @Override
    public void setSiguienteManejador(IMisionHandler manejador) {
        this.siguienteManejador = manejador;
    }

    @Override
    public void manejarMision(Mision mision) {
        if (mision.getTipo() == Mision.TipoMision.BELICA) {
            System.out.println("Nave de Ataque atendiendo misión bélica contra " + mision.getObjetivo());
        } else if (siguienteManejador != null) {
            siguienteManejador.manejarMision(mision);
        }
    }
}
