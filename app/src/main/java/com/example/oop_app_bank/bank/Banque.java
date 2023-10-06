package com.example.oop_app_bank.bank;

import com.example.oop_app_bank.exeption.ComptDejaExist;

import java.util.ArrayList;

public class Banque {
ArrayList<Compte> compts = new ArrayList<>();

public void ajouterCompte(Compte cp) throws ComptDejaExist{
    if (compts.contains(cp)) throw new ComptDejaExist("le compte et deja exist");{
        compts.add(cp);
    }


}
public double IndiceCompte(int code){
    for (int i= 0; i<compts.size();i++){
        if ( compts.get(i).getCode() == code){
            return ( compts.indexOf(compts.get(i)));
        }
    }
    return 0;


}

    public void suprimerCompt(int code) throws Exception{
        for (int i= 0; i<compts.size();i++) {
            if (!compts.contains(compts.get(i).getCode() )) throw new ComptDejaExist("le compte et deja exist");
            {
                compts.remove(compts.get(i));
            }

        }
    }

public void getCompts(){
    for (Compte e:compts) {
        System.out.println(e.toString());
    }
}

}
