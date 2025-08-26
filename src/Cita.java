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
    public void mostrarCitaInfo(){
        System.out.println("Fecha: "+fecha);
        System.out.println("Hora: "+hora);
        System.out.println("Motivo: "+motivo);
        System.out.println("Veterinario: ");
        veterinario.mostrarInfo();
        System.out.println("Mascota: ");
        mascota.mostrarInfo();
        System.out.println("Dueño: ");
        dueno.mostrarInfo();

    }
}
