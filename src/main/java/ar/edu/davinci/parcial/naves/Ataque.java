package ar.edu.davinci.parcial.naves;

import ar.edu.davinci.parcial.interfaces.Nave;
// --- Patron composite ---
// Clase utilizada como hoja.
public class Ataque extends Nave {

    private int cantidadTripulantes, danioOfensivo, cantidadMisiles;

    public Ataque(int combustible) {
        super(combustible);
    }

    @Override
    public void atacar() {
        System.out.println("Nave de Ataque ataca con daño: ");
    }

    @Override
    public int calcularDanoNave() {
        return 0;
    }

}
