package poo;

import personagens.Acoes;
import personagens.Aldeao;
import personagens.Arqueiro;
import personagens.Cavaleiro;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Tela extends JPanel {

    //private ArrayList<Aldeao> aldeoes;
    //private ArrayList<Cavaleiro> cavaleiros;

    // Outra versão implementada com conceitos de herança e polimorfismo
    private ArrayList<Acoes> personagens;

    public Tela() {

        this.setBackground(Color.white);
        //this.aldeoes = new ArrayList<>();
        //this.cavaleiros = new ArrayList<>();

        // Outra versão implementada com conceitos de herança e polimorfismo
        this.personagens = new ArrayList<>();
    }

    /**
     * Método que invocado sempre que o JPanel precisa ser resenhado.
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // percorrendo a lista de aldeões e pedindo para cada um se desenhar na tela
        //aldeoes.forEach(aldeao -> aldeao.desenhar(g));
        // percorrendo a lista de cavaleiros e pedindo para cada um se desenhar na tela
        //cavaleiros.forEach(cavaleiro -> cavaleiro.desenhar(g));

        // Outra versão implementada com conceitos de herança e polimorfismo
        personagens.forEach(personagem -> personagem.desenhar(g));

        // liberando o contexto gráfico
        g.dispose();
    }

    /**
     * Cria um aldeao nas coordenadas X e Y, desenha-o neste JPanel
     * e adiciona o mesmo na lista de aldeoes
     *
     * @param x coordenada X
     * @param y coordenada Y
     */
    public void criarAldeao(int x, int y) {
        Aldeao a = new Aldeao(this, "aldeao", x, y);
        a.desenhar(super.getGraphics());
        //aldeoes.add(a);
        // Outra versão implementada com conceitos de herança e polimorfismo
        personagens.add(a);
    }

    /**
     * Atualiza as coordenadas X ou Y de todos os aldeoes
     *
     * @param direcao
     */
    public void movimentarAldeao(int direcao) {
        //aldeoes.forEach(aldeao -> aldeao.mover(direcao));
        // Outra versão implementada com conceitos de herança e polimorfismo
        for(Acoes a: personagens){
            if(a instanceof Aldeao){
                a.mover(direcao);
            }
        }
        // Depois que as coordenadas foram atualizadas é necessário repintar o
        //JPanel
        this.repaint();
    }

    /**
     * Altera o estado do aldeão de atacando para não atacando e vice-versa
     */
    public void atacarAldeao() {
        // Percorrendo a lista de aldeões e pedindo para todos atacarem
        // aldeoes.forEach(aldeao -> aldeao.atacar());

        // Outra versão implementada com conceitos de herança e polimorfismo
        for(Acoes a: personagens){
            if(a instanceof Aldeao){
                a.atacar();
            }
        }
        // Fazendo o JPanel ser redesenhado
        this.repaint();
    }

    /**
     * Cria um cavaleiro nas coordenadas X e Y, desenha-o neste JPanel
     * e adiciona o mesmo na lista de cavaleiro
     *
     * @param x coordenada X
     * @param y coordenada Y
     */
    public void criarCavaleiro(int x, int y) {
        Cavaleiro c = new Cavaleiro(this, "cavaleiro", x, y);
        c.desenhar(super.getGraphics());
        // cavaleiros.add(c);
        // Outra versão implementada com conceitos de herança e polimorfismo
        personagens.add(c);
    }

    /**
     * Atualiza as coordenadas X ou Y de todos os aldeoes
     *
     * @param direcao
     */
    public void movimentarCavaleiro(int direcao) {
        // cavaleiros.forEach(cavaleiro -> cavaleiro.mover(direcao));

        // Outra versão implementada com conceitos de herança e polimorfismo
        for(Acoes a: personagens){
            if(a instanceof Cavaleiro){
                a.mover(direcao);
            }
        }

        // Depois que as coordenadas foram atualizadas é necessário repintar o
        //JPanel
        this.repaint();
    }

    /**
     * Altera o estado do cavaleiro de atacando para não atacando e vice-versa
     */
    public void atacarCavaleiro() {

        // Percorrendo a lista de aldeões e pedindo para todos atacarem
        // cavaleiros.forEach(cavaleiro -> cavaleiro.atacar());

        // Outra versão implementada com conceitos de herança e polimorfismo
        for(Acoes a: personagens){
            if(a instanceof Cavaleiro){
                a.atacar();
            }
        }
        // Fazendo o JPanel ser redesenhado
        this.repaint();
    }

    /**
     * Cria um cavaleiro nas coordenadas X e Y, desenha-o neste JPanel
     * e adiciona o mesmo na lista de cavaleiro
     *
     * @param x coordenada X
     * @param y coordenada Y
     */
    public void criarArqueiro(int x, int y) {
        Arqueiro c = new Arqueiro(this, "arqueiro", x, y);
        c.desenhar(super.getGraphics());
        // cavaleiros.add(c);
        // Outra versão implementada com conceitos de herança e polimorfismo
        personagens.add(c);
    }

    /**
     * Atualiza as coordenadas X ou Y de todos os aldeoes
     *
     * @param direcao
     */
    public void movimentarArqueiro(int direcao) {
        // cavaleiros.forEach(cavaleiro -> cavaleiro.mover(direcao));

        // Outra versão implementada com conceitos de herança e polimorfismo
        for(Acoes a: personagens){
            if(a instanceof Arqueiro){
                a.mover(direcao);
            }
        }
        // Depois que as coordenadas foram atualizadas é necessário repintar o
        //JPanel
        this.repaint();
    }

    /**
     * Altera o estado do cavaleiro de atacando para não atacando e vice-versa
     */
    public void atacarArqueiro() {
        // Percorrendo a lista de aldeões e pedindo para todos atacarem
        // cavaleiros.forEach(cavaleiro -> cavaleiro.atacar());

        // Outra versão implementada com conceitos de herança e polimorfismo
        for(Acoes a: personagens){
            if(a instanceof Arqueiro){
                a.atacar();
            }
        }
        // Fazendo o JPanel ser redesenhado
        this.repaint();
    }
}
