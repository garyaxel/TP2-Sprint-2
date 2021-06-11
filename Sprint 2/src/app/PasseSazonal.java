package app;

import java.time.format.DateTimeFormatter;

public class PasseSazonal extends Epass {
    private String chaveValida;


    public String getChaveValida() {
        return chaveValida;
    }

    public void setChaveValida(String chaveValida) {
        this.chaveValida = chaveValida;
    }

    public String gerarChave(){

        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("(YYYY-MM-DD");
        String date = super.getDataCarrega().format(formatters);

        return date+super.getCodigo();

    }
}
