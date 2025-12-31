//Stock solo guarda Items, no hace nada más, las operaciones como obtener la cantidad de items se hacen en el Manejador de Stock
package Persistencia.Clases;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;


@Entity
@Table(name = "Stock")
public class Stock {
    @Id
    private Long id;
    private List<ItemDeSTOCK> ItemsDeSTOCK;           //Guardo items comunes en el stock, No me interesa de quien lo compré en el stock creo

//Constructor SINGLETON
    private static Stock instancia = null;
    public static Stock getInstance() {
        if (instancia == null) {
            instancia = new Stock();
        }//No hay else, si la instancia ya existe no se hace nada, solo se devuleve
        return instancia;
    }


//Setters y Getters
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public List<ItemDeSTOCK> getItemsDeSTOCK() {return this.ItemsDeSTOCK;}

}