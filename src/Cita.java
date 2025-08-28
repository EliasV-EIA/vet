public class Cita {
    public String fecha;
    public String hora;
    public String motivo;
    public Dueno dueno;
    public Mascota mascota;
    public Veterinario veterinario;
    public Factura factura;

    public Cita(String fec, String hor, String mot, Dueno due, Mascota masc, Veterinario vet){
        this.fecha=fec;
        this.hora=hor;
        this.motivo=mot;
        this.dueno=due;
        this.mascota=masc;
        this.veterinario=vet;
        this.factura= new Factura();
    }

    public Factura getFactura() {
        return factura;
    }
    public String mostrarCitaInfo(){
        String output;
//        System.out.println("Fecha: "+fecha);
//        System.out.println("Hora: "+hora);
//        System.out.println("Motivo: "+motivo);
//        System.out.println("Veterinario: ");
//        veterinario.mostrarInfo();
//        System.out.println("Mascota: ");
//        mascota.mostrarInfo();
//        System.out.println("Dueño: ");
//        dueno.mostrarInfo();
        output="La fecha es el "+this.fecha+" a las "+this.hora+" por "+this.motivo+". El veterinario sera "+this.veterinario.getNombre()+ ", su especialidad siendo "+this.veterinario.getEspecialidad()+". La mascota se llama "+this.mascota.getNombre()+", es un(a) "+this.mascota.getEspecie()+" y de raza "+this.mascota.getRaza()+". Le perteneze a "+this.dueno.getNombre()+" cuyo email es "+this.dueno.getEmail()+" y su telefono es "+this.dueno.getTelefono();
    return  output;

    }
}
