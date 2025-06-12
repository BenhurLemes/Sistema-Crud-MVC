package controller;

import model.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class PessoaController {
    private List<Pessoa> pessoas;

    public PessoaController() {
        this.pessoas = new ArrayList<>();
    }

    // CRUD operations
    public void criarPessoa(String nome, String cpf, String telefone) {
        Pessoa pessoa = new Pessoa(nome, cpf, telefone);
        pessoas.add(pessoa);
    }

    public List<Pessoa> listarPessoas() {
        return pessoas;
    }

    public Pessoa buscarPessoaPorCpf(String cpf) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    public void atualizarPessoa(String cpf, String novoNome, String novoTelefone) {
        Pessoa pessoa = buscarPessoaPorCpf(cpf);
        if (pessoa != null) {
            pessoa.setNome(novoNome);
            pessoa.setTelefone(novoTelefone);
        }
    }

    public void deletarPessoa(String cpf) {
        Pessoa pessoa = buscarPessoaPorCpf(cpf);
        if (pessoa != null) {
            pessoas.remove(pessoa);
        }
    }
}