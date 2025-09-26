import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int seleccion=0;
//        String nombre, telefono,email;
//        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
//        Dueno obj_Dueno=new Dueno(nombre,"doe@email.com","325168454");
//        Mascota obj_Mascota=new Mascota("Fluff","Conejo","Blanco");
//        Veterinario obj_veterinario = new Veterinario("Bob","Castracion");
//        Cita obj_cita=new Cita("Septiembre 11","13","Debe ser castigado por sus pecados", obj_Dueno,obj_Mascota,obj_veterinario);
//        obj_cita.mostrarCitaInfo();
//        System.out.println(obj_cita.mostrarCitaInfo());
        do{
            seleccion=JOptionPane.showConfirmDialog(null,"Deseas hacer otra cita?");
            if(seleccion == 1)
                System.out.println("Gracias por la visita!");
            else{
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
                String email = JOptionPane.showInputDialog(null, "Ingrese el email: ");
                String telefono = JOptionPane.showInputDialog(null, "Ingrese el telefono: ");
                Dueno obj_Dueno= new Dueno(nombre, email, telefono);
                Mascota obj_Mascota=new Mascota("Fluff","Conejo","Blanco");
                Veterinario obj_veterinario = new Veterinario("Bob","Castracion");
                Cita obj_cita=new Cita("Septiembre 11","13","Debe ser castigado por sus pecados", obj_Dueno,obj_Mascota,obj_veterinario);
                Factura fact= obj_cita.getFactura();
            }
        }while (seleccion==0);
    }

}