package view;

import com.sun.security.jgss.GSSUtil;
import controller.Controlador;
import controller.GerenciaTime2;
import controller.ManipuladorArquivo;

import static model.Time.mostrarLista;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        int numEscolha;
        Controlador controlador = new Controlador();

        GerenciaTime2 gerencia = new GerenciaTime2();
        String palavra = ManipuladorArquivo.lerArquivo("arquivos");


//        String[] newPalavra = palavra.split("\\\\n");
//
//        for (String s: newPalavra) {
//            gerencia.getTime2List().add(s);
//        }


        numEscolha = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Times"+"\n2 - Pessoas"+"\n3 - Sair"));

        while(numEscolha != 3) {
            controlador.checaEscolha(numEscolha);

            numEscolha = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1 - Times"+"\n2 - Pessoas"+"\n3 - Sair"));
        }


        mostrarLista();

    }
}