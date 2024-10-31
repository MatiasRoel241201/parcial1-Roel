package ar.edu.davinci.parcial.planetas;

import ar.edu.davinci.parcial.interfaces.IPlaneta;

public class Saturno implements IPlaneta {
    private String nombre;
    private Integer distanciaConRespectoATierra;

    public Saturno(){
        this.nombre = "Saturno";
        this.distanciaConRespectoATierra = 125;
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
