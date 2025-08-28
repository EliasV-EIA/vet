public class Dueno extends Persona {
    private String email;
    private String telefono;

    public Dueno(String nom, String em, String tel){
        super(nom);
        this.email=em;
        this.telefono=tel;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Email: "+ email);
        System.out.println("Telefono: "+ this.telefono);
    }
}
