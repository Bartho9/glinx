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
public class Wlasciciel{
    
    public int wplac(Konto a, double kwota){
        return a.wplac(kwota);
    }
    
    public int wyplac(Konto a, double kwota){
         return a.wyplac(kwota);
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
}
