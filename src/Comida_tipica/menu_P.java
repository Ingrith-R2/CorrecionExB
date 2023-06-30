package Comida_tipica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu_P {
    private static List<Comida_tipica>platos = new ArrayList();

    public static void main(String[] arg)
    {


        Comida_tipica plto1 = new yaguarlocro("yaguarlocro",
                3.50,
                "Sangre,aguacate,cilantro, perejil, tripita");
        platos.add(plto1);
       Comida_tipica plato2 = new guatita("Guatita",
                3.50,
                2000);
        platos.add(plato2);
        Comida_tipica plato3 = new cangrejo("Cangrejo",
                5.00,
                "Grande");
        platos.add(plato3);

        for(Comida_tipica model: platos){
            System.out.println("Plato: "+model.getNom_plato()+"  Precio: "+model.getPrecio());
        }


    }

}
