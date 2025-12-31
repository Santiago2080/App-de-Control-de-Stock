package Persistencia.Clases;

import Persistencia.DTOs.DTUsuario;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    private Long id; //Es lo que uso para identificar, ya que el nickname no es muy robusto como metodo.
    private String nickname; //es UNICO
    private String nombre;
    private String apellido;
    private String imagen;
    private Stock stock;


    // Constructores
    public Usuario() {}
    public Usuario(String nickname, String nombre,String apellido, String imagen) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.imagen = imagen;
    }

    // Getters y setters
    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }



    //Contructor de DTUsuario: Creo un nuevo DTUsuario y uso las funciones internas del mismo para crearlo
    public DTUsuario getDataType() {
        DTUsuario dt = new DTUsuario();
        dt.setNickname(this.nickname);
        dt.setNombre(this.nombre);
        dt.setApellido(this.apellido);
        dt.setImagen(this.imagen);
        return dt;
    }
}