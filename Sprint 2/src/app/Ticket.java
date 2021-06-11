package app;

import java.time.LocalDate;

public class Ticket {
    String nome;
    private String numero;
    private LocalDate data;

    public Ticket(String nome, String numero,LocalDate data ){
        setData(data);
        setNumero(numero);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
