package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Leitor {

    private void leitura(String origem) {
        Path caminho = Paths.get(origem);
        try (Scanner scannerLinha = new Scanner(Files.newBufferedReader(caminho, Charset.defaultCharset()))) {
            Scanner scannerPalavra = new Scanner(Files.newBufferedReader(caminho, Charset.defaultCharset()));
            scannerLinha.useDelimiter("[\n]");
            scannerPalavra.useDelimiter(" ");

            String linhaAtual = "";
            String palavraAtual;

            while (scannerLinha.hasNextLine()) {
                
            }
        } catch (IOException e) {
            System.err.format("Erro de E/S: %s%n", e);
        }
    }
}