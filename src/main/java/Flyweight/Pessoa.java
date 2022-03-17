package Flyweight;

public class Pessoa {

    private String nome;
    private Cargo cargo;

    public Pessoa(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String obterPessoa() {
        return "Pessoa{" +
                "nome='" + this.nome + '\'' +
                ", cargo='" + cargo.getNome() + '\'' +
                ", salario='" + cargo.getSalario() + '\'' +
                '}';
    }
}
