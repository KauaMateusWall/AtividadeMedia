package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);

        System.out.println("Digite sua primeira nota");
        int nota1 = pergunta .nextInt();

        System.out.println("Digite sua segunda nota");
        int nota2 = pergunta .nextInt();

        System.out.println("Digite sua Terceira nota");
        int nota3 = pergunta .nextInt();

        System.out.println("Digite sua qaurta nota");
        int nota4 = pergunta .nextInt();

        float media = (float) (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua media é:" + media);

        if (media >= 7 )
        {
            System.out.println("Parabéns você é inteligente");
        }
        else {
            System.out.println("Reporvou, Volta para o 5ºano ");
                                                                                       

        }

        }

    }

