package ar.edu.davinci.parcial.naves;

import ar.edu.davinci.parcial.interfaces.Nave;
// --- Patron composite ---
// Clase utilizada como hoja.
public class Mixta extends Nave {

    private int cantDanioOfensivo, cantTripulantes, cantConsules, cantMisiles;

    public Mixta(int combustible) {
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
