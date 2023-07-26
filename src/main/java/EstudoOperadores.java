public class EstudoOperadores {
    public static void main(String[] args) {
        // Operadores matemáticos
        int a = 10;
        int b = 15;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        double divisao = b / a; // divisão entre dois inteiros => inteiro

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        // Fazendo a divisão do jeito adequado
        int c = 10;
        double d = 15.0;
        double divisao2 = d / c;
        // divisão entre double e int => double
        System.out.println("Divisão: " + divisao2);

        // Math
        double x = Math.pow(2, 3);
        double y = Math.sqrt(144);


        // Incremento/Decremento
        int valor = 5;
        valor++; // valor - valor + 1
        valor--; // valor - valor - 1
        valor += 10; // valor = valor + 10

        // Operadores relacionais (>, <, >=, <=, ==, !=)
        boolean teste1 = 10 > 5; // true
        boolean teste2 = 5 < 1; // false
        boolean teste3 = 5 == 5; // true
        boolean teste4 = 4 != 5; // true
        boolean teste5 = 5 >= 5; // true
        boolean teste6 = 5 <= 5; // true

        // Operadores lógicos
        boolean teste7 = true && false; // false
        boolean teste8 = true || false; // true
        boolean teste9 = (5 > 10) && (8 > 4); // false
        boolean teste10 = (10 >= 0) || (1 < 5); // true
        boolean teste11 = !teste1; // false

        // Exercicio 1
        // Crie duas variáveis: peso e altura.
        // Calcule o IMC = peso / (altura * altura)
        // Mostre na tela o IMC.

        double peso = 80.5;
        double altura = 1.85;
        double calculoIMC = peso / (altura * altura); // aqui poderia ser Math.pow( altura, 2)
        System.out.println("O IMC é: " + calculoIMC);
    }
}
