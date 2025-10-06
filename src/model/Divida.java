package model;

import java.time.LocalDate;

public class Divida {
    private String descricao;
    private double valor;
    private LocalDate dataVencimento;
    private boolean pago;

    public Divida(String descricao, double valor, LocalDate dataVencimento, boolean pago) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.pago = pago;
    }

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

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean getPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public boolean isPago() {
        return pago;
    }

    @Override
    public String toString() {
        return ("Descrição: " + descricao + "| Valor: " + valor + "| Vencimento: " + dataVencimento + "| Pago: " + pago);
    }
}
