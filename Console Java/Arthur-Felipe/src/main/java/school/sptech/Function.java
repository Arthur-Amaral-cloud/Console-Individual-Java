package school.sptech;

import java.util.Scanner;

public class Function {
    void chamarMenu(){
        Scanner leitor = new Scanner(System.in);
        System.out.printf
                ("""
                _______________________________________________________
                |               Seja Bem-vindo ao console             |
                |                   Feito por Arthur                  |
                |--------------------------|--------------------------|
                |  1º - Calculadora        |   2º - Aulas             |
                |--------------------------|--------------------------|
                |  3º - Criador de Select  |   4º - Jogo da Velha     |
                |--------------------------|--------------------------|
                |  5º - Sair do console    |   6º - Sobre o Autor     |
                |--------------------------|--------------------------|
                |  7º - Sobre a SafeClass  |##########################|
                |__________________________|__________________________|
                Digite o número da sua ação: 
                """);
        Integer acao = leitor.nextInt();
        System.out.println(acao);
    }
}
