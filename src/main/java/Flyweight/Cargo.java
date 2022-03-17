package Flyweight;

public class Cargo {
    private String nome;
    private Float salario;

    public Cargo(String nome, Float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Float getSalario() {
        return salario;
    }
}
