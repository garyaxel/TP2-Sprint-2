package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.lang.*;
import java.io.*;

public abstract class EpassStandard extends Epass {
    private Titular titular;
    private int pontos;
    private int numeroViagens;
    private String chaveValida;



     public  EpassStandard(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn,String nome,String email){

        titular= new Titular(codigoDoc,tipoDoc,nome,ddn,email);
        this.chaveValida=gerarChave();
    }


    EpassStandard(DocumentoID docID,LocalDate ddn,String nome,String email){
        titular= new Titular(docID,nome,ddn,email);
        this.chaveValida=gerarChave();

    }

    EpassStandard(DocumentoID docID,LocalDate ddn,String nome,String email,String morada,int telemovel){
        titular= new Titular(docID,nome,ddn,nome,telemovel);
        this.titular.setEmail(email);
        this.chaveValida=gerarChave();
    }

    EpassStandard(EpassStandard pass){
        this.clone(pass);
    }

    public EpassStandard() {

    }

    protected abstract void clone(EpassStandard pass);


    public Titular getTitular() {
        return titular; }


    public int getPontos() {
        return pontos; }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getChaveValida() {
        return chaveValida;
    }

    public void setChaveValida(String chaveValida) {
        this.chaveValida = chaveValida;
    }

    public String gerarChave(){
        String p = titular.getNome().substring(0,4).toUpperCase();
        String s = titular.getNome().substring(titular.getNome().length()-4,titular.getNome().length()).toUpperCase();
        String m= p+s;m.trim();

        String n= new StringBuilder(m).reverse().toString();

        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
        String date = titular.getDdn().format(formatters);

        return n+date+titular.getDocID();

            }
        }





