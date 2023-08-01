import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class EstudoListas {
    public static void main(String[] args) {
        // vetor -> inflexível
        // lista -> flexível (pode mudar de tamanho)

        // generic -> <Integer> ou <String> (declaração de tipo)
        List<Integer> lista = new ArrayList<Integer>(); // polimorfismo
        lista.add(9);
        lista.add(4);

        System.out.println(lista.get(2)); // obter o elemento com base no índice
        lista.remove(2); // remove o elemento com base no índice
        System.out.println(lista.get(2));
        lista.add(2, 5); // adiciona o elemento no índice especificado
        System.out.println(lista.get(2));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (Integer item : lista) { // for each com lista
            System.out.println(item);
        }

        System.out.println(); // quebra de linha

        List<String> nomesList = List.of("Sky", "Leonardo", "Ludmila", "Gabriel");
        List<String> nomes = new ArrayList<String>(nomesList);
        Collections.sort(nomes); // ordenar
        // imprimir lista ordenada
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }

        // wrapper -> representação de um tipo primitivo como Objeto
        // Integer int
        // Double double
        // Boolean boolean
        // Long long
        // São classes, declarados com letra maiúscula

    }
}
