package Logica;
import Persistencia.Clases.ItemDeSTOCK;
import Persistencia.Clases.Stock;
import java.util.List;

public class ManejadorDeStock {
    //traigo la instancia de Stock con el singleton
    private Stock stock = Stock.getInstance();
    private List<ItemDeSTOCK> items = stock.getItemsDeSTOCK();

    //Constructor
    public ManejadorDeStock() {}

    //Funciones
    public int obtenerCantUnidades(String nombreItem) throws Exception {
        for (ItemDeSTOCK i : items) {
            if (i.getNombre() != null && i.getNombre().equalsIgnoreCase(nombreItem)) {
                Integer cant = i.getCantUnidades();
                if (cant == null) {
                    return 0;
                } else {
                    return cant;
                }       //la otra forma de escribir esta expreción es "return (cant != null) ? cant : 0;"
            }
        }
        throw new Exception("El ítem buscado nunca se ha comprado antes; debe ingresarlo al stock primero.");
    }

}