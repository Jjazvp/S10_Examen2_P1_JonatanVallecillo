package s10.examen.p1.jonatanvallecillo;

import java.util.ArrayList;

public class personajes {
    String nombre;
    double HP;
    double MP;
    double Attaque;
    double def;

    public personajes(String nombre, double HP, double MP, double Attaque, double def) {
        this.nombre = nombre;
        this.HP = HP;
        this.MP = MP;
        this.Attaque = Attaque;
        this.def = def;
    }

    public String getNombre() {
        return nombre;
    }

    public double getHP() {
        return HP;
    }

    public double getMP() {
        return MP;
    }

    public double getAttaque() {
        return Attaque;
    }

    public double getDef() {
        return def;
    }
    
    
    
}
