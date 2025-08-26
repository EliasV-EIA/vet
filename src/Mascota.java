public class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    public Mascota(String nom, String spe, String raz){
        this.nombre=nom;
        this.especie=spe;
        this.raza=raz;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Especie: "+this.especie);
        System.out.println("Raza: "+this.raza);
    }
}
