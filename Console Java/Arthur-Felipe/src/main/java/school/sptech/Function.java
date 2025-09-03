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
                |  3º - Criador de Select  |   4º - Sorteio           |
                |--------------------------|--------------------------|
                |  5º - Sobre a SafeClass  |   6º - Sobre o Autor     |
                |--------------------------|--------------------------|
                |  7º - Sair do console    |##########################|
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
            ChamarMenuAulas();
        } else if (acao == 3) {

        } else if (acao == 4) {

        } else if (acao == 5) {

        } else if (acao == 6) {

        } else if (acao == 7) {
            limparTela();
            EncerrarConsole();
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
    void EncerrarConsole(){
        System.out.printf("""
                      ____  _          _                 _                            _    _               \s
                     / __ \\| |        (_)               | |                          | |  | |              \s
                    | |  | | |__  _ __ _  __ _  __ _  __| | ___    _ __   ___  _ __  | |  | |___  __ _ _ __\s
                    | |  | | '_ \\| '__| |/ _` |/ _` |/ _` |/ _ \\  | '_ \\ / _ \\| '__| | |  | / __|/ _` | '__|
                    | |__| | |_) | |  | | (_| | (_| | (_| | (_) | | |_) | (_) | |    | |__| \\__ \\ (_| | |  \s
                     \\____/|_.__/|_|  |_|\\__, |\\__,_|\\__,_|\\___/  | .__/ \\___/|_|     \\____/|___/\\__,_|_|  \s
                                          __/ |                   | |                                      \s
                                         |___/                    |_|                                      \s
                """);
    }
    void ChamarMenuAulas(){
        limparTela();
        System.out.printf("""
                _______________________________________________________
                |                         Aulas                       |
                |--------------------------|--------------------------|
                |  1º - Váriaveis          |   2º - If / Else         |
                |--------------------------|--------------------------|
                |  3º - While / For        |   4º - Vetor[]           |
                |--------------------------|--------------------------|
                |  5º - Listas             |   6º - Operações Math    |
                |--------------------------|--------------------------|
                |  7º - Números Aletórios  |   8º - Mais opções       |
                |__________________________|__________________________|
                Digite o número da sua operação: 
                """);
        Integer acao = leitor.nextInt();
        while (acao < 1 || acao > 8){
            System.out.println("Operação Invalída. Tente Novamente:");
            acao = leitor.nextInt();
        }
        if (acao == 1){
            AulaVariavel();
        } else if (acao == 2) {

        } else if (acao == 3) {

        } else if (acao == 4) {

        } else if (acao == 5) {

        } else if (acao == 6) {

        } else if (acao == 7) {

        } else {

        }
    }
    void AulaVariavel(){
        System.out.println("Bem vindo a Aula sobre Varíavel");
        System.out.printf("""
                O que é uma Variavél: É um espaço nomeado na memória de um computador que armazena dados 
                que podem ser alterados durante a execução de um programa.
                Difêrencia das variavéis em Js para Java: No javascript para criar uma variavél é só ulti
                zar o var e pelo o valor inserido a varíavel virava uma tipagem de dado específica(Ex: St
                ring,Boolean,Int,Float) no Java você faz esse processo antes de você declarar uma váriavel
                você precisa passar a tipagem dela(Ex: int Minha_primeira_Variavel = 0)
                Tipos de Varíaveis no Java:
                    int -> Número inteiros de -2147483648 a 2147483647
                    String -> Texto "Hello World"
                    double -> Números Racionais Ex: 0.25 (64 bits)
                    float -> Números Racionais Ex: 0.5 (32 bits)
                    boolean -> True ou False
                    character -> Uma Letra Ex: "A"
                Nós também temos outro tipo de váriavel chamada Wrappers no qual só ultilizadas para criar
                objetos:
                    Integer   ->
                    String    ->
                    Double    ->
                    Float     ->
                    Boolean   ->
                    Character ->
                """);
    }

}
