package repository;

import model.Transacao;

import java.util.ArrayList;

public class TransacaoRepository {
    private ArrayList<Transacao> listaTransacao = new ArrayList<>();

    public void adicionar(Transacao transacao) {
        listaTransacao.add(transacao);
    }

    public ArrayList<Transacao> listarTodos() {
        return listaTransacao;
    }

    public void remover(Transacao transacao) {
        listaTransacao.remove(transacao);
    }
}
