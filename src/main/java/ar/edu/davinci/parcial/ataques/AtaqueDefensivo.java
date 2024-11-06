package ar.edu.davinci.parcial.ataques;

import ar.edu.davinci.parcial.Nave;
import ar.edu.davinci.parcial.interfaces.IModoDePelea;

public class AtaqueDefensivo implements IModoDePelea {
    @Override
    public void ejecutarAtaque(Nave atacante, Nave objetivo) {
        int danio = (int) (atacante.getDanioOfensivo() * 1.1);
        objetivo.recibirDano(danio);
        atacante.aumentarEscudo(10);
    }
}
