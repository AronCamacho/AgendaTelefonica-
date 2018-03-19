
package Esquema;


public class Persona {
    private int ID;
        private String nombre;
        private String emaill;
        private String telefono;
        
        public Persona (){
        }

    public Persona(int ID, String nombre, String emaill, String telefono) {
        this.ID = ID;
        this.nombre = nombre;
        this.emaill = emaill;
        this.telefono = telefono;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
        
        
    
}
