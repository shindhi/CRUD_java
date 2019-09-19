package controller;

import model.Time;

import javax.swing.*;

import static model.Time.adicionarTimes;
import static model.Time.mostrarLista;

public class Controlador {


    public void checaEscolha(int escolha) {
        int escolhaC;
        escolhaC = escolha;
        int item = 0;

        if (escolha == 1) {
            item = mostrarOpcoes();
            if (item == 1) {
                adicionarTimes();
            }else{
                JOptionPane.showMessageDialog(null,ManipuladorArquivo.lerArquivo("arquivos"));
            }
        }else{
            item = mostrarOpcoes();
            if (item == 1) {
                Time.adicionarPessoas();
            }else{
                JOptionPane.showMessageDialog(null,ManipuladorArquivo.lerArquivo("pessoa"));
            }
        }

    }

    public static int mostrarOpcoes() {
        return Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "1 - Adicionar" + "\n2 - Listar"));
    }

    public static void checaAdicionarMais(){
        int cont = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Deseja adicionar novo? (1-continuar / 2-cancelar)"));
        if (cont == 1){
            adicionarTimes();
        }

    }



}

