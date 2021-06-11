package app;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class EpassStudent extends EpassStandard implements TituloTransporte {
    private int ano;
    private String escola;
    private ArrayList<Zona> zonas;

    public EpassStudent(int ano,String escola){
        this.ano=ano;
        this.escola=escola;

    }
    public EpassStudent(EpassStudent outro){
        this.ano= outro.getAno();
        this.escola=outro.escola;
        this.zonas=outro.getZonas();

    }




    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void addZona(String nome){};

    public void addZona(Zona zonaViagem){};


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
    }}
