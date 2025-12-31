package Persistencia.DTOs;

public class DTUsuario {
    private String nickname;
    private String nombre;
    private String apellido;
    private String imagen;

    //Constructores
    public DTUsuario() {}
    public Usuario(String nickname, String nombre,String apellido, String imagen) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.imagen = imagen;
    }

    //Getters y Setters
    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }


}