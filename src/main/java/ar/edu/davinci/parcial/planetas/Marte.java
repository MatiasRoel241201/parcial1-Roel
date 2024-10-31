package ar.edu.davinci.parcial.planetas;

import ar.edu.davinci.parcial.interfaces.IPlaneta;

public class Marte implements IPlaneta {

    private String nombre;
    private Integer distanciaConRespectoATierra;

    public Marte(){
        this.nombre = "Jupiter";
        this.distanciaConRespectoATierra = 325;
    }

    @Override
    public Integer getDistancia() {
        return this.distanciaConRespectoATierra;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}
