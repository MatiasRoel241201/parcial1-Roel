package ar.edu.davinci.parcial;

import ar.edu.davinci.parcial.interfaces.Builder;
import ar.edu.davinci.parcial.interfaces.Nave;

public class ContructorDeNaves implements Builder {
        private int combustible;

        public void setCombustible(int combustible) {
            this.combustible = combustible;
        }

        public Nave build() {
            return new Nave(this) {
            };
        }
}
