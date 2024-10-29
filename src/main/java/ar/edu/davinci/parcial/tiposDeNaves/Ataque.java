package ar.edu.davinci.parcial.tiposDeNaves;

import ar.edu.davinci.parcial.Nave;
// --- Patron composite ---
// Clase utilizada como hoja.
public class Ataque extends Nave {

    private int cantidadTripulantes, danioOfensivo, cantidadMisiles;

    public Ataque(Integer danio, Integer escudo, Float combustible) {
        super(danio,escudo,combustible);
    }

    @Override
    public void atacar(Nave nave) {
        System.out.println("Nave de Ataque ataca con daño: ");
    }

    @Override
    public int calcularDanoNave() {
        return 0;
    }

}
