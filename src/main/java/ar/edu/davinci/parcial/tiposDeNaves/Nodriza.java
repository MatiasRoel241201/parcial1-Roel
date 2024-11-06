package ar.edu.davinci.parcial.tiposDeNaves;

import ar.edu.davinci.parcial.ConstructorDeNaves;
import ar.edu.davinci.parcial.interfaces.IMisionHandler;
import ar.edu.davinci.parcial.interfaces.INaveNodriza;
import ar.edu.davinci.parcial.Nave;
import ar.edu.davinci.parcial.misiones.Mision;


import java.util.HashSet;
import java.util.Set;

class Nodriza extends Nave implements INaveNodriza, IMisionHandler {

    private Set<Nave> flota;
    private Integer danioOfensivo, capacidadMaxima, danio;
    private ConstructorDeNaves constructor;
    private IMisionHandler siguienteManejador;

    public Nodriza(Integer danio, Integer energia, Integer escudo,Integer combustible, Integer capacidadMaxima, Integer danioOfensivo, ConstructorDeNaves constructor) {
        super(danio, escudo, combustible, energia);
        this.danioOfensivo = danioOfensivo;
        this.capacidadMaxima = capacidadMaxima;
        this.flota = new HashSet<>();
        this.constructor = ConstructorDeNaves.getInstancia();
    }

    @Override
    public void atacar(Nave nave) {
        nave.recibirDano(this.danioOfensivo);
        for (Nave n : flota) {
            n.atacar(nave);
        }
    }


    @Override
    public void agregarNave(Nave nave) {
        flota.add(nave);
    }

    @Override
    public void eliminarNave(Nave nave) {
        if (flota.contains(nave)) flota.remove(nave);
    }

    @Override
    public Integer getDanioOfensivo(){
        return null;
    }

    @Override
    public int modificarDanioParaAtaquePoderoso(int danio) {
        return danio * 2;
    }

    @Override
    public Integer getDanioTotal() {
        Integer danioTotal = danioOfensivo;
        for (Nave nave : flota) {
            danioTotal += nave.getDanio();
        }
        return danioTotal;
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
    public void recibirDanio(Integer danio) {
        this.escudo -= danio;
    }

    @Override
    public void crearNaveAtaque(Integer danio, Integer escudo, Integer combustible, Integer energia, Integer cantTripulantes, Integer cantMisiles) {
        Ataque nuevaNave = constructor.setDanio(danio)
                .setEscudo(escudo)
                .setCombustible(combustible)
                .setEnergia(energia)
                .setCantTripulante(cantTripulantes)
                .getNewNaveAtaque();
        agregarNave(nuevaNave);
    }

    @Override
    public void crearNaveMixta(Integer danio, Integer escudo, Integer combustible, Integer energia, Integer cantTripulantes, Integer cantConsules, Integer cantMisiles) {
        Mixta nuevaNave = constructor.setDanio(danio)
                .setEscudo(escudo)
                .setCombustible(combustible)
                .setEnergia(energia)
                .setCantTripulante(cantTripulantes)
                .setCantConsul(cantConsules)
                .getNewNaveMixta();
        agregarNave(nuevaNave);
    }

    @Override
    public void crearNaveEmbajadora(Integer danio, Integer escudo, Integer combustible, Integer energia, Integer cantConsules) {
        Embajadora nuevaNave = constructor.setDanio(danio)
                .setEscudo(escudo)
                .setCombustible(combustible)
                .setEnergia(energia)
                .setCantConsul(cantConsules)
                .getNewNaveEmbajadora();
        agregarNave(nuevaNave);
    }

    @Override
    public void setSiguienteManejador(IMisionHandler manejador) {
        this.siguienteManejador = manejador;
    }

    @Override
    public void manejarMision(Mision mision) {
        boolean misionManejada = false;

        for (Nave nave : flota) {
            ((IMisionHandler) nave).manejarMision(mision);
            misionManejada = true;
        }

        if (!misionManejada && siguienteManejador != null) {
            siguienteManejador.manejarMision(mision);
        }
    }
}
