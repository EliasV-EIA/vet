public class Veterinario extends Persona{
    private String especialidad;
    public Veterinario(String nom, String esp){
        super(nom);
        this.especialidad=esp;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Especialidad: "+this.especialidad);
    }
}
