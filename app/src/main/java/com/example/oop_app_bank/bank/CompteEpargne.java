package com.example.oop_app_bank.bank;

public class CompteEpargne extends Compte{
    private double taux;

    public CompteEpargne(){
        solde = 0;
        taux = 5;
    }
    public CompteEpargne(double solde){
        super(solde);
        taux = 5;
    }




    public Double calculInterets(){
      return  solde *= 1+taux/100;
    }

    @Override
    public void updatSolde(double newSolde) {
        setSolde(newSolde);
    }



    @Override
    public String toString() {
        return super.toString()+" le taux est : "+taux+" et Interets est : "+calculInterets();
    }


    @Override
    public void retirer(double mt) throws Exception {
        super.retirer(mt);
    }




}
