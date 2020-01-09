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
public class Konto {
    private String pesel;
    private String login;
    private String haslo;
    private double stan_konta;
    public boolean czyzalogowany=false;
    public boolean czyaktywne=true;
    
   
    Konto(String pesel, String login, String haslo){
        this.pesel=pesel;
        this.login=login;
        this.haslo=haslo;
    }
    public String getLogin(){
        if ((this.czyzalogowany==true) && (this.czyaktywne==true)){
        return login;
        }
        else return null;
    }
    public String getHaslo(){
        if ((this.czyzalogowany==true) && (this.czyaktywne==true)){
        return haslo;
        }
        else return null;
    }
     public String getPesel(){
        if ((this.czyzalogowany==true) && (this.czyaktywne==true)){
        return pesel;
        }
        else return null;
    }
    public boolean getczyzalogowany(){
        return this.czyzalogowany;
    }
    public boolean getczyaktywne(){
        return this.czyaktywne;
    }
    public double getStanKonta(){
        if ((this.czyzalogowany==true) && (this.czyaktywne==true)){
        return this.stan_konta;
        }
        else return 0;
    }
    
    public int wplac(double kwota){
        if ((this.czyzalogowany==true) && (this.czyaktywne==true)){
        this.stan_konta=this.stan_konta + kwota;
        return 3;
        }
        else return 4;
    }
    
    public int wyplac(double kwota){
         if ((this.czyzalogowany==true) && (this.czyaktywne==true)){
            if(kwota<this.stan_konta){
                this.stan_konta=this.stan_konta-kwota;
                return 1;
             }
            else return 2;
         }
         else return 3;
     }
     
    public int zmianaHasla(String haslo, String noweHaslo){
         if ((this.czyzalogowany==true) && (this.czyaktywne==true)){
         if(this.haslo.equals(haslo)){
             this.haslo=noweHaslo;
             return 1;
             }
             else return 2;
         }
         else return 3;
    }
     
     
    public boolean wyloguj(){
         return this.czyzalogowany=false;
     }
     
    public int zaloguj(String login, String haslo){
        if((this.login.equals(login)) && (this.haslo.equals(haslo))){ 
        this.czyzalogowany=true;
        return 0;
    }
    else return 1;
}
}
