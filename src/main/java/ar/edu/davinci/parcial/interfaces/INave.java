package ar.edu.davinci.parcial.interfaces;

import ar.edu.davinci.parcial.Nave;

public interface INave {
    Integer getCombustible();
    Integer getNivelEscudo();
    Integer getEnergia();
    Integer getDanioOfensivo();

    void atacar(Nave nave);
    void recibirDanio(Integer danio);
}
