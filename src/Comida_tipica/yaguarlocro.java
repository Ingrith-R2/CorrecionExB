package Comida_tipica;
public class yaguarlocro extends Comida_tipica{
    String ingredientes;

    public yaguarlocro(String nom_plato, double precio, String ingredientes) {
        super(nom_plato, precio);
        this.ingredientes = ingredientes;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void impP(){
        System.out.println("Los ingredientes del plato son: "+ ingredientes);
    }
}
