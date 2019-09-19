package controller;

import java.io.*;
import java.nio.file.SimpleFileVisitor;
import java.util.Scanner;

public class ManipuladorArquivo {

    public static void gerarArquivo(String sFileName, String sBody) {
        try {
            File root = new File(sFileName);
            if (!root.exists()) {
                root.mkdirs();
            }

            StringBuilder stringBuilder = new StringBuilder();

            if(root.exists()) {
                stringBuilder.append(lerArquivo(sFileName));
                stringBuilder.append(sBody);
            }

            File gpxfile = new File(root, sFileName);
            FileWriter writer = new FileWriter(gpxfile);
            writer.append(stringBuilder.toString());
            writer.flush();
            writer.close();

            //aqui você exibe na tela uma mensagem que o arquivo foi salvo

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String lerArquivo(String arquivo) {

        //File file = new File(rFilename);
        StringBuilder text = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(arquivo +"/" + arquivo));

            String line;

            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
            br.close();
        } catch (IOException e) {
            // exibir erro caso não funcione
        }

        return text.toString();
    }

//    public static String leitor(String path) throws IOException {
//        BufferedReader buffRead = new BufferedReader(new FileReader(path));
//        String linha = "";
//        while (true) {
//            if (linha != null) {
//                System.out.println(linha);
//
//            } else
//                break;
//            linha = buffRead.readLine();
//        }
//
//        buffRead.close();
//        return linha;
//
//    }

//    public static void escritor(String path, String palavra) throws IOException {
//        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
//        StringBuilder stringBuilder = new StringBuilder();
//        File file = new File(path);
//
//        if (!file.exists()){
//            file.mkdirs();
//        }
//
//        if(file.exists()){
//
//            stringBuilder.append(leitor(path));
//            stringBuilder.append(palavra);
//            buffWrite.append(stringBuilder);
//            buffWrite.close();
//        }
//
//
//
//    }

}
