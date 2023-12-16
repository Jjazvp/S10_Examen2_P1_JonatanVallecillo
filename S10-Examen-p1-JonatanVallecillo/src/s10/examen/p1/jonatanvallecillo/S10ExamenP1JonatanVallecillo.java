package s10.examen.p1.jonatanvallecillo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class S10ExamenP1JonatanVallecillo {

    //fila 1, silla 5
    
    public static Random random = new Random();
    public static Scanner pipipi = new Scanner(System.in);
   
    public static void main(String[] args) {
        ArrayList<personajes> persparty = new ArrayList<>();
        persparty.add(new personajes("Sora", 300.0, 300.0, 75.0, 15.0));
        persparty.add(new personajes("Donald", 150.0, 400.0, 45.0, 10.0));
        persparty.add(new personajes("Goofy", 450.0, 100.0, 150.0, 50.0));
        
        personajes sora = persparty.get(0);
        personajes donald = persparty.get(1);
        personajes goofy = persparty.get(2);
        
        ArrayList<items> items = new ArrayList<>();
        items.add(new items("Pocion", 50, 0));
        items.add(new items("Ether", 0, 50));
        items.add(new items("Elixir", 100, 100));
        
        items pocion = items.get(0);
        items ether = items.get(1);
        items elixir = items.get(2);
        
        int heartless;
        int cuarto = 1;
        
        for(int rondas = 0; rondas < 20; rondas++){
            char s = 's';
            while (s == 's' || s == 'S'){
                System.out.println("Has entrado al cuarto "+cuarto);
                heartless = 1 + random.nextInt(3);
                double HPheartless = 75*heartless;
                double ataqueheartless = 25;
                System.out.println("Te has encontrado a "+heartless+" heartless!");

                int opcion = 0;
                char S = 's';
                while(S == 's' || S == 'S'){
                    int item2;
                    int menuAcciones;
                    double daño;
                    opcion = elegir(sora, donald, goofy);
                    if (opcion >= 0 && opcion < 3){
                        
                        if(opcion == 0){
                            menuAcciones = menu();
                            
                            if(menuAcciones == 1){
                                daño = menuataque();
                                HPheartless -= daño;
                                System.out.println("La vida de los heartless se ha reducido a: "+HPheartless);
                            }else if (menuAcciones == 2){
                                
                            }else if (menuAcciones == 3){
                                item2 = elegiritem(pocion, ether, elixir);
                            }
                            S = 'n';
                        }else if(opcion == 1){
                            menuAcciones = menu();
                            
                            if(menuAcciones == 1){
                                daño = menuataque();
                                HPheartless -= daño;
                                System.out.println("La vida de los heartless se ha reducido a: "+HPheartless);
                            }else if (menuAcciones == 2){
                                
                            }else if (menuAcciones == 3){
                                item2 = elegiritem(pocion, ether, elixir);
                            }
                            S = 'n';
                        }else{
                            menuAcciones = menu();
                            
                            if(menuAcciones == 1){
                                daño = menuataque();
                                HPheartless -= daño;
                                System.out.println("La vida de los heartless se ha reducido a: "+HPheartless);
                            }else if (menuAcciones == 2){
                                
                            }else if (menuAcciones == 3){
                                item2 = elegiritem(pocion, ether, elixir);
                            }
                            S = 'n';
                        }
                    }else{
                        System.out.println("Ingrese un personaje valido!");
                        System.out.println();
                    }
                }
                

                System.out.println("Desea continuar? (S/N)");
                s = pipipi.next().charAt(0);
                if(s != 's' || s != 'S'){
                    rondas = 21;
                    System.out.println("Ha salido del juego!");
                }
                cuarto ++;
                System.out.println();
                System.out.println();
            }
        }
    }
    
    public static int elegir(personajes sora, personajes donald, personajes goofy){
        int opcion;
        System.out.println("0.- "+sora.getNombre());
        System.out.println("HP= "+sora.getHP());
        System.out.println("MP= "+sora.getMP());
        System.out.println("Attack P.= "+sora.getAttaque());
        System.out.println("Defense P.= "+sora.getDef());
        System.out.println();
        
        System.out.println("1.- "+donald.getNombre());
        System.out.println("HP= "+donald.getHP());
        System.out.println("MP= "+donald.getMP());
        System.out.println("Attack P.= "+donald.getAttaque());
        System.out.println("Defense P.= "+donald.getDef());
        System.out.println();
        
        System.out.println("2.- "+goofy.getNombre());
        System.out.println("HP= "+goofy.getHP());
        System.out.println("MP= "+goofy.getMP());
        System.out.println("Attack P.= "+goofy.getAttaque());
        System.out.println("Defense P.= "+goofy.getDef());
        System.out.println();
        
        System.out.println("Elija al personaje:");
        opcion = pipipi.nextInt();
        return opcion;
    }
    
    
    public static ArrayList<String> nombresParty(){
        ArrayList<String> array = new ArrayList<String>();
        array.add("Sora");
        array.add("Donald");
        array.add("Goofy");
        return array;
    }
    
    public static int menu(){
        char s = 's';
        int item = 0;
        while(s == 's' || s == 'S'){
            System.out.println("------ Menu ------");
            System.out.println("    1.- Attack");
            System.out.println("    2.- Magic");
            System.out.println("    3.- Items");
            System.out.println("    4.- Party");
            item = pipipi.nextInt();
            
            if (item > 0 && item < 5){
                s = 'n';
            }else{
                System.out.println("Ingrese un item valido");
            }
        }
        return item;
    }
    
    public static double menuataque(){
        int ataque = 0;
        double daño = 0;
        char s = 's';
        while(s == 's' || s == 'S'){
            System.out.println("---- Submenu ----");
            System.out.println("   1.- Blizzard 50MP - 50DMG");
            System.out.println("   2.- Firaga   25MP - 25DMG");
            System.out.println("   3.- Gravity  75MP - 100DMg");
            ataque = pipipi.nextInt();
            
            if (ataque > 0 && ataque < 4){
                switch(ataque){
                    case 1:
                        daño = 50;
                        break;
                    case 2:
                        daño = 25;
                        break;
                    case 3:
                        daño = 100;
                        break;
                }
                s = 'n';
            }else{
                System.out.println("Ingrese un item valido");
            }
        }
        return daño;
    }
    
    public static int elegiritem(items pocion, items ether, items elixir){
        int item = 0;
        char s = 's';
        while(s == 's' || s == 'S'){
            System.out.println();
            System.out.println("0.- "+pocion.getNombre()+", "+pocion.getHPpnt()+" ,"+pocion.getMPpnt());
            System.out.println("1.- "+ether.getNombre()+", "+ether.getHPpnt()+" ,"+ether.getMPpnt());
            System.out.println("2.- "+elixir.getNombre()+", "+elixir.getHPpnt()+" ,"+elixir.getMPpnt());
            System.out.println();
            System.out.println("Elija un item: ");
            item = pipipi.nextInt();
            
            if (item > -1 && item < 4){
                s = 'n';
            }else{
                System.out.println("Ingrese un item valido");
            }
        }
        System.out.println();
        return item;
    }
}
