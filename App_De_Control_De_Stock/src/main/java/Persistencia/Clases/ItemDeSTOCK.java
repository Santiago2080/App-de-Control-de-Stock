package Persistencia.Clases;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ItemsDeSTOCK")
    public class ItemDeSTOCK {
        @Id
        private Long id;
        private String nombre;
        private String descripcion;
        private String imagen;
        private Integer cantUnidades;

        //Constructor
        public ItemDeSTOCK() {}
        public ItemDeSTOCK(String nombre, String descripcion, String imagen, Integer cantUnidades){
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.imagen = imagen;
            this.cantUnidades = cantUnidades;

        }




//Getters y Setters
        public void setId(Long id) {this.id = id;}

        public Long getId() {return id;}
        public String getNombre(){return nombre;}
        public Integer getCantUnidades() {return cantUnidades;}
}

/*Estos son los Items que van realmernte en el STOCK, ya que los ItemDeSTOCK de Proveedor X
me sirven para calcular precios y añadirlos a la taba de Catalogo x Proveedor
básicamente, luego los Items comunes no tienen el atributo cantUnidades ya que son
genericos, no tiene sentido que lo tengan, sirven como Frames, o Marcos, para
referencia se utilizan.

El que me sirve para guardar en el Stock Real de la empresa son los Items de STOCK,
ya que estos tienen la misma info que un item común pero se les suma la catidad de
unidades, así puedo tener una sola intancia del item que guardo en el stock y
solo le modifico la cantidad de unidades, así no tengo items repetidos al pedo.

Quizás podría hacerlo directo con los Items comunes pero así me resulta cómodo
de entender
 */