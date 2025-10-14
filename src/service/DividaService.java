package service;

import model.Divida;
import repository.DividaRepository;

import java.util.List;

//Classe que fica entre a controller e a repository, controller nunca acessa a repository diretamente a service faz esse trabalho
//Service executa as regras e chama a repository
public class DividaService {
    private DividaRepository dividaRepository = new DividaRepository();

    //Adiciona a nova divida na repository atraves dos dados vindos da controller
    public void adicionar(Divida divida) {
        dividaRepository.adicionar(divida); // Adiciona a dívida no repositório
    }

    //Retorna os dados (lista de dividas) da repository para a controller
    public List<Divida> listaDividas() {
        return dividaRepository.listarTodos();
    }

    //Remove uma divida da repository atraves dos dados vindos da controller
    public void remover(Divida divida) {
        dividaRepository.remover(divida);
        System.out.println("Dívida removida com sucesso!");
    }
}
