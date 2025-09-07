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
            CriadordeSelect();
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
        limparTela();
        if (acao == 1){
            AulaVariavel();
        } else if (acao == 2) {
            AulaifElse();
        } else if (acao == 3) {

        } else if (acao == 4) {

        } else if (acao == 5) {

        } else if (acao == 6) {

        } else if (acao == 7) {

        } else {

        }
    }
    void AulaVariavel(){
        int int_primitivo = 30;
        Integer int_wrapper = 50;
        String string_wrapper = "Hello World";
        double double_primitivo = 5.55;
        Double double_wrapper = 6.61;
        float float_primitvo = 40.502f;
        Float float_wrapper = 41.2f;
        boolean bollean_primitivo = false;
        Boolean bollean_wrapper = true;
        char char_primitivo = 'A';
        Character char_wrapper = 'B';

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
                    char -> Uma Letra Ex: "A"
                Nós também temos outro tipo de váriavel chamada Wrappers no qual só ultilizadas para criar
                objetos:
                    Integer   -> Wrapper do int
                    String    ->
                    Double    -> Wrapper do double
                    Float     -> Wrapper do float
                    Boolean   -> Wrapper do Boolean
                    Character -> Wrapper do char
                Vamos mostrar alguns exemplos:
                int int_primitivo = 30;
                Resultado no Print: %d
                Integer int_wrapper = 50;
                Resultado no Print: %d
                String string_wrapper = "Hello World";
                Resultado no Print: %s
                double double_primitivo = 5.55;
                Resultado no Print: %f
                Double double_wrapper = 6.61;
                Resultado no Print: %f
                float float_primitvo = 40.502f;
                Resultado no Print: %f
                Float float_wrapper = 41.2f;
                Resultado no Print: %f
                boolean bollean_primitivo = false;
                Resultado no Print: %b
                Boolean bollean_wrapper = true;
                Resultado no Print: %b
                char char_primitivo = 'A';
                Resultado no Print: %c
                Character char_wrapper = 'B';
                Resultado no Print: %c
                Lembrando que todas as variavéis Wrappers pode ser nulas
                """,int_primitivo,int_wrapper,string_wrapper,double_primitivo,double_wrapper,float_primitvo,float_wrapper,bollean_primitivo,bollean_wrapper,char_primitivo,char_wrapper);
        System.out.println("Para voltar para o menu das aulas, Digite 1:");
        String volta = leitor_texto.nextLine();
        while (!volta.equals("1")){
            System.out.println("Não entendi o comando");
            System.out.println("Para voltar para o menu das aulas, Digite 1:");
            volta = leitor_texto.nextLine();
        }
        ChamarMenuAulas();
    }
    void AulaifElse(){
        System.out.printf("""
                O if é comando de estrutura de decisão no qual ele,
                no qual ele funciona por meio de uma pergunta no q
                ual ele irá retornar verdadeiro ou falso Ex:
                if(100 > 50){
                Executa essa parte de a afirmação for verdadeira
                } else {
                Executa essa parte se a afirmação for falsa
                }
                Para fazer essa perguntas usamos alguns operadores
                no quais são:
                == -> Igual
                != -> Diferente
                >  -> Maior que
                >= -> Maior ou igual
                <  -> Menor que 
                <= -> Menor ou igual
                Se você deseja encadear vários ifs você pode usar
                else como no exemplo a seguir:
                Sem Else if
                if (acao == 1){
                
                } else {
                        if(acao == 2) {
                            if(acao == 3){
                            
                            }
                            else{
                            
                            }
                        }
                    }
                Com Else if
                if(acao == 1){
                
                } else if(acao == 2) {
                
                } else if(acao == 3) {
                
                } else {
                
                }
                Você ainda pode usar as portas lógicas ou e and
                no seu if utilizando os seguintes caracteres:
                && -> And
                || -> Or
                Como usar isso:
                if(condição 1 && condição 2){
                Executa se as duas condições foram verdadeiras
                }
                if(condição 1 || condição 2){
                Executa se alguma opção for verdadeira ou ambas
                }
                Tome cuidado no java quando você vai comparar v
                ariavéis Wrappers pois você não está comparado
                um valor primitivo mais sim um objeto, para res
                olver isso utilize .equals()
                Integer n1 = 1;
                Integer n2 = 2;
                if(n1 == n2){
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
                Saída do código: False
                if(n1.equals(n2)){
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
                Saída do código: True
                """);
        System.out.println("Para voltar para o menu das aulas, Digite 1:");
        String volta = leitor_texto.nextLine();
        while (!volta.equals("1")){
            System.out.println("Não entendi o comando");
            System.out.println("Para voltar para o menu das aulas, Digite 1:");
            volta = leitor_texto.nextLine();
        }
        ChamarMenuAulas();
    }
    void CriadordeSelect(){
        limparTela();
        System.out.println("Vamos criar um select");
        System.out.println("Digite 1 - Para continuar o Criador de Select\n" +
                "Digite 2 - Para voltar para o menu");
        String volta = leitor_texto.nextLine();
        while (!volta.equals("1") && !volta.equals("2")){
            System.out.println("Não entedi a operação Digite novamente");
            System.out.println("Digite 1 - Para continuar o Criador de Select\n" +
                    "Digite 2 - Para voltar para o menu");
            volta = leitor_texto.nextLine();
        }
        if (volta.equals("2")){
            chamarMenu();
        }
        limparTela();
        Boolean habilita_join = false;
        String select = "SELECT ";
        System.out.println("Bem vindo ao Criador de Select");
        System.out.println("Deseja criar um select com Join ( S / N ):");
        String join = leitor_texto.nextLine().toLowerCase();
        while (!join.equals("s") && !join.equals("n")){
            System.out.println("Desculpa não entedi o comando");
            System.out.println("Deseja criar um select com Join ( S / N ):");
            join = leitor_texto.nextLine().toLowerCase();
        }
        if (join.equals("s")){
            habilita_join = true;
        }
        if (habilita_join){
            System.out.println("Qual é nome da tabela ou apelido da sua coluna(atributo):");
            select += leitor_texto.nextLine();
            select += ".";
        }
        System.out.println("Digite o nome da coluna(atributo) quer irá consultar:");
        select += leitor_texto.nextLine();
        System.out.println("Deseja apelidar essa coluna ( S / N ):");
        String apelido = leitor_texto.nextLine().toLowerCase();
        while (!apelido.equals("s") && !apelido.equals("n")){
            System.out.println("Desculpa não entendi");
            System.out.println("Deseja apelidar essa coluna ( S / N ):");
            apelido = leitor_texto.nextLine().toLowerCase();
        }
        if (apelido.equals("s")){
            System.out.println("Digite o Apelido da coluna(atributo):");
            select += " as ";
            select += leitor_texto.nextLine();
        }
        System.out.println("Deseja adicionar mais uma coluna ( S / N ):");
        String Nova_coluna = leitor_texto.nextLine().toLowerCase();
        while (!Nova_coluna.equals("s") && !Nova_coluna.equals("n")){
            System.out.println("Desculpa não entendi o seu comando");
            System.out.println("Deseja adicionar mais uma coluna ( S / N ):");
            Nova_coluna = leitor_texto.nextLine().toLowerCase();
        }
        while (Nova_coluna.equals("s")){
            select += ", ";
            if (habilita_join){
                System.out.println("Qual é nome da tabela ou apelido da sua coluna(atributo):");
                select += leitor_texto.nextLine();
                select += ".";
            }
            System.out.println("Digite o nome da coluna(atributo) quer irá consultar:");
            select += leitor_texto.nextLine();
            System.out.println("Deseja apelidar essa coluna ( S / N ):");
            apelido = leitor_texto.nextLine().toLowerCase();
            while (!apelido.equals("s") && !apelido.equals("n")){
                System.out.println("Desculpa não entendi");
                System.out.println("Deseja apelidar essa coluna ( S / N ):");
                apelido = leitor_texto.nextLine().toLowerCase();
            }
            if (apelido.equals("s")){
                System.out.println("Digite o Apelido da coluna(atributo):");
                select += " as ";
                select += leitor_texto.nextLine();
            }
            System.out.println("Deseja adicionar mais uma coluna ( S / N ):");
            Nova_coluna = leitor_texto.nextLine().toLowerCase();
            while (!Nova_coluna.equals("s") && !Nova_coluna.equals("n")){
                System.out.println("Desculpa não entendi o seu comando");
                System.out.println("Deseja adicionar mais uma coluna ( S / N ):");
                Nova_coluna = leitor_texto.nextLine().toLowerCase();
            }
        }
        select += " FROM ";
        if (habilita_join){
            System.out.println("Digite o nome da tabela no qual você puxou os dados:");
            select += leitor_texto.nextLine();
            System.out.printf("""
                    Você colocou algum apelido nas colunas desse tabela
                    Seu select para conferir: %s
                    Caso tenha apelidado Digite 1 
                    Caso não tenha Digite \n""", select);
            String apelidar_join = leitor_texto.nextLine();
            while (!apelidar_join.equals("1") && !apelidar_join.equals("2")){
                System.out.println("Desculpa não entendi o Comando");
                System.out.printf("""
                    Você colocou algum apelido nas colunas desse tabela
                    Seu select para conferir: %s
                    Caso tenha apelidado Digite 1 
                    Caso não tenha Digite 2\n""", select);
                apelidar_join = leitor_texto.nextLine();
            }
            if (apelidar_join.equals("1")){
                System.out.printf("""
                        Apelide a tabela como no Select
                        Seu select como base: %s\n""",select);
                select += leitor_texto.nextLine();
            }
            System.out.printf("""
                    Qual join você quer fazer
                    Digite 1 - Join
                    Digite 2 - Left Join
                    Digite 3 - Right Join \n""");
            String escolhe_join = leitor_texto.nextLine();
            while (!escolhe_join.equals("1") && !escolhe_join.equals("2") && !escolhe_join.equals("3")){
                System.out.println("Desculpa não Entendi");
                System.out.printf("""
                    Qual join você quer fazer
                    Digite 1 - Join
                    Digite 2 - Left Join
                    Digite 3 - Right Join \n""");
                escolhe_join = leitor_texto.nextLine();
            }
            if (escolhe_join.equals("1")){
                select += " JOIN ";
            } else if(escolhe_join.equals("2")){
                select += " LEFT JOIN ";
            } else if(escolhe_join.equals("3")){
                select += " RIGHT JOIN ";
            }
            System.out.println("Digite o nome da tabela no qual você vai fazer o join:");
            select += leitor_texto.nextLine();
            System.out.printf("""
                    Você colocou algum apelido nas colunas desse tabela
                    Seu select para conferir: %s
                    Caso tenha apelidado Digite 1 
                    Caso não tenha Digite 2 \n""", select);
            apelidar_join = leitor_texto.nextLine();
            while (!apelidar_join.equals("1") && !apelidar_join.equals("2")){
                System.out.println("Desculpa não entendi o Comando");
                System.out.printf("""
                    Você colocou algum apelido nas colunas desse tabela
                    Seu select para conferir: %s
                    Caso tenha apelidado Digite 1 
                    Caso não tenha Digite 2 \n""", select);
                apelidar_join = leitor_texto.nextLine();
            }
            if (apelidar_join.equals("1")){
                System.out.printf("""
                        Apelide a tabela como no Select
                        Seu select como base: %s \n""",select);
                select += leitor_texto.nextLine();
            }
            select += " on ";
            System.out.println("Digite o nome da tabela ou apelido no qual fica a fk do join:");
            select += leitor_texto.nextLine();
            select += ".";
            System.out.println("Digite o nome da Fk");
            select += leitor_texto.nextLine();
            select += " = ";
            System.out.println("Digite o nome da tabela ou apelido no qual fica o id do join:");
            select += leitor_texto.nextLine();
            select += ".";
            System.out.println("Digite o nome da id");
            select += leitor_texto.nextLine();
            System.out.println("Deseja fazer mais um Join ( S / N ):");
            String repetir_join = leitor_texto.nextLine().toLowerCase();
            while (!repetir_join.equals("s") && !repetir_join.equals("n")){
                System.out.println("Desculpa não entendi");
                System.out.println("Deseja fazer mais um Join ( S / N ):");
                repetir_join = leitor_texto.nextLine().toLowerCase();
            }
            while (repetir_join.equals("s")){
                System.out.printf("""
                    Qual join você quer fazer
                    Digite 1 - Join
                    Digite 2 - Left Join
                    Digite 3 - Right Join \n
                    """);
                escolhe_join = leitor_texto.nextLine();
                while (!escolhe_join.equals("1") && !escolhe_join.equals("2") && !escolhe_join.equals("3")){
                    System.out.println("Desculpa não Entendi");
                    System.out.printf("""
                    Qual join você quer fazer
                    Digite 1 - Join
                    Digite 2 - Left Join
                    Digite 3 - Right Join \n
                    """);
                    escolhe_join = leitor_texto.nextLine();
                }
                if (escolhe_join.equals("1")){
                    select += " JOIN ";
                } else if(escolhe_join.equals("2")){
                    select += " LEFT JOIN ";
                } else if(escolhe_join.equals("3")){
                    select += " RIGHT JOIN ";
                }
                System.out.println("Digite o nome da tabela no qual você vai fazer o join:");
                select += leitor_texto.nextLine();
                System.out.printf("""
                    Você colocou algum apelido nas colunas desse tabela
                    Seu select para conferir: %s
                    Caso tenha apelidado Digite 1 
                    Caso não tenha Digite 2 \n
                    """, select);
                apelidar_join = leitor_texto.nextLine();
                while (!apelidar_join.equals("1") && !apelidar_join.equals("2")){
                    System.out.println("Desculpa não entendi o Comando");
                    System.out.printf("""
                    Você colocou algum apelido nas colunas desse tabela
                    Seu select para conferir: %s
                    Caso tenha apelidado Digite 1 
                    Caso não tenha Digite 2 \n
                    """, select);
                    apelidar_join = leitor_texto.nextLine();
                }
                if (apelidar_join.equals("1")){
                    System.out.printf("""
                        Apelide a tabela como no Select
                        Seu select como base: %s \n
                        """,select);
                    select += leitor_texto.nextLine();
                }
                select += " on ";
                System.out.println("Digite o nome da tabela ou apelido no qual fica a fk do join:");
                select += leitor_texto.nextLine();
                select += ".";
                System.out.println("Digite o nome da Fk");
                select += leitor_texto.nextLine();
                select += " = ";
                System.out.println("Digite o nome da tabela ou apelido no qual fica o id do join:");
                select += leitor_texto.nextLine();
                select += ".";
                System.out.println("Digite o nome da id");
                select += leitor_texto.nextLine();
                System.out.println("Deseja fazer mais um Join ( S / N ):");
                repetir_join = leitor_texto.nextLine().toLowerCase();
                while (!repetir_join.equals("s") && !repetir_join.equals("n")){
                    System.out.println("Desculpa não entendi");
                    System.out.println("Deseja fazer mais um Join ( S / N ):");
                    repetir_join = leitor_texto.nextLine().toLowerCase();
                }
            }
        } else {
            System.out.println("Digite o nome da tabela que você puxou os dados:");
            select += leitor_texto.nextLine();
        }
        System.out.println("Quer fazer seu where ( S / N ):");
        String where_habilita = leitor_texto.nextLine().toLowerCase();
        while (!where_habilita.equals("s") && !where_habilita.equals("n")){
            System.out.println("Não entendi o seu comando");
            System.out.println("Quer fazer seu where ( S / N ):");
        }
        if (where_habilita.equals("s")){
            System.out.println("Faça seu Where ou Order by não precisa colocar o ;:");
            select += leitor_texto.nextLine();
        }
        select += ";";
        System.out.println("Seu select:");
        System.out.println(select);
    }
    void CriarSorteio(){
        System.out.println("Bem-vindo ao Sorteio\n" +
                "Para cadastrar um valor - Digite 1\n" +
                "Para começar o sorteio  - Digite 2\n" +
                "Para voltar ao menu     - Digite 3");
        String back_to_menu = leitor_texto.nextLine();
        while (!back_to_menu.equals("1") && !back_to_menu.equals("2") && !back_to_menu.equals("3")){
            limparTela();
            System.out.println("Não entendi o comando");
            System.out.println("Bem-vindo ao Sorteio\n" +
                    "Para cadastrar um valor - Digite 1\n" +
                    "Para começar o sorteio  - Digite 2\n" +
                    "Para voltar ao menu     - Digite 3");
            back_to_menu = leitor_texto.nextLine();
        }
        if (back_to_menu.equals("3")){
            chamarMenu();
        }
        
    }
}
