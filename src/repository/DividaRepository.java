package repository;

import model.Divida;

import java.util.ArrayList;

public class DividaRepository {

    private ArrayList<Divida> listaDividas = new ArrayList<>();

    // Adiciona uma dívida
    public void adicionar(Divida divida) {
        listaDividas.add(divida);
    }

    // Lista todas as dívidas
    public ArrayList<Divida> listarTodos() {
        return listaDividas;
    }

    // Remove uma dívida específica
    public void remover(Divida divida) {
        listaDividas.remove(divida);
    }
}
