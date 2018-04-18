/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student
 */
public class Student extends Osoba {
    private int nrIndeksu;
    private String typ;
    private String kierunek;
    private int rok;

    public Student(int nrIndeksu, String typ, String kierunek, int rok, String imie, String nazwisko, String plec, String urodzony) {
        super(imie, nazwisko, plec, urodzony);
        this.nrIndeksu = nrIndeksu;
        this.typ = typ;
        this.kierunek = kierunek;
        this.rok = rok;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }
    @Override
    public void dane()
    {
        System.out.println(getImie()+" "+getNazwisko()+" "+getUrodzony()+" "+getPlec()+" "+getNrIndeksu()+" "+getTyp()+" "+getKierunek()+" "+getRok()); 
    }
    
    
}
