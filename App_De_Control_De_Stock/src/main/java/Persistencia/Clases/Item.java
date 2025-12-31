package Persistencia.Clases;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import Persistencia.DTOs.DTItem;

@Entity
@Table(name = "Items")
public class Item {
    @Id
    private Long id;
    private String nombre;
    private String descripcion;
    private String imagen;

    //Constructor
    public Item() {}
    public Item(String nombre, String descripcion, String imagen){
        nombre = this.nombre;
        descripcion = this.descripcion;
        imagen = this.imagen;
    }



    //Getters y Setters
    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}

    /*
    //Construir DTITEM
    public DTItem getDTItem() {
        DTItem dt = new DTItem();
        dt.setNombre(this.nombre);
        dt.setDescripcion(this.descripcion);
        dt.setImagen(this.imagen);
        return dt;
    }
*/
}