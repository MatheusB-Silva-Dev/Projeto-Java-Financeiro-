package model;

import java.time.LocalDate;

//Classe objeto onde todas as outras classes vão usar mas ela não entra no fluxo diretamente
public class Transacao {
    //Atributos do objeto Transação
    private String descricao;
    private double valor;
    private LocalDate data;

    //Construtor de inicialização do objeto Transacao
    public Transacao(String descricao, double valor, LocalDate data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    //Geters / Seters para encapsulamento
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //Para testar pelo console
    @Override
    public String toString() {
        return ("Descrição: " + descricao + "| Ganho: " + valor + "| Data: " + data);
    }
}
