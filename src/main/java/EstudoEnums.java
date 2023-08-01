import java.sql.SQLOutput;

enum NivelAcesso {
    COMUM, USUARIO, ADMINISTRADOR
}
class Pessoa {
    public String nome;
    public int idade;
    public NivelAcesso nivelAcesso;

    public Pessoa(String nome, int idade, NivelAcesso nivelAcesso) {
        this.nome = nome;
        this.idade = idade;
        this.nivelAcesso = nivelAcesso;
    }
}

public class EstudoEnums {
    public static void main(String[] args) {
        Pessoa davi = new Pessoa("Davi", 8, NivelAcesso.USUARIO);

        if(davi.nivelAcesso == NivelAcesso.ADMINISTRADOR) {
            System.out.println("Libera tudo!");
        }
        else if(davi.nivelAcesso == NivelAcesso.USUARIO) {
            System.out.println("Libera somente área privada");
        }
        else if(davi.nivelAcesso == NivelAcesso.COMUM) {
            System.out.println("Libera somente área pública!");
        }
    }
}
