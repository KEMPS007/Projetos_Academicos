package entities;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta (){

    }

    public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposit(Double valor){
        saldo += valor;
    }

    public void saque(Double valor) throws Erros {
        if(saldo < valor ){
            throw new Erros("Saldo insuficiente!");
        }
        if(valor > limiteSaque){
            throw new Erros("O valor excedeu o limite de saque!");
        }
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "Novo saldo: " + saldo;
    }
}
