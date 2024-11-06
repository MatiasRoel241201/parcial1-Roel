package ar.edu.davinci.parcial.ataques;

import ar.edu.davinci.parcial.Nave;
import ar.edu.davinci.parcial.interfaces.IModoDePelea;

public class AtaquePoderoso implements IModoDePelea {
    @Override
    public void ejecutarAtaque(Nave atacante, Nave objetivo) {
        int danio = atacante.getDanioOfensivo();
        objetivo.recibirDano(danio);
    }
}

