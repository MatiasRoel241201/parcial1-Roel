import ar.edu.davinci.parcial.ConstructorDeNaves;
import ar.edu.davinci.parcial.interfaces.INaveNodriza;
import ar.edu.davinci.parcial.Nave;

import java.util.HashSet;
import java.util.Set;

class Nodriza extends Nave implements INaveNodriza {

    private Set<Nave> flota;

    private Float danioOfensivo;
    private int capacidadMaxima;
    private ConstructorDeNaves constructor;

    public Nodriza(Integer danio, Integer escudo,Float combustible, int capacidadMaxima, Float danioOfensivo, Constructorflota constructor) {
        super(danio, escudo, combustible);
        this.danioOfensivo = danioOfensivo;
        this.capacidadMaxima = capacidadMaxima;
        this.flota = new HashSet<>();
        this.constructor = ConstructorDeNaves.getInstancia();
    }

    @Override
    public void atacar(Nave nave) {
        nave.recibirDano(this.getDanio());
        this.flota.stream().forEach( nav -> nav.atacar(nave));
    }

    @Override
    public void agregarNave(Nave nave) {
        if (nave != null) flota.add(nave);
    }

    public ConstructorDeNaves agregarTripulante(){
        return constructor.agregarTripulante();
    }

    public void agregarNaveDeAtaqueConstruida(){

    }


    @Override
    public void eliminarNave(Nave nave) {
        if (flota.contains(nave)) flota.remove(nave);
    }


    public Float getDanio(){
    return 02f;
    }

    @Override
    public Float getDanioTotal() {
        Float danioTotal = danioOfensivo;
        for (Nave nave : flota) {
            danioTotal += nave.calcularDanoNave();
        }
        return danioTotal;
    }
}
