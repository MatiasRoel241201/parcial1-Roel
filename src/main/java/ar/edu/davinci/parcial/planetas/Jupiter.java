package ar.edu.davinci.parcial.planetas;

import ar.edu.davinci.parcial.interfaces.IPlaneta;

public class Jupiter implements IPlaneta {
    private String nombre;
    private Integer distanciaConRespectoATierra;

    public Jupiter(){
        this.nombre = "Jupiter";
        this.distanciaConRespectoATierra = 225;
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
