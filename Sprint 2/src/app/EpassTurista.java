package app;

import java.time.LocalDate;

public class EpassTurista extends PasseSazonal implements CartaoPagamento,TituloTransporte{
    Duracao duracao;

    EpassTurista(Duracao duracao){
        this.duracao=duracao;}

    EpassTurista(EpassTurista turista){
       this.duracao= turista.duracao;}


   public boolean pagar(double valor){
        boolean pv= true;
        return pv; }

    public void creditar(double valor){
        if(valor==1)
            super.setSaldo(500);
        else if(valor==3)super.setSaldo(700);
        else if(valor==7)super.setSaldo(1500);

    }

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








    public Duracao getDuracao(){
        return duracao;

        }

}
