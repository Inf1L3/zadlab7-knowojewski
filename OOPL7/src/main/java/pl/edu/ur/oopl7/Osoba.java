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
public class Osoba {
    private String imie;
    private String nazwisko;
    private String plec;
    private String urodzony;

    public Osoba(String imie, String nazwisko, String plec, String urodzony) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.urodzony = urodzony;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String getUrodzony() {
        return urodzony;
    }

    public void setUrodzony(String urodzony) {
        this.urodzony = urodzony;
    }
    
    public void dane()
    {
        System.out.println(getImie()+" "+getNazwisko()+" "+getUrodzony()+" "+getPlec());       
    }
    
}
