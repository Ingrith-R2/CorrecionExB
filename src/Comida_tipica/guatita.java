package Comida_tipica;
public class guatita extends Comida_tipica{
    int anio_creacion;

    public guatita(String nom_plato, double precio, int anio_creacion) {
        super(nom_plato, precio);
        this.anio_creacion = anio_creacion;
    }

    public int getAño_creacion() {
        return anio_creacion;
    }

    public void setAño_creacion(int año_creacion) {
        this.anio_creacion = año_creacion;
    }
    public void impP(){
        System.out.println("El año de creacion es: "+ anio_creacion);
    }
}
