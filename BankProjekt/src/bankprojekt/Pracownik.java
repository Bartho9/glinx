/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankprojekt;

/**
 *
 * @author Bartek
 */
public class Pracownik extends Bank {
    
 public void stworzKonto(Bank a, String pesel, String login, String haslo){
         a.stworzKonto(pesel,login,haslo); 
    }
    public int usunKonto(Bank a, String pesel){
         int wynik = a.usunKonto(pesel);
         return wynik;
    }
    public int wyszukajKonto(Bank a, String pesel){
           int wynik = a.wyszukajKonto(pesel);
           return wynik;
    }
}

