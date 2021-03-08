package poo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Principal {
    private JPanel principal;
    private JPanel painelLateral;
    private JPanel painelTela;
    private JButton bCriaAldeao;
    private JButton bCriaArqueiro;
    private JButton bCriaCavaleiro;
    private JRadioButton todosRadioButton;
    private JRadioButton aldeaoRadioButton;
    private JRadioButton arqueiroRadioButton;
    private JRadioButton cavaleiroRadioButton;
    private JButton atacarButton;
    private JButton buttonCima;
    private JButton buttonEsquerda;
    private JButton buttonBaixo;
    private JButton buttonDireita;
    private JLabel logo;
    private Random sorteio;

    public Principal() {
        this.sorteio = new Random();

        atacarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (aldeaoRadioButton.isSelected()) {
                    ((Tela) painelTela).atacarAldeao();
                }
                if (cavaleiroRadioButton.isSelected()) {
                    ((Tela) painelTela).atacarCavaleiro();
                }
                if (arqueiroRadioButton.isSelected()) {
                    ((Tela) painelTela).atacarArqueiro();
                }

                // Caso botão todos estiver selecionado, então todos irão atacar
                if (todosRadioButton.isSelected()){
                    ((Tela) painelTela).atacarAldeao();
                    ((Tela) painelTela).atacarCavaleiro();
                    ((Tela) painelTela).atacarArqueiro();
                }

            }
        });

        buttonCima.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (aldeaoRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarAldeao(0);
                }
                if(cavaleiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarCavaleiro(0);
                }
                if (arqueiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarArqueiro(0);
                }

                // Caso botão todos estiver selecionado, então todos irão movimentar para cima
                if (todosRadioButton.isSelected()){
                    ((Tela) painelTela).movimentarAldeao(0);
                    ((Tela) painelTela).movimentarCavaleiro(0);
                    ((Tela) painelTela).movimentarArqueiro(0);
                }
            }
        });

        buttonBaixo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (aldeaoRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarAldeao(1);
                }
                if (cavaleiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarCavaleiro(1);
                }
                if (arqueiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarArqueiro(1);
                }

                // Caso botão todos estiver selecionado, então todos irão movimentar para baixo
                if (todosRadioButton.isSelected()){
                    ((Tela) painelTela).movimentarAldeao(1);
                    ((Tela) painelTela).movimentarCavaleiro(1);
                    ((Tela) painelTela).movimentarArqueiro(1);
                }
            }
        });

        buttonEsquerda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (aldeaoRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarAldeao(2);
                }
                if (cavaleiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarCavaleiro(2);
                }
                if (arqueiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarArqueiro(2);
                }

                // Caso botão todos estiver selecionado, então todos irão movimentar para esquerda
                if (todosRadioButton.isSelected()){
                    ((Tela) painelTela).movimentarAldeao(2);
                    ((Tela) painelTela).movimentarCavaleiro(2);
                    ((Tela) painelTela).movimentarArqueiro(2);
                }
            }
        });

        buttonDireita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO preciso ser melhorado
                if (aldeaoRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarAldeao(3);
                }
                if (cavaleiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarCavaleiro(3);
                }
                if (arqueiroRadioButton.isSelected()) {
                    ((Tela) painelTela).movimentarArqueiro(3);
                }

                // Caso botão todos estiver selecionado, então todos irão movimentar para esquerda
                if (todosRadioButton.isSelected()){
                    ((Tela) painelTela).movimentarAldeao(3);
                    ((Tela) painelTela).movimentarCavaleiro(3);
                    ((Tela) painelTela).movimentarArqueiro(3);
                }
            }
        });

        bCriaAldeao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //obtendo o tamanho do JPanel TELA
                int largura = painelTela.getWidth();
                int altura = painelTela.getHeight();

                // criando o aldeao em um local aleatorio
                int x = sorteio.nextInt(largura - 50);
                int y = sorteio.nextInt(altura - 50);
                if (x < 0) { // garantindo que x não esteja fora do limite do JPanel
                    x = 0;
                }
                if (y < 0) { // garantindo que x não esteja fora do limite do JPanel
                    y = 0;
                }

                // invocando o método criarAldeao da classe Tela.
                // Foi necessário a coerção de tipos pois painelTela é do tipo JPanel.
                // Isso só foi possível pois Tela é uma subclasse de JPanel.
                ((Tela) painelTela).criarAldeao(x, y);
            }
        });

        bCriaArqueiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "Preciso ser implementado", "Criar Arqueiro", JOptionPane.INFORMATION_MESSAGE);
                //obtendo o tamanho do JPanel TELA
                int largura = painelTela.getWidth();
                int altura = painelTela.getHeight();

                // criando o aldeao em um local aleatorio
                int x = sorteio.nextInt(largura - 50);
                int y = sorteio.nextInt(altura - 50);
                if (x < 0) { // garantindo que x não esteja fora do limite do JPanel
                    x = 0;
                }
                if (y < 0) { // garantindo que x não esteja fora do limite do JPanel
                    y = 0;
                }

                // invocando o método criarArqueiro da classe Tela.
                // Foi necessário a coerção de tipos pois painelTela é do tipo JPanel.
                // Isso só foi possível pois Tela é uma subclasse de JPanel.
                ((Tela) painelTela).criarArqueiro(x, y);
            }
        });

        bCriaCavaleiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "Preciso ser implementado", "Criar Cavaleiro", JOptionPane.INFORMATION_MESSAGE);
                //obtendo o tamanho do JPanel TELA
                int largura = painelTela.getWidth();
                int altura = painelTela.getHeight();

                // criando o Cavaleiro em um local aleatorio
                int x = sorteio.nextInt(largura - 50);
                int y = sorteio.nextInt(altura - 50);
                if (x < 0) { // garantindo que x não esteja fora do limite do JPanel
                    x = 0;
                }
                if (y < 0) { // garantindo que x não esteja fora do limite do JPanel
                    y = 0;
                }

                // invocando o método criarCavaleiro da classe Tela.
                // Foi necessário a coerção de tipos pois painelTela é do tipo JPanel.
                // Isso só foi possível pois Tela é uma subclasse de JPanel.
                ((Tela) painelTela).criarCavaleiro(x, y);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java of Empires");
        Principal p = new Principal();
        frame.setContentPane(p.principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // não será possível redimensionar a janela
        frame.setResizable(false);
        frame.pack();

        // janela deverá ficar centralizada
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        this.painelTela = new Tela();
    }
}
