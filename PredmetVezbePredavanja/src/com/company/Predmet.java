package com.company;

public class Predmet {
    private String naziv;
    private int brojCasova;
    private int brojVezbi;
    private String profesor;
    private String asistent;

    public Predmet() {
    }

    public Predmet(String naziv, String profesor, String asistent, int brojCasova, int brojVezbi ) {
        this.naziv = naziv;
        this.brojCasova = brojCasova;
        this.brojVezbi = brojVezbi;
        this.profesor = profesor;
        this.asistent = asistent;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojCasova() {
        return brojCasova;
    }

    public void setBrojCasova(int brojCasova) {
        this.brojCasova = brojCasova;
    }

    public int getBrojVezbi() {
        return brojVezbi;
    }

    public void setBrojVezbi(int brojVezbi) {
        this.brojVezbi = brojVezbi;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getAsistent() {
        return asistent;
    }

    public void setAsistent(String asistent) {
        this.asistent = asistent;
    }
    public String odrediSifru(){
        return naziv.substring(0,2)+ brojCasova+brojVezbi;
    }

    @Override
    public String toString() {
        return "Predmet{" +
                "naziv='" + naziv + '\'' +
                ", brojCasova=" + brojCasova +
                ", brojVezbi=" + brojVezbi +
                ", profesor='" + profesor + '\'' +
                ", asistent='" + asistent + '\'' +
                '}';
    }
}
