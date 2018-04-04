package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Leitor {
    public Leitor() {
        leitura("teste000100");
    }

    private void leitura(String origem) {
        Path caminho = Paths.get(origem);
        try (Scanner scanner = new Scanner(Files.newBufferedReader(caminho, Charset.defaultCharset()))) {

            String linhaAtual = "";
            int linhas = scanner.nextInt();

            while (scanner.hasNext()) {
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();
                int x2 = scanner.nextInt();
                int y2 = scanner.nextInt();
                linhaAtual = scanner.next();

                desenha(x1, y1, x2, y2, linhaAtual);
            }
        } catch (IOException e) {
            System.err.format("Erro de E/S: %s%n", e);
        }
    }

    private void desenha(int x1, int y1, int x2, int y2, String linha) {

    }
}