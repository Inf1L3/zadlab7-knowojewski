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
public class Wykładowca extends Osoba {
    private String stopien;
    private String przedmiot;
    private String samochod;

    public Wykładowca(String stopien, String przedmiot, String samochod, String imie, String nazwisko, String plec, String urodzony) {
        super(imie, nazwisko, plec, urodzony);
        this.stopien = stopien;
        this.przedmiot = przedmiot;
        this.samochod = samochod;
    }

    public String getStopien() {
        return stopien;
    }

    public void setStopien(String stopien) {
        this.stopien = stopien;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public String getSamochod() {
        return samochod;
    }

    public void setSamochod(String samochod) {
        this.samochod = samochod;
    }

    @Override
    public void dane()
    {
        System.out.println(getImie()+" "+getNazwisko()+" "+getUrodzony()+" "+getPlec()+" "+getPrzedmiot()+" "+getSamochod()+" "+getStopien()); 
    }
    
    
    
    
    
}
