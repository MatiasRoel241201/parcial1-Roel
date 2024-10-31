package ar.edu.davinci.parcial.interfaces;

import ar.edu.davinci.parcial.Nave;

public interface INaveNodriza {
    void agregarNave(Nave nave);
    void eliminarNave(Nave nave);
    Integer getDanioOfensivo();
    Integer getDanioTotal();

    void crearNaveAtaque(Integer danio, Integer escudo, Integer combustible, Integer energia, Integer cantTripulantes, Integer cantMisiles);
    void crearNaveMixta(Integer danio, Integer escudo, Integer combustible, Integer energia, Integer cantTripulantes, Integer cantConsules, Integer cantMisiles);
    void crearNaveEmbajadora(Integer danio, Integer escudo, Integer combustible, Integer energia, Integer cantConsules);
}
