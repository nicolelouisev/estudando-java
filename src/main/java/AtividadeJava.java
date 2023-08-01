import java.util.Scanner;

public class AtividadeJava {
    public static void main(String[] args) {
        // Crie um programa que recebe um email e uma senha do usuário. Valide se o email é do domínio @soulcode.com e a senha tem comprimento maior que 8. Exiba uma mensagem caso email e senha não sejam válidos.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu e-mail:");
        String email = entrada.nextLine();

        System.out.println("Digite sua senha:");
        String senha = entrada.nextLine();

        if(email.contains("@soulcode.com")) {
            System.out.println("E-mail válido!");
        } else {
            System.out.println("E-mail inválido!");
        }

        if(senha.length() < 8) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida!");
        }
    }
}
