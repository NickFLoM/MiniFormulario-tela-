package Tela;

import javax.swing.*;
import java.awt.*;

public class TelaText extends JFrame{
    JLabel rotulo1, rotulo2, cor, sexo, cidade, estado, CPF, RG;
    //rotulo1=nome, roeulo2 idade, roeulo3 = cor, roeulo4 = sexo.
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8;
    JButton fechar;
    public TelaText(){
        super("Exemplo com JTextField");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel ("Nome");
        rotulo2 = new JLabel ("Idade");
        cor = new JLabel ("Cor");
        sexo = new JLabel ("Sexo");
        cidade = new JLabel ("Cidade");
        estado = new JLabel ("Estado");
        CPF = new JLabel ("CPF");
        RG = new JLabel ("RG");
        texto1 = new JTextField ("");
        texto2 = new JTextField ("");
        texto3 = new JTextField ("");
        texto4 = new JTextField ("");
        texto5 = new JTextField ("");
        texto6 = new JTextField ("");
        texto7 = new JTextField ("");
        texto8 = new JTextField ("");
        fechar = new JButton ("fechar");
        rotulo1.setBounds(50,20,80,20);
        rotulo2.setBounds(330,20,80,20);
        cor.setBounds(330,140,80,20);
        sexo.setBounds(50,140,80,20);
        cidade.setBounds(50,60,80,20);
        estado.setBounds(330,60,80,20);
        CPF.setBounds(50,100,80,20);
        RG.setBounds(330,100,80,20);
        texto1.setBounds(110,20,200,20);
        texto2.setBounds(110,60,200,20);
        texto3.setBounds(110,100,200,20);
        texto4.setBounds(110,140,200,20);
        texto5.setBounds(370,20,200,20);
        texto6.setBounds(370,60,200,20);
        texto7.setBounds(370,100,200,20);
        texto8.setBounds(370,140,200,20);    
        fechar.setBounds(220,180,200,20);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(cor);
        tela.add(sexo);
        tela.add(cidade);
        tela.add(estado);
        tela.add(RG);
        tela.add(CPF);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        tela.add(texto8);
        tela.add(fechar);
        setSize(700,300);
        setVisible(true);
        setLocationRelativeTo(null);
        }
        public static void main(String[] args){      
            TelaText app = new TelaText();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }  
    }
