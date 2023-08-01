import java.sql.SQLOutput;

public class SaidaDeDados {

    public static void main(String[] args) {
        System.out.println("Hello, world!"); // saída do console
        System.out.print(1); // não quebra a linha
        System.out.print(2);
        System.out.println(); // quebra de linha
        System.out.println("Oi\nEu sou Java!");
        System.err.println("Ops! Houve um erro!"); //serr

        int n1 = 5;
        int n2 = 9;
        int soma = n1 + n2;

        // %d -> mapeia um número
        // %s -> mapeia um texto
        // %f -> mapeia um número flutuante

        System.out.printf("A soma de %d é %d igual a %d\n", n1, n2, soma);

        String nome = "Matheus";
        System.out.printf("Bem vindo, %s!\n", nome);

        double nu1 = 3.4;
        double nu2 = 12.5;
        double div = nu2 / nu1;
        System.out.printf("A divisão de %.2f e %.2f é igual a %.2f.\n", nu1, nu2, div);

    }
}
