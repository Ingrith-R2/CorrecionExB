package Comida_tipica;
public class cangrejo extends Comida_tipica{
    String tamanio;

    public cangrejo(String nom_plato, double precio, String tamanio) {
        super(nom_plato, precio);
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    public void impP(){
        System.out.println("El tamaño del plato es:  "+ tamanio);
    }
}
