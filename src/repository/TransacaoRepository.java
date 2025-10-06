package repository;

import model.Transacao;

import java.util.ArrayList;

public class TransacaoRepository {
    // Cria uma lista de transações
    private ArrayList<Transacao> listaTransacao = new ArrayList<>();

    // Adiciona uma transação
    public void adicionar(Transacao transacao) {
        listaTransacao.add(transacao);
    }

    // Lista todas as transações
    public ArrayList<Transacao> listarTodos() {
        return listaTransacao;
    }

    // Remove uma transação
    public void remover(Transacao transacao) {
        listaTransacao.remove(transacao);
    }
}
