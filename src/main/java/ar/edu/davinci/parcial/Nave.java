package ar.edu.davinci.parcial;

import ar.edu.davinci.parcial.interfaces.INave;
import ar.edu.davinci.parcial.interfaces.IPlaneta;

public abstract class Nave implements INave {
    protected Integer danio, escudo, energia, combustible;
    private int contadorAtaques = 0; // Inicializado en 0
    private static final Integer CONSUMO_POR_ANIO_LUZ = 1;

    public Nave(Integer danio, Integer escudo, Integer combustible, Integer energia) {
        this.danio = danio;
        this.escudo = escudo != null ? escudo : 100; // Escudo inicial configurable
        this.energia = energia != null ? energia : 100; // Energía inicial configurable
        this.combustible = combustible;
    }

    public abstract void atacar(Nave nave);

    public abstract Integer getDanioOfensivo();

    public void aumentarEscudo(double porcentaje) {
        int aumento = (int) (this.escudo * (porcentaje / 100));
        this.escudo += aumento;
        System.out.println("Escudo aumentado en " + aumento + " puntos. Escudo actual: " + this.escudo);
    }

    public abstract int modificarDanioParaAtaquePoderoso(int danio);

    public int calcularDanio() {
        return this.getDanioOfensivo() * 2;
    }

    public Integer getDanio(){
        return this.danio;
    }

    protected void reiniciarModoPelea() {
        contadorAtaques = 0;
        System.out.println("Modos de pelea reiniciados después de 10 ataques.");
    }

    public void recibirDano(Integer danio) {
        this.energia -= danio;
    }

    @Override
    public boolean viajarAOtroPlaneta(IPlaneta planeta) {
        Integer distancia = planeta.getDistancia();
        Integer combustibleNecesario = distancia * CONSUMO_POR_ANIO_LUZ;

        if (this.combustible >= combustibleNecesario) {
            this.combustible -= combustibleNecesario;
            System.out.println("La nave ha viajado a " + planeta.getNombre());
            return true;
        } else {
            System.out.println("No hay suficiente combustible para llegar a " + planeta.getNombre());
            return false;
        }
    }
}
