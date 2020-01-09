/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankprojekt;

import java.util.ArrayList;

/**
 *
 * @author Bartek
 */
public class Bank{
   private ArrayList<Konto> konta = new ArrayList( );
       
    public Konto getKonto(int pozycja){
           return konta.get(pozycja);
    }
    
    public void stworzKonto(String pesel, String login, String haslo){
           konta.add(new Konto(pesel, login, haslo)); 
    }
    public int usunKonto(String pesel){
          int pozycja = wyszukajKonto(pesel);
          if (pozycja == -2){
              return -2; // nie ma takiej pozycji
          }
          else{
              konta.remove(pozycja);
              return 0;
          }
    }
    public int wyszukajKonto(String pesel){
           for (int i = 0; i < konta.size(); i++){
              if ((konta.get(i).getPesel().equals(pesel))) return i;
           }
           return -2; // nie ma takiej pozycji
    }
        public int wplac(Konto a, double kwota){
        return a.wplac(kwota);
    }
    
    public int wyplac(Konto a, double kwota){
         return a.wyplac(kwota);
     }
    
    public double getStanKonta(Konto a){
        return a.getStanKonta();
    }
     
    public int zmianaHasla(Konto a, String haslo, String noweHaslo){
         return a.zmianaHasla(haslo, noweHaslo);
    }
     
     
    public boolean wyloguj(Konto a){
        return a.wyloguj();
     }
     
    public int zaloguj(Konto a, String login, String haslo){
        return a.zaloguj(login, haslo);
}
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.stworzKonto("pesel1","login1","haslo1");
        bank.stworzKonto("pesel2","login2","haslo2");
        bank.stworzKonto("pesel3","login3","haslo3");
    }
}
