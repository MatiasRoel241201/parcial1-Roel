package ar.edu.davinci.parcial.interfaces;

import ar.edu.davinci.parcial.ConstructorDeNaves;
import ar.edu.davinci.parcial.tiposDeNaves.Ataque;
import ar.edu.davinci.parcial.tiposDeNaves.Embajadora;
import ar.edu.davinci.parcial.tiposDeNaves.Mixta;

public interface IConstructorDeNaves {
    ConstructorDeNaves setCombustible(Integer combustible);
    ConstructorDeNaves setEscudo(Integer escudo);
    ConstructorDeNaves setEnergia(Integer energia);
    ConstructorDeNaves setDanio(Integer danio);
    ConstructorDeNaves setCantTripulante(Integer cantTripulantes);
    ConstructorDeNaves setCantConsul(Integer cantConsul);

    Ataque getNewNaveAtaque();
    Mixta getNewNaveMixta();
    Embajadora getNewNaveEmbajadora();
}
