package ar.edu.davinci.parcial.tiposDeNaves;

import ar.edu.davinci.parcial.Nave;
// --- Patron composite ---
// Clase utilizada como hoja.
public class Embajadora extends Nave {

    private int cantidadDeConsules;

    public Embajadora(Integer danio, Integer escudo, Float combustible) {
        super(danio,escudo,combustible);
    }


    @Override
    public void atacar(Nave nave) {
        System.out.println("Nave de Ataque ataca con daño: ");
    }

    public int calcularDanoNave() {
        return 0;
    }
}
