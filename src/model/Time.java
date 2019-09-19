package model;

import controller.GerenciaTime2;
import controller.ManipuladorArquivo;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static controller.Controlador.checaAdicionarMais;

public class Time {
    static String nome;
    static List<Pessoa> listPessoas = new ArrayList<>();
//    static String[] times = new String[5];
    static final List<String> listaTimes = new ArrayList<>(5);
    static GerenciaTime2 gerenciaTime2 = new GerenciaTime2();

    public Time(String nome) {
        this.nome = nome;
        adicionarLista(nome);
    }


//    public static void adicionarTimes(){
//        String nomeTime = JOptionPane.showInputDialog(
//                null,
//                "Adicione o nome do time.");
//
//        Time time = new Time(nomeTime);
//    }

    public static void adicionarTimes(){
        String nomeTime = JOptionPane.showInputDialog(
                null,
                "Adicione o nome do time.");

        if(checarTresDigitos(nomeTime)){
            Time2 time2 = new Time2(nomeTime);
            gerenciaTime2.getTime2List().add(time2);
            ManipuladorArquivo.gerarArquivo("arquivos", nomeTime);
        }else{
            JOptionPane.showMessageDialog(null, "Informe um nome com mais de 3 caracterer");
        }


    }

    private static boolean checarTresDigitos(String nome){
        return nome.length()>3;
    }

    public static void adicionarPessoas(){
        String nomePessoa= JOptionPane.showInputDialog(
                null,
                "Informe o nome da pessoa:");

        if(checarTresDigitos(nomePessoa)){
            String palavra = "";
            int contador = 1;
            for (Time2 s: gerenciaTime2.getTime2List()) {
                palavra = palavra + contador + ". Para " + s.getNome() + "\n";
                contador++;
            }

            int escolhaTime = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    palavra));

            Time2 nomeTime = gerenciaTime2.getTime2List().get(escolhaTime - 1);
            Pessoa pessoa = new Pessoa(nomePessoa);
            timePessoa timePessoa = new timePessoa(pessoa, nomeTime);

            ManipuladorArquivo.gerarArquivo("pessoa", pessoa.getNomePessoa());
            ManipuladorArquivo.gerarArquivo(
                    "timePessoa",
                    nomeTime.getNome() + " - " + pessoa.getNomePessoa());
        }else{
            JOptionPane.showMessageDialog(null, "Informe um nome com mais de 3 caracterer");
        }


    }

    public void adicionarLista(String nome) {

        listaTimes.add(nome);
        System.out.println(listaTimes);


        String palavra = "";
        for (String p:listaTimes) {
            palavra = p + "\n";
        }

        ManipuladorArquivo.gerarArquivo("arquivos", palavra);

        checaAdicionarMais();
    }

    public static void mostrarLista () {
        for (int i = 0; i < listaTimes.size(); i++) {
            System.out.println(listaTimes.get(i));
        }
    }

}

