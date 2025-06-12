package controller;

import model.Sindico;
import java.util.ArrayList;
import java.util.List;

public class SindicoController {
    private List<Sindico> sindicos;

    public SindicoController() {
        this.sindicos = new ArrayList<>();
    }

    // CRUD operations
    public void criarSindico(String nome, String cpf, String telefone, String registro, String dataEleicao) {
        Sindico sindico = new Sindico(nome, cpf, telefone, registro, dataEleicao);
        sindicos.add(sindico);
    }

    public List<Sindico> listarSindicos() {
        return sindicos;
    }

    public Sindico buscarSindicoPorRegistro(String registro) {
        for (Sindico sindico : sindicos) {
            if (sindico.getRegistro().equals(registro)) {
                return sindico;
            }
        }
        return null;
    }

    public void atualizarSindico(String registro, String novoNome, String novoTelefone, String novaDataEleicao) {
        Sindico sindico = buscarSindicoPorRegistro(registro);
        if (sindico != null) {
            sindico.setNome(novoNome);
            sindico.setTelefone(novoTelefone);
            sindico.setDataEleicao(novaDataEleicao);
        }
    }

    public void deletarSindico(String registro) {
        Sindico sindico = buscarSindicoPorRegistro(registro);
        if (sindico != null) {
            sindicos.remove(sindico);
        }
    }
}