package ar.edu.davinci.parcial.misiones;

public class Mision {
    public enum TipoMision {
        BELICA,
        DIPLOMATICA,
        TRANSITO_HOSTIL
    }

    private TipoMision tipo;
    private String objetivo;

    public Mision(TipoMision tipo, String objetivo) {
        this.tipo = tipo;
        this.objetivo = objetivo;
    }

    public TipoMision getTipo() {
        return tipo;
    }

    public String getObjetivo() {
        return objetivo;
    }
}

