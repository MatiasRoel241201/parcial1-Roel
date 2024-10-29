package ar.edu.davinci.parcial.interfaces;

import ar.edu.davinci.parcial.Nave;

public interface INaveNodriza {
    void agregarNave(Nave nave);
    void eliminarNave(Nave nave);

    Float getDanio();

    Float getDanioTotal();
}
