import java.util.Scanner;

public class FirstCode {

    private final static String welcomeMensage = "Olá, informe o seu nome:"; // variavel de escopo global da classe, é uma constante
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Variavel scanner do tipo Scanner declarada
        //var scanner = new Scanner(System.in); // Variavel scanner do tipo Scanner declarada com var
        // "var" é uma palavra-chave do Java que permite declarar variáveis sem especificar
        System.out.println(welcomeMensage); // Mensagem para o usuário
        String name = scanner.next(); // String para armazenar o nome e não é uma classe primitiva
        // var name = scanner.next(); // String para armazenar o nome com var
        System.out.println("informe sua idade:"); // Mensagem para o usuário
        int age = scanner.nextInt(); // int para armazenar a idade, que é uma classe primitiva
        // var age = scanner.nextInt(); // int para armazenar a idade com var
        System.out.println("Olá " + name + " sua idade é " + age); // Exibe o nome e a idade informados pelo usuário
        System.out.printf("Olá %s sua idade é %s \n", name, age); // printf é utilizado para formatar a saída
    }
}


// Primeiro código em Java
// "new" é utilizado para instanciar objetos
// Scanner() precisa de um argumento, que é o System.in
// System.in é o teclado
// \n é utilizado para pular linha
// var é uma palavra-chave do Java que permite declarar variáveis sem especificar o tipo explicitamente
// private é um modificador de acesso que indica que a variável só pode ser acessada dentro da própria classe
// final é um modificador que indica que a variável não pode ser alterada após sua inicialização
// static é um modificador que indica que o método pertence à classe e não a uma instância específica