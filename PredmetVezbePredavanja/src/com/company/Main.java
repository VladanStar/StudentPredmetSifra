package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Predmet> predmeti = new ArrayList<>();
        Predmet p1 = new Predmet("Biologija","Vitomir Janjic","Janko Mirkovic",25,69);
        predmeti.add(p1);
        Predmet p2 = new Predmet("Menanika","Milan Ilic","Miroslav Miric",22,68);
        predmeti.add(p2);
        Predmet p3 = new Predmet("Borba face to face","BorivojeBikic","Lazar Torijas",20,36);
        predmeti.add(p3);
        Predmet p4 = new Predmet("Radiologija","Milo Jankos","Nives Kol",25,25);
        predmeti.add(p4);

        for(Predmet p : predmeti){
            System.out.println("Sifra predmeta je:  "+ p.getNaziv() +" je "+ p.odrediSifru());
        }
    }
}
