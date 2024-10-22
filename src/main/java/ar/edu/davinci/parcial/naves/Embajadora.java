package ar.edu.davinci.parcial.naves;

import ar.edu.davinci.parcial.interfaces.Nave;
// --- Patron composite ---
// Clase utilizada como hoja.
public class Embajadora extends Nave {

    private int cantidadDeConsules;

    public Embajadora(int combustible, int danioOfensivo) {
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
