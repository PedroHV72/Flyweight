package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Pessoa> pessoas = new ArrayList<>();

    public void contratar(String nomePessoa, String nomeCargo, Float salario) {
        Cargo cargo = CargoFactory.getCargo(nomeCargo, salario);
        Pessoa pessoa = new Pessoa(nomePessoa, cargo);
        pessoas.add(pessoa);
    }

    public List<String> obterFuncionarios() {
        List<String> retorno = new ArrayList<String>();
        for (Pessoa pessoa : this.pessoas) {
            retorno.add(pessoa.obterPessoa());
        }
        return retorno;
    }
}
