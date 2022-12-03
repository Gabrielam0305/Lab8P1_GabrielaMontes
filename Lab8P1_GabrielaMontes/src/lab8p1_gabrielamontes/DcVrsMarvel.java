/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_gabrielamontes;

/**
 *
 * @author Gabriela Montes
 */
public class DcVrsMarvel {
    public String nombresuperheroe;
    public String franqicia;
    public String nombrereal;
    public String lugar;

    public DcVrsMarvel(String nombresuperheroe, String franqicia, String nombrereal, String lugar) {
        this.nombresuperheroe = nombresuperheroe;
        this.franqicia = franqicia;
        this.nombrereal = nombrereal;
        this.lugar = lugar;
    }

    public DcVrsMarvel() {
    }
    
    public void nombresup (DcVrsMarvel name, String nom){
        if (nom.equals(name.getNombresuperheroe())){
            System.out.println("Nombre de super heroe "+name.getNombresuperheroe());
            System.out.println("Nombre real"+name.getNombrereal());
            System.out.println("Ciudad de origen"+name.getLugar());
            System.out.println("Franquicia "+name.getFranqicia());
            String encontrado="Si";
        }   else{
            System.out.println("NO ENCONTRADO");
        }
    }
    
     public void nombrenor (DcVrsMarvel name, String nom){
        if (nom.equals(name.getNombrereal())){
            System.out.println("Nombre de super heroe"+name.getNombresuperheroe());
            System.out.println("Nombre real"+name.getNombrereal());
            System.out.println("Ciudad de origen"+name.getLugar());
            System.out.println("Franquicia "+name.getFranqicia()); 
    }else{
         System.out.println("NO ENCONTRADO");   
        }
     }
     
     public boolean igual (DcVrsMarvel nombre, String nombrereal){
         boolean igual=false;
        if (nombre.equals(nombre.getNombrereal())){
            System.out.println();
            igual=true;
            return igual;
    }
        return igual;
     }

    public String getNombresuperheroe() {
        return nombresuperheroe;
    }

    public String getFranqicia() {
        return franqicia;
    }

    public String getNombrereal() {
        return nombrereal;
    }

    public String getLugar() {
        return lugar;
    }
    
    
    public void setNombresuperheroe(String nombresuperheroe) {
        this.nombresuperheroe = nombresuperheroe;
    }

    public void setFranqicia(String franqicia) {
        this.franqicia = franqicia;
    }

    public void setNombrereal(String nombrereal) {
        this.nombrereal = nombrereal;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
}
