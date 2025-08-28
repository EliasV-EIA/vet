public class Persona {
    String nombre;
    public Persona(String nom){
        this.nombre=nom;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo(){
        System.out.println("Nombre:"+nombre);

    }
}
