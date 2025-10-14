package service;

import model.Transacao;
import repository.TransacaoRepository;

import java.util.List;

//Classe que fica entre a controller e a repository, controller nunca acessa a repository diretamente a service faz esse trabalho
public class TransacaoService {
    private TransacaoRepository transacaoRepository = new TransacaoRepository();

    //Adiciona a nova transação na repository atraves dos dados vindos da controller
    public void adicionar(Transacao transacao) {
        transacaoRepository.adicionar(transacao);
        System.out.println("Transação adicionada com sucesso!");
    }

    //Retorna os dados (lista de transações) da repository para a controller
    public List<Transacao> listarTodos() {
        return transacaoRepository.listarTodos();
    }

    //Remove uma transação da repository atraves dos dados vindos da controller
    public void remover(Transacao transacao) {
        transacaoRepository.remover(transacao);
        System.out.println("Transação removida com sucesso!");
    }

}
