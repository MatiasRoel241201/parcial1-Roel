import ar.edu.davinci.parcial.interfaces.Nave;

import java.util.ArrayList;
import java.util.List;

class Nodriza extends Nave {
    private int capacidadMaxima, danioOfensivo;
    private List<Nave> naves;
    private ConstructorNaves constructor;

    public Nodriza(int combustible, int capacidadMaxima, int danioOfensivo, ConstructorNaves constructor) {
        super(combustible);
        this.danioOfensivo = danioOfensivo;
        this.capacidadMaxima = capacidadMaxima;
        this.naves = new ArrayList<>();
        this.constructor = constructor;
    }

    public void agregarNave(Nave nave) {
        if (naves.size() < capacidadMaxima) {
            if (nave != null) naves.add(nave);
        }
        //TODO: Si supera la cantidad maxima lanzar exepcion
    }

    public void eliminarNave(Nave nave) {
        if (naves.contains(nave)) naves.remove(nave);
    }

    public int calcularDanioTotal() {
        int danioTotal = danioOfensivo;
        for (Nave nave : naves) {
            danioTotal += nave.calcularDanoNave();
        }
        return danioTotal;
    }

    public void atacar(Nave enemigo) {
        int danio = calcularDanioTotal();
        enemigo.recibirDano(danio);
        System.out.println("Nave Nodriza ataca con daño total: " + danio);
    }
}
