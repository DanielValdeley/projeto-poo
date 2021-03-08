package personagens;

import java.awt.*;

/* Interface que servirá de gabarito de ações(referente aos personagens) em outras classes */
public interface Acoes {

    // Método desenhar
    void desenhar(Graphics g);

    // Método mover
    void mover(int direcao);

    // Método atacar
    void atacar();
}
