package app;

import java.time.LocalDate;

public class EpassTeridade extends EpassStandard implements TituloTransporte{
    private LocalDate horaIni;


    public LocalDate getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(LocalDate horaIni) {
        this.horaIni = horaIni;
    }

    @Override
    protected void clone(EpassStandard pass) {

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
}
