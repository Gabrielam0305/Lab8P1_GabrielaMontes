/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_gabrielamontes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabriela Montes
 */
public class Lab8P1_GabrielaMontes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("---Menu---");
        System.out.println("Opcion 1: Pocket Monsters ");
        System.out.println("Opcion 2: Dc vrs Marvel");
        System.out.println("Opcion 3: Salida");
        System.out.println(" ");
        System.out.println("Ingrese su respuesta: ");
        int op = entrada.nextInt();
         do{
               switch (op){
             case 1:
         ArrayList<PocketMonsters>jugador1=new ArrayList<PocketMonsters>();
         ArrayList<PocketMonsters>jugador2=new ArrayList<PocketMonsters>();
         System.out.println("Jugador 1");
         System.out.println("Cuantos quiere ingresar");
         int num =entrada.nextInt();
         while((num>3)||(num<0)){
             System.out.println("ERROR");
             System.out.println("Cuantos quiere ingresar");
             num =entrada.nextInt();
         }
            for (int i = 1; i <=num; i++) {
                entrada = new Scanner(System.in);
             System.out.println("Ingrese el nombre: ");
        String nom=entrada.nextLine();
        System.out.println("Ingrese los puntos de vida: ");
        int vid=entrada.nextInt();
         while(vid>300){
             System.out.println("Ingrese los puntos de vida: ");
                vid=entrada.nextInt();
         }
        System.out.println("Ingrese los puntos de ataque: ");
        int ataq=entrada.nextInt();
        int l=new Random().nextInt((5 - 1) + 1) + 1;
        System.out.println("--Pokemon creado--");
        PocketMonsters p= new PocketMonsters(nom,vid,ataq,l);
        jugador1.add(p);
        }
         System.out.println("-----Jugador 2-----");
         System.out.println("Cuantos quiere ingresar");
         int num2 =entrada.nextInt();
          while((num2>3)||(num2<0)){
             System.out.println("ERROR");
             System.out.println("Cuantos quiere ingresar");
              num2=entrada.nextInt();
         }
            for (int i = 1; i <=num2; i++) {
                
             System.out.println("Ingrese el nombre: ");
             entrada = new Scanner(System.in);
        String nom=entrada.nextLine();
        System.out.println("Ingrese los puntos de vida: ");
        int vid=entrada.nextInt();
         while(vid>300){
             System.out.println("Ingrese los puntos de vida: ");
                vid=entrada.nextInt();
         }
        System.out.println("Ingrese los puntos de ataque: ");
        int ataq=entrada.nextInt();
        int l=new Random().nextInt((5 - 1) + 1) + 1;
            System.out.println("--Pokemon creado--");
        PocketMonsters p2= new PocketMonsters(nom,vid,ataq,l);
        jugador2.add(p2);
        }
         
         while((jugador1.size()>0)&&(jugador2.size()>0)){
         PocketMonsters pockemon1=jugador1.get(0);
         PocketMonsters pockemon2=jugador2.get(0);
         pockemon1.simulador(pockemon1, pockemon2);
        int vi1=pockemon1.getVida();
        
        int vi2=pockemon2.getVida();
                
         if(vi1<=0){
             jugador1.remove(0);
         }else{
             jugador2.remove(0);
         }
         }
         
         if(jugador1.isEmpty()){
             System.out.println("Jugador 1 ya no puede continuar");
         }else{
             System.out.println("Jugador 2 ya no puede continuar");
         }
                 break;
             case 2:
                 ArrayList<DcVrsMarvel>marvel=new ArrayList<DcVrsMarvel>();
                 ArrayList<DcVrsMarvel>dc=new ArrayList<DcVrsMarvel>();
                 dc.add(new DcVrsMarvel("Batman","DC","Bruce Wayne","Gotham" ));
                 dc.add(new DcVrsMarvel("Starfire","DC","Koriand'r","Tamaran" ));
                 dc.add(new DcVrsMarvel("Ravager","DC","Rose Wilson","New York City/Cambodia" ));
                 dc.add(new DcVrsMarvel("Spoiler","DC","Stephanie Brown","Gotham" ));
                 dc.add(new DcVrsMarvel("Zatanna","DC","Zatanna Zatara","San Francisco" ));
                 dc.add(new DcVrsMarvel("Blue Beetle","DC","Jaime Reyes","El paso, Texas" ));
                 dc.add(new DcVrsMarvel("Man-bat","DC","Dr. Robert Kirkland Langstrom","Gotham" ));
                 dc.add(new DcVrsMarvel("Batwoman","DC","Katherine Rebecca Kane","Gotham" ));
                 dc.add(new DcVrsMarvel("Wonder Girl","DC","Cassie Sandsmark","Gateway City" ));
                 dc.add(new DcVrsMarvel("Black Canary","DC","Dinah Drake","Gotham" ));
                 marvel.add(new DcVrsMarvel("Storm","Marvel","Ororo Munroe","Harlem" ));
                 marvel.add(new DcVrsMarvel("Mirage","Marvel","Dani Moonstar","Boulder, Colorado" ));
                 marvel.add(new DcVrsMarvel("Karma","Marvel","Xi'an Coy Manh","Saigon" ));
                 marvel.add(new DcVrsMarvel("Magik","Marvel","Ilyana Rasputina","Russian unkwon city" ));
                 marvel.add(new DcVrsMarvel("Shadow Cat","Marvel","Katherine Pryde","Deerfield, Illinois" ));
                 marvel.add(new DcVrsMarvel("Cyclops","Marvel","Scott Summers","Anchorage, Alaska" ));
                 marvel.add(new DcVrsMarvel("Aurora","Marvel","Jeanne-Marie Beaubier","Montreal, Quebec" ));
                 marvel.add(new DcVrsMarvel("Jubilee","Marvel","Jubilation Lee","Beverly Hills" ));
                 marvel.add(new DcVrsMarvel("Lady of the Northern Skies","Marvel","Roma Regina","otherworld" ));
                 marvel.add(new DcVrsMarvel("Captain Avalon","Marvel","Brian Braddock","Maldon, Essex" ));
                 System.out.println("Que desea hacer: [1.Buscar, 2.Agregar]");
                 int opcion = entrada.nextInt();
                 switch(opcion){
                     case 1:
                         System.out.println("Entro a la opcion buscar ");
                         System.out.println("Quiere buscar por 1. Nombre de superheroe o 2. Nombre verdadero");
                         int nom = entrada.nextInt();
                             switch(nom){
                                 case 1:
                                     entrada = new Scanner(System.in);
                                     System.out.println("Ingrese el nombre de superheroe");
                                     String n=entrada.nextLine();
                                     String e="";
                                     String d="";
                         for (int i = 0; i <dc.size(); i++) {
                             DcVrsMarvel dcname=dc.get(i);
                             DcVrsMarvel marvelname=marvel.get(i);
                              dcname.nombresup(dcname,n );
                              marvelname.nombresup(marvelname,n );
                         } 
                         break;
                                 case 2:
                                     entrada = new Scanner(System.in);
                                      System.out.println("Ingrese el nombre de real");
                                     String nn=entrada.nextLine();
                         for (int i = 0; i <dc.size(); i++) {
                             DcVrsMarvel dcname=dc.get(i);
                             DcVrsMarvel marvelname=marvel.get(i);
                              dcname.nombrenor(dcname,nn );
                              marvelname.nombrenor(marvelname,nn );
                         }
                         break;
                                     
                 }
                             break;
                     case 2:
                         entrada = new Scanner(System.in);
                         System.out.println("Ingrese el nombre de heroe: "); 
                         String nomsup=entrada.nextLine();
                         for (int i = 0; i <dc.size(); i++) {
                             DcVrsMarvel dname=dc.get(i);
                             DcVrsMarvel mname=marvel.get(i);
                             
                              dname.igual(dname, nomsup);
                              mname.igual(mname, nomsup);
                              
                         }
                         System.out.println("Ingrese el nombre verdadero: ");
                         String nomver=entrada.nextLine();
                         System.out.println("Ingrese la franquicia: ");
                         String fran=entrada.nextLine();
                         System.out.println("Ingrese la ciudad de origen: ");
                         String c=entrada.nextLine();
                        if ((fran.equals("dc"))||(fran.equals("DC"))){
                              dc.add(new DcVrsMarvel(nomsup,fran,nomver,c ));
                              for (int i = 0; i < dc.size(); i++) {
                                  DcVrsMarvel dname=dc.get(i);
                                if (nomsup.equals(dname.nombresuperheroe)){
                                    System.out.println("SUPERHEROE YA EXISTE");
                            }
                                
                            }
                         }else{
                            marvel.add(new DcVrsMarvel(nomsup,fran,nomver,c));
                             for (int i = 0; i < marvel.size(); i++) {
                                  DcVrsMarvel mname=marvel. get(i);
                                if (nomsup.equals(mname.getNombresuperheroe())){
                                    System.out.println("SUPERHEROE YA EXISTE");
                            }
                                
                            }
                        }
                            System.out.println("Superheroe agregado");
                         
                        break;
                 }
                 break;
               }
               
        System.out.println("---Menu---");
        System.out.println("Opcion 1: Pocket Monsters ");
        System.out.println("Opcion 2: Dc vrs Marvel");
        System.out.println("Opcion 3: Salida");
        System.out.println(" ");
        System.out.println("Ingrese su respuesta: ");
    op = entrada.nextInt();
               
         }while(op!=3);
        
        // TODO code application logic here
    }
    
}
