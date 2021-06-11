package app;

public interface TituloTransporte {
    public void carregar(double n);
    public void pagarViagem(double n);
    public boolean checkValidade();
    public boolean passarSaldo(double PassStandard);
}
