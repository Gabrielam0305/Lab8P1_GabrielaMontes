/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_gabrielamontes;

import java.util.Scanner;

/**
 *
 * @author Gabriela Montes
 */
public class PocketMonsters {
    public String Nombre;
    public int vida;
    public int ataque;
    public int luck; 

    public PocketMonsters(String Nombre, int vida, int ataque, int luck) {
        this.Nombre = Nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.luck = luck;
    }

    public PocketMonsters() {
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getLuck() {
        return luck;
    }
    
    public void simulador (PocketMonsters pockemon1,PocketMonsters pockemon2 ){
        int luck1=pockemon1.getLuck();
        int luck2=pockemon2.getLuck(); 
        String nombre1=pockemon1.getNombre();
        String nombre2=pockemon2.getNombre();
        int vida1=pockemon1.getVida();
        int vida2=pockemon2.getVida();
        int ataque1=pockemon1.getAtaque();
        int ataque2=pockemon2.getAtaque();
        int k=1;
        while ((vida2>0)&&(vida1>0)){
            System.out.println("Ronda "+k);
        if(luck1>luck2){
            System.out.println(nombre1+" ataca primero tiene: "+vida1+ " puntos de vida");  
            System.out.println(nombre2+" ataca segundo tiene: "+vida2+ " puntos de vida");
            System.out.println("** Puntos restantes: **");
            vida1-=ataque2;
             vida2-=ataque1;
             pockemon1.setVida(vida1);
             pockemon2.setVida(vida2);
             System.out.println(nombre1+" tiene  "+vida1+ " puntos de vida restantes");  
            System.out.println(nombre2+" tiene: "+vida2+ " puntos de vida restantes");
        } else if (luck1==luck2){
            System.out.println(nombre1+" ataca primero tiene: "+vida1+ " puntos de vida");  
            System.out.println(nombre2+" ataca segundo tiene: "+vida2+ " puntos de vida");
            System.out.println("** Puntos restantes: **");
            vida1-=ataque2;
             vida2-=ataque1;
             pockemon1.setVida(vida1);
             pockemon2.setVida(vida2);
             System.out.println(nombre1+" tiene  "+vida1+ " puntos de vida restantes");  
            System.out.println(nombre2+" tiene: "+vida2+ " puntos de vida restantes");
        }else{
            System.out.println(nombre2+" ataca primero tiene: "+vida2+ " puntos de vida");  
            System.out.println(nombre1+" ataca segundo tiene: "+vida1+ " puntos de vida");
            System.out.println("** Puntos restantes: **");
            vida1-=ataque2;
             vida2-=ataque1;
             pockemon1.setVida(vida1);
             pockemon2.setVida(vida2);
             System.out.println(nombre1+" tiene  "+vida1+ " puntos de vida restantes");  
            System.out.println(nombre2+" tiene: "+vida2+ " puntos de vida restantes");
        }
        k+=1;
    }
        if(vida1>0){
            System.out.println(nombre1+" es el ganador");
        }else{
            System.out.println(nombre2+" es el ganador");
        }
        //while
    }
}
