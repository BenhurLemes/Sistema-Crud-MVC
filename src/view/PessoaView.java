package view;

import model.Pessoa;
import java.util.List;
import java.util.Scanner;

public class PessoaView {
    private Scanner scanner;

    public PessoaView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenuPessoa() {
        System.out.println("\nMENU PESSOA");
        System.out.println("1. Cadastrar Pessoa");
        System.out.println("2. Listar Pessoas");
        System.out.println("3. Buscar Pessoa por CPF");
        System.out.println("4. Atualizar Pessoa");
        System.out.println("5. Deletar Pessoa");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");
    }

    public Pessoa obterDadosPessoa() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        return new Pessoa(nome, cpf, telefone);
    }

    public void mostrarPessoas(List<Pessoa> pessoas) {
        System.out.println("\nLISTA DE PESSOAS:");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() +
                    ", CPF: " + pessoa.getCpf() +
                    ", Telefone: " + pessoa.getTelefone());
        }
    }

    public String obterCpf() {
        System.out.print("Digite o CPF: ");
        return scanner.nextLine();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}