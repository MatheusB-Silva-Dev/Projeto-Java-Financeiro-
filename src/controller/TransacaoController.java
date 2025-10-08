package controller;

import model.Transacao;
import repository.TransacaoRepository;

import java.time.LocalDate;
import java.util.Scanner;

public class TransacaoController {
    Scanner teclado = new Scanner(System.in);

    //Instancia do repositório que vai armazenar e gerenciar as transaçoes
    TransacaoRepository transacaoRepository = new TransacaoRepository();

    //Metodo principal que exibe o menu e controla o fluxo da aplicação
    public void menuPrincipal() {
        int opcao = 0; //Inicializa a opção do menu

        //Loop principal que so termina quando o usuário digitar 4
        while(opcao != 4) {
            System.out.println("------Menu Principal------");
            System.out.println("1 - Adicionar | 2 - Listar Todos | 3 - Remover | 4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = teclado.nextInt();//le a opção digitada
            teclado.nextLine();//limpa o buffer do teclado

            //Switch para tratar cada opçao
            switch (opcao) {
                case 1:
                    adicionarTransacao();//chama o metodo de adicionar
                    break;
                case 2:
                    listarTodas();//chama o metodo de listar
                    break;
                case 3:
                    remover();//chama o metodo de remover
                    break;
                case 4:
                    System.out.println("Saindo.....");//mensagem de saída
                    break;
                default:
                    System.out.println("Opção não aceita!"); //caso a opção seja invalida

            }
        }
    }

    // Metodo para adicionar uma nova transação
    private void adicionarTransacao() {
        System.out.println("Digite a descrição da transação: ");
        String descricao = teclado.nextLine();

        System.out.println("Digite o valor da transação: ");
        double valor = teclado.nextDouble();
        teclado.nextLine();//limpa buffer

        System.out.print("Dia de vencimento (YYYY-MM-DD): ");
        LocalDate data = LocalDate.parse(teclado.nextLine()); //le a data e converte para LocalDate

        // Cria o objeto Transacao com os dados fornecidos
        Transacao transacao = new Transacao(descricao, valor, data);
        // Adiciona a transação no repositório, lista
        transacaoRepository.adicionar(transacao);

        System.out.println("Transação adicionada!");

    }

    // Metodo para listar todas as transações
    private void listarTodas() {
        //verifica se a lista está vazia
        if(transacaoRepository.listarTodos().isEmpty()) {
            System.out.println("A lista está vazia!");
            return; //sai do metodo se não houver transações
        }
        //percorre a lista e imprime cada objeto transação
        for(Transacao a : transacaoRepository.listarTodos()) {
            System.out.println(a);
        }
    }

    // Metodo para remover uma transação com base na descrição
    private void remover() {
        System.out.println("Digite a descrição da transação que quer remover: ");
        String descricao = teclado.nextLine();
        Transacao removendo = null; //variavel temporaria para armazenar o objeto a ser removido

        //percorre a lista de transaçoes procurando a que tem a descrição desejada
        for(Transacao a: transacaoRepository.listarTodos()) {
            if(a.getDescricao().equalsIgnoreCase(descricao)) { //compara ignorando maiusculas e minusculas
                System.out.println("Transação encontrada!");
                removendo = a;//armazena o objeto que sera removido
                break;//sai do loop assim que encontrar
            }
        }

        //se encontrou a transação, remove, se não, exibe mensagem
        if (removendo != null) {
            transacaoRepository.remover(removendo); //chama metodo do repository
            System.out.println("Transação removida!");
        } else {
            System.out.println("Transação não encontrada!");
        }

    }
}
