package com.example.oop_app_bank.bank;

import android.graphics.Path;

import com.example.oop_app_bank.exeption.Montaestpascomplit;
import com.example.oop_app_bank.exeption.Montantnegativeexeption;
import com.example.oop_app_bank.exeption.Soldeinsiffusantexeption;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Banque banque = new Banque();
        Compte c1 = new CompteEpargne(5000);
        ComptCourant c2 = new ComptCourant(500, 300);
        Compte c3 =  new ComptCourant(500, 300);

       try {
           banque.ajouterCompte(c2);
           banque.ajouterCompte(c2);
//           banque.suprimerCompt(3);
       }
       catch (Exception e){
           e.getMessage();
       }
        banque.getCompts();
        banque.IndiceCompte(1);




//        c1.versment(300, c2);

//        System.out.println(  c1.totalRetrait());
//        System.out.println(  c1.totalVersment());
//        try {
//            c1.verser(300);
//            c1.retirer(400);
//            c1.verser(500);
//           System.out.println(c2.toString());
//        } catch (Exception e) {
//            e.getMessage();
//        }
//
//      c1.getOperationLIst();
//        System.out.println(c1.totalVersment());
//        System.out.println(c1.totalRetrait());

//        for (Operation e : c1.operationList) {
//            if (e instanceof Versment) {
//                System.out.println(e);
//            }
//        }

//        System.out.println(c1.getSize());

//
//c2.getOperationLIst();


//
////        System.out.println(c1.getNameFichier());
//        try{
//            FileInputStream readData = new FileInputStream("Client1.ser");
//            ObjectInputStream readStream = new ObjectInputStream(readData);
//
//            ArrayList people2 = (ArrayList<Compte>) readStream.readObject();
//            readStream.close();
//
//            System.out.println(people2.toString());
//        }catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
////        }
//    }

    }}
