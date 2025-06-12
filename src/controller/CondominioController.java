package controller;

import model.Condominio;
import model.Sindico;
import java.util.ArrayList;
import java.util.List;

public class CondominioController {
    private List<Condominio> condominios;

    public CondominioController() {
        this.condominios = new ArrayList<>();
    }

    // CRUD operations
    public void criarCondominio(String nome, String endereco) {
        Condominio condominio = new Condominio(nome, endereco);
        condominios.add(condominio);
    }

    public List<Condominio> listarCondominios() {
        return condominios;
    }

    public Condominio buscarCondominioPorNome(String nome) {
        for (Condominio condominio : condominios) {
            if (condominio.getNome().equals(nome)) {
                return condominio;
            }
        }
        return null;
    }

    public void atualizarCondominio(String nome, String novoNome, String novoEndereco) {
        Condominio condominio = buscarCondominioPorNome(nome);
        if (condominio != null) {
            condominio.setNome(novoNome);
            condominio.setEndereco(novoEndereco);
        }
    }

    public void deletarCondominio(String nome) {
        Condominio condominio = buscarCondominioPorNome(nome);
        if (condominio != null) {
            condominios.remove(condominio);
        }
    }

    // Associação entre Síndico e Condomínio
    public void associarSindicoCondominio(Condominio condominio, Sindico sindico, String dataInicio, String dataFim) {
        condominio.adicionarSindico(sindico, dataInicio, dataFim);
    }
}