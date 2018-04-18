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
public class Main {
    public static void main(String[] args) {

        Student s1;
        s1 = new Student(1231, "Magisterka", "Informatyka", 1, "Mietek", "Trolewski", "mężczyzna", "01.01.1997");
        Wykładowca w1;
        w1 = new Wykładowca("Magister", "Wstep do Informatyki", "Rolls Royce Ghost", "Lech", "Kurnik", "mężczyzna", "01.01.1970");
        Osoba o1;
        o1 = new Osoba("Tiger", "Bonzo", "01.01.1980", "mężczyzna");
        s1.dane();
        w1.dane();
        o1.dane();
        Student s2;
        s2 = new Student(1231, "Inżynierka", "Matematyka", 3, "Kajetan", "Rubberman", "transwestyta", "30.12.1995");
        Wykładowca w2;
        w2 = new Wykładowca("Doktor", "Algebra", "McLaren P1", "Kazimierz", "Trynkiewicz", "mężczyzna", "23.11.1991");
        Osoba o2;
        o2 = new Osoba("Kobra", "Bonzo", "25.11.1983", "kobieta");
        s2.dane();
        w2.dane();
        o2.dane();
    }
    
}
