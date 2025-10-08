package controller;

import model.Divida; // Importa a classe modelo Divida
import repository.DividaRepository;  // Importa o repositório para manipular as dívidas

import java.util.Scanner;
import java.time.LocalDate; // Para trabalhar com datas

public class DividaController {
    private Scanner teclado = new Scanner(System.in);

    private DividaRepository dividaRepository = new DividaRepository();// Instancia o repositório

    // Metodo principal que exibe o menu e gerencia o fluxo de escolhas
    public void menuPrincipal() {
        int opcao = 0;// Inicializa a opção do menu
        // Enquanto o usuário não escolher sair opção 4 o menu continua
        while(opcao != 4) {
            System.out.println("\n==============================");
            System.out.println("1 - Adicionar | 2 - Listar Dívidas | 3 - Remover | 4 - Sair");
            System.out.println("==============================");
            System.out.println("Escolha uma opção: ");
            opcao = teclado.nextInt(); // Lê a opção do usuário
            teclado.nextLine(); // Limpa buffer do Scanner
            // Escolha da ação com base na opção do usuário
            switch (opcao) {
                case 1:
                    adicionarDivida(); // Chama o metodo para adicionar dívida
                    break;
                case 2:
                    listaDividas(); // Chama o metodo para listar dívidas
                    break;
                case 3:
                    removerDivida(); // Chama o metodo para remover dívida
                    break;
                case 4:
                    System.out.println("Saindo...."); // Mensagem de saída
                    break;
                default:
                    System.out.println("Opção inválida!"); // Caso o usuário digite número fora do menu
            }

        }
    }

    // Metodo para adicionar uma nova dívida
    private void adicionarDivida() {
        System.out.println("Descrição: ");
        String descricao = teclado.nextLine();

        System.out.println("Valor: ");
        double valor = teclado.nextDouble();

        System.out.print("Dia de vencimento (YYYY-MM-DD): ");
        teclado.nextLine();
        LocalDate diaVencimento = LocalDate.parse(teclado.nextLine()); // Lê a data e converte para LocalDate

        // Cria um novo objeto Divida usando os dados fornecidos
        Divida divida = new Divida(descricao, valor, diaVencimento, false);
        dividaRepository.adicionar(divida); // Adiciona a dívida no repositório
        System.out.println("Dívida adicionada com sucesso!");
    }

    // Metodo para listar todas as dívidas
    private void listaDividas() {
        // Verifica se não há dívidas cadastradas
        System.out.println("\n=== Lista de Dívidas ===");
        if (dividaRepository.listarTodos().isEmpty()) {
            System.out.println("Nenhuma dívida cadastrada.");
            return;
        }
        // Percorre todas as dívidas e exibe cada uma
        for(Divida d : dividaRepository.listarTodos()) {
            System.out.println(d);
        }
    }

    // Metodo para remover uma dívida pelo nome/descrição
    private void removerDivida() {
        // Le a descrição que o usuário quer remover
        System.out.println("Digite a descrição da divida remover: ");
        String descricao = teclado.nextLine();

        Divida paraRemover = null; // Inicializa variável para armazenar dívida a remover
        // Procura na lista de dívidas do repositório
        for (Divida d : dividaRepository.listarTodos()) {
            if (d.getDescricao().equalsIgnoreCase(descricao)){
                paraRemover = d; // Define a divida para remover
                break; // Sai do loop ao encontrar
            }
        }

        // Se encontrou a divida, remove
        if (paraRemover != null) {
            dividaRepository.remover(paraRemover);
            System.out.println("Dívida removida!");
        } else {
            System.out.println("Divida não encontrada!"); // Caso não encontre nenhuma correspondência
        }
    }

}
