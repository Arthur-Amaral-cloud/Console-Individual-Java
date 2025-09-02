package school.sptech;

import java.util.Scanner;

public class Function {
    Scanner leitor = new Scanner(System.in);
    Scanner leitor_texto = new Scanner(System.in);
    void chamarMenu(){
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
        while (acao < 1 || acao > 7){
            System.out.println("Operação Invalída. Tente Novamente:");
            acao = leitor.nextInt();
        }
        if (acao == 1){
            chamarMenuCalculadora();
        } else if (acao == 2) {

        } else if (acao == 3) {

        } else if (acao == 4) {

        } else if (acao == 5) {

        } else if (acao == 6) {

        } else if (acao == 7) {

        }
    }
    void limparTela(){
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
    }
    void chamarMenuCalculadora(){
        limparTela();
        System.out.printf("""
                _______________________________________________________
                |                      Calculadora                    |
                |--------------------------|--------------------------|
                |  1º - Soma               |   2º - Subtração         |
                |--------------------------|--------------------------|
                |  3º - Multiplicação      |   4º - Divisão           |
                |--------------------------|--------------------------|
                |  5º - Exponenciação      |   6º - Radiciação        |
                |--------------------------|--------------------------|
                |  7º - Voltar ao Menu     |##########################|
                |__________________________|__________________________|
                Digite o número da sua operação: 
                """);
        Integer acao = leitor.nextInt();
        while (acao < 1 || acao > 7){
            System.out.println("Operação Invalída. Tente Novamente:");
            acao = leitor.nextInt();
        }
        if (acao == 1){
            Somarnumeros();
        } else if (acao == 2) {
            Subtrairnumeros();
        } else if (acao == 3) {
            Multiplicarnumeros();
        } else if (acao == 4) {
            Dividirnumeros();
        } else if (acao == 5) {
            Elevandonumeros();
        } else if (acao == 6) {
            Raiznumeros();
        } else if (acao == 7) {
            chamarMenu();
        }
    }
    void Somarnumeros(){
        System.out.println("Quantos números você irá somar:");
        Integer numeros_total = leitor.nextInt();
        Double[] numeros = new Double[numeros_total];
        Double soma = 0.0;
        for (int i = 0; i < numeros_total; i++) {
            System.out.println("Digite o " + (i+1) + "º a ser somado:");
            numeros[i] = leitor.nextDouble();
        }
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        String mensagem = "";
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length-1){
                mensagem += numeros[i];
            } else {
                mensagem += numeros[i] + " + ";
            }
        }
        mensagem += " = " + soma;
        System.out.println(mensagem);
        System.out.println("Quer fazer uma outra conta (S/N):");
        String acao = leitor_texto.nextLine().toLowerCase();
        while (!acao.equals("s") && !acao.equals("n")){
            System.out.println("Quer fazer uma outra conta (S/N):");
            acao = leitor_texto.nextLine().toLowerCase();
        }
        if (acao.equals("s")){
            Somarnumeros();
        } else {
            chamarMenuCalculadora();
        }
    }
    void Subtrairnumeros(){
        System.out.println("Digite o minuendo(Número no qual irá subtrair):");
        Double minuendo = leitor.nextDouble();
        System.out.println("Digite o subtraendo(Número que irá subtrair o de cima):");
        Double subtraendo = leitor.nextDouble();
        Double resultado = minuendo - subtraendo;
        System.out.println(minuendo + " - " + subtraendo + " = " + resultado);
        System.out.println("Quer fazer uma outra conta (S/N):");
        String acao = leitor_texto.nextLine().toLowerCase();
        while (!acao.equals("s") && !acao.equals("n")){
            System.out.println("Quer fazer uma outra conta (S/N):");
            acao = leitor_texto.nextLine().toLowerCase();
        }
        if (acao.equals("s")){
            Subtrairnumeros();
        } else {
            chamarMenuCalculadora();
        }
    }
    void Multiplicarnumeros(){
        System.out.println("Digite o multiplicando(Número no qual irá multiplicar):");
        Double multiplicando = leitor.nextDouble();
        System.out.println("Digite o multiplicador:");
        Double multiplicador = leitor.nextDouble();
        Double produto = multiplicando * multiplicador;
        System.out.println(multiplicando + " X " + multiplicador + " = " + produto);
        System.out.println("Quer fazer uma outra conta (S/N):");
        String acao = leitor_texto.nextLine().toLowerCase();
        while (!acao.equals("s") && !acao.equals("n")){
            System.out.println("Quer fazer uma outra conta (S/N):");
            acao = leitor_texto.nextLine().toLowerCase();
        }
        if (acao.equals("s")){
            Multiplicarnumeros();
        } else {
            chamarMenuCalculadora();
        }
    }
    void Dividirnumeros(){
        System.out.println("Digite o divedendo(Número no qual irá dividir):");
        Double divedendo = leitor.nextDouble();
        System.out.println("Digite o divisor:");
        Double divisor = leitor.nextDouble();
        Double Quociente = divedendo / divisor;
        System.out.println(divedendo + " / " + divisor + " = " + Quociente);
        System.out.println("Quer fazer uma outra conta (S/N):");
        String acao = leitor_texto.nextLine().toLowerCase();
        while (!acao.equals("s") && !acao.equals("n")){
            System.out.println("Quer fazer uma outra conta (S/N):");
            acao = leitor_texto.nextLine().toLowerCase();
        }
        if (acao.equals("s")){
            Dividirnumeros();
        } else {
            chamarMenuCalculadora();
        }
    }
    void Elevandonumeros(){
        System.out.println("Digite a base:");
        Double base = leitor.nextDouble();
        System.out.println("Digite o expoente:");
        Double expoente = leitor.nextDouble();
        Double potencia = Math.pow(base,expoente);
        System.out.println(base + " ^ " + expoente + " = " + potencia);
        System.out.println("Quer fazer uma outra conta (S/N):");
        String acao = leitor_texto.nextLine().toLowerCase();
        while (!acao.equals("s") && !acao.equals("n")){
            System.out.println("Quer fazer uma outra conta (S/N):");
            acao = leitor_texto.nextLine().toLowerCase();
        }
        if (acao.equals("s")){
            Elevandonumeros();
        } else {
            chamarMenuCalculadora();
        }
    }
    void Raiznumeros(){
        System.out.println("Digite a radicando:");
        Double radicando = leitor.nextDouble();
        System.out.println("Digite o índice:");
        Double indice = leitor.nextDouble();
        Double raiz = Math.pow(radicando,(1/indice));
        System.out.println(indice + "√" + radicando + " = " + raiz);
        System.out.println("Quer fazer uma outra conta (S/N):");
        String acao = leitor_texto.nextLine().toLowerCase();
        while (!acao.equals("s") && !acao.equals("n")){
            System.out.println("Quer fazer uma outra conta (S/N):");
            acao = leitor_texto.nextLine().toLowerCase();
        }
        if (acao.equals("s")){
            Raiznumeros();
        } else {
            chamarMenuCalculadora();
        }
    }
}
