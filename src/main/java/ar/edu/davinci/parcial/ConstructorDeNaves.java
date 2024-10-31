package ar.edu.davinci.parcial;

import ar.edu.davinci.parcial.interfaces.IConstructorDeNaves;
import ar.edu.davinci.parcial.tiposDeNaves.Ataque;
import ar.edu.davinci.parcial.tiposDeNaves.Embajadora;
import ar.edu.davinci.parcial.tiposDeNaves.Mixta;

public class ConstructorDeNaves implements IConstructorDeNaves {

    private static ConstructorDeNaves instancia;

    private Integer danio, escudo, energia, cantTripulantes, cantConsules, cantMisiles, combustible;

    private ConstructorDeNaves() {}

    public static ConstructorDeNaves getInstancia() {
        if (instancia == null) {
            instancia = new ConstructorDeNaves();
        }
        return instancia;
    }

    @Override
    public ConstructorDeNaves setCombustible(Integer combustible) {
        this.combustible = combustible;
        return this;
    }

    @Override
    public ConstructorDeNaves setEscudo(Integer escudo) {
        this.escudo = escudo;
        return this;
    }

    @Override
    public ConstructorDeNaves setEnergia(Integer energia) {
        this.energia = energia;
        return this;
    }

    @Override
    public ConstructorDeNaves setDanio(Integer danio) {
        this.danio = danio;
        return this;
    }

    @Override
    public ConstructorDeNaves setCantTripulante(Integer cantTripulantes) {
        this.cantTripulantes = cantTripulantes;
        return this;
    }

    @Override
    public ConstructorDeNaves setCantConsul(Integer cantConsul) {
        this.cantConsules = cantConsul;
        return this;
    }

    private void resetearCampos() {
        this.danio = 0;
        this.cantTripulantes = 0;
        this.cantConsules = 0;
        this.cantMisiles = 0;
        this.combustible = 0;
    }

    @Override
    public Ataque getNewNaveAtaque() {
        Ataque nave = new Ataque(this.danio, this.escudo, this.combustible, this.energia, this.cantTripulantes, this.cantMisiles);
        this.resetearCampos();

        return nave;
    }

    @Override
    public Mixta getNewNaveMixta() {
        Mixta nave = new Mixta(this.danio, this.escudo, this.combustible, this.energia, this.cantTripulantes, this.cantConsules, this.cantMisiles);
        this.resetearCampos();

        return nave;
    }

    @Override
    public Embajadora getNewNaveEmbajadora() {
        Embajadora nave = new Embajadora(this.danio, this.escudo, this.combustible, this.energia,this.cantConsules);
        this.resetearCampos();

        return nave;
    }


}

