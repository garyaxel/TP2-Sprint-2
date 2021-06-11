package app;

import java.time.LocalDate;

public class EpassFestival extends PasseSazonal implements TituloTransporte{

    private double saldoCartaoPgmt;
    private String nomeEvento;


    EpassFestival(double saldo,String evento){
        setNomeEvento(evento);
        setSaldoCartaoPgmt(saldo);
        super.gerarChave();

    }

    EpassFestival(String evento){
        setNomeEvento(evento);
        super.gerarChave();
    }

    EpassFestival(EpassFestival outro){
        setSaldoCartaoPgmt(outro.getSaldo());
        setNomeEvento(outro.getNomeEvento());
        super.gerarChave();
    }
    public void creditar(double valor){
        if(valor==1)
            super.setSaldo(500);
        else if(valor==3)super.setSaldo(700);

        else if(valor==7){super.setSaldo(1500);}}

    public void carregar(double n){
        super.setSaldo(n);
    }
    public void pagarViagem(double n){

        if(super.getSaldo()<0)
            System.out.println("Saldo indisponivel");
        else
            super.pagarSaldo();
    }
    public boolean checkValidade(){
        boolean n;
        if(super.getDataValida().compareTo(LocalDate.now())<0){
            return n=true;
        }else return n=false;


    }
    public boolean passarSaldo(double PassStandard){
        boolean b= true;
        return b;
    }

    public double getSaldoCartaoPgmt() {
        return saldoCartaoPgmt;
    }

    public void setSaldoCartaoPgmt(double saldoCartaoPgmt) {
        this.saldoCartaoPgmt = saldoCartaoPgmt;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
}
