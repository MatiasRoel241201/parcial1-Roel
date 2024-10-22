package ar.edu.davinci.parcial;

import ar.edu.davinci.parcial.interfaces.Builder;
import ar.edu.davinci.parcial.interfaces.Nave;
import ar.edu.davinci.parcial.naves.Ataque;

public class ContructorDeNaves implements Builder {
        private int combustible;

        public void setCombustible(int combustible) {
            this.combustible = combustible;
        }

        //TODO: Implemenar los distintosSets para cada uno de los builders.

        public Nave buildAtaque() {
            return new Ataque(this);
        }

        public Nave buildEmbajadora() {
            return new
        }
}
