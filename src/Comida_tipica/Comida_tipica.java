package Comida_tipica;

public class Comida_tipica {
    String nom_plato;
    double precio;

    public Comida_tipica(String nom_plato, double precio) {
        super();
        this.nom_plato = nom_plato;
        this.precio = precio;
    }

    public String getNom_plato() {
        return nom_plato;
    }

    public void setNom_plato(String nom_plato) {
        this.nom_plato = nom_plato;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
