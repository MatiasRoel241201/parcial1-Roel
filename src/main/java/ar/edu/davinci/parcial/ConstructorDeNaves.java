package ar.edu.davinci.parcial;

import ar.edu.davinci.parcial.interfaces.IConstructorDeNaves;
import ar.edu.davinci.parcial.tiposDeNaves.Ataque;

public class ConstructorDeNaves implements IConstructorDeNaves {

    private static ConstructorDeNaves constructor;

    private float combustible;

    private Integer danio, energia, escudo, cantDeConsules, cantTripulantes, cantMisiles;


    private ConstructorDeNaves(){

    }

    public static final ConstructorDeNaves getInstancia() {
        if (constructor == null) {
            constructor = new ConstructorDeNaves();
        }
        return constructor;
    }

    @Override
    public Nave getResultado(){
        Ataque nave = new Ataque(this.danio, this.cantTripulantes, this.combustible);
        this.resetearCampos();
        return nave;
    }

    public void resetearCampos(){
        //TODO: Agregar todos los campos
        this.cantTripulantes = 0;
    }


    public ConstructorDeNaves agregarTripulante(){
        this.cantTripulantes += 1;
        return this;
    }

    public ConstructorDeNaves agregarCombustible(Integer combustible){

    }

    public ConstructorDeNaves agregarEnergia(Integer energia){

    }

    public ConstructorDeNaves agregarEscudo(Integer escudo){

    }

    public ConstructorDeNaves agregarMisiles(Integer misil){

    }
}
