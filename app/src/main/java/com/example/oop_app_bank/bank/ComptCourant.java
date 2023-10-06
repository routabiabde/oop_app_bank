package com.example.oop_app_bank.bank;

import java.util.Date;

public class ComptCourant extends Compte {
    private double decouvert;

    public ComptCourant() {
        solde = 0;
        decouvert = 500;
    }

    public ComptCourant(double solde, float decouvert) {
        super(solde);

        this.decouvert = decouvert;
    }

    @Override
    public void updatSolde(double newSolde) {
        super.updatSolde(newSolde);
    }


    @Override
    public String toString() {

        return super.toString() + " " + decouvert;
    }


    public void retirer(double mt) throws Exception {
        if (mt <= solde + decouvert) {
            solde -= mt;
            ++cO;
            operationList.add(new Rertrai(cO, new Date(), mt));
            totRetier += mt;

        }

    }

}
