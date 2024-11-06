package ar.edu.davinci.parcial.interfaces;

import ar.edu.davinci.parcial.misiones.Mision;

public interface IMisionHandler {
    void setSiguienteManejador(IMisionHandler manejador);
    void manejarMision(Mision mision);
}
