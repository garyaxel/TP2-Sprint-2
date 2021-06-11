package app;

import java.time.LocalDate;

public abstract class Epass {
    private long codigo;
    private double saldo;
    private double precoViagem;
    private LocalDate dataCarrega;
    private LocalDate dataValida;

    public Epass(double saldo,double precoViagem){
        setSaldo(saldo);
        setPrecoViagem(precoViagem); }

    public Epass(double precoViagem){
        setPrecoViagem(precoViagem); }

    public Epass(double saldo,double precoViagem,LocalDate datacarrega,LocalDate dataValida){
        setSaldo(saldo);
        setPrecoViagem(precoViagem); }

    public Epass(double saldo,LocalDate dataCarrega){
        setSaldo(saldo);

    }

    public Epass() {

    }


    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getDataCarrega() {
        return dataCarrega;
    }

    public void setDataCarrega(LocalDate dataCarrega) {
        this.dataCarrega = dataCarrega;
    }

    public LocalDate getDataValida() {
        return dataValida;
    }

    public void setDataValida(LocalDate dataValida) {
        this.dataValida = dataValida;
    }

    public double getPrecoViagem() {
        return precoViagem;
    }

    public void setPrecoViagem(double precoViagem) {
        this.precoViagem = precoViagem;
    }
    public void pagarSaldo(){
        this.saldo = this.saldo- precoViagem;
    }


    public String toString(){
        String s= "Codigo" + codigo +"\n"+ "Saldo"+ saldo+"\n"+"Preço Viagem"+ precoViagem;
        return s;
    }

    public boolean equals(Epass outro){
        boolean v=true;
        return  v;

    }
}
