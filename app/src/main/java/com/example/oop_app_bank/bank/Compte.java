package com.example.oop_app_bank.bank;
import android.graphics.Path;

import androidx.annotation.NonNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import com.example.oop_app_bank.exeption.Montaestpascomplit;
import com.example.oop_app_bank.exeption.Montantnegativeexeption;
import com.example.oop_app_bank.exeption.Soldeinsiffusantexeption;

import java.util.ArrayList;

public abstract class Compte extends Banque implements ICompte{
    private int  code ;

    protected double solde;

    public  int cO =0 ;
    public String nameFichier ;

//    public String getNameFichier(){
//        return nameFichier;
//    }


    protected List<Operation> operationList = new ArrayList<Operation>()  ;
    static int nbComptes;
    public Compte(){
        StatueDeCompte statue = StatueDeCompte.CREATED;

        this.solde = 0;
        this.code = ++nbComptes;
        nameFichier = "Client"+code+".ser";
    }
    public  Compte(double solde){
        StatueDeCompte statue = StatueDeCompte.CREATED;
        this.solde = solde;
        this.code = ++nbComptes;
        nameFichier = "Client"+code+".ser";
        try {
            historiqueFichier(nameFichier);
        }
        catch (Exception e){
            e.getMessage();
        }


    }
    double totVerser = 0;

    public double getSolde() {
        return solde;
    }


    public int getCode() {
        return code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }


    public void verser(double mt) throws Exception{
        if (mt <= 0) throw new Montantnegativeexeption("montant negative");{
            if (mt <= 10) throw new Montaestpascomplit("montant a complit ");
                    solde += mt;
                 totVerser += mt;
                 ++cO;
                 operationList.add(new Versment(cO,new Date(),mt));

    }
    }
    double totRetier = 0;
    public void retirer(double mt) throws Exception{
        if (mt >= solde) throw new Soldeinsiffusantexeption("sold insiffusant");{
            if (mt <= 0) throw new Montantnegativeexeption("montant negative");{
                 if (mt <=100) throw new Montaestpascomplit("montant a complit ");
                      solde -= mt;
                     ++cO;
                     operationList.add(new Rertrai(operationList.size(),new Date(),mt));
                     totRetier +=mt;


            }

        }
    }
    public int getSize(){
        return operationList.size()+1;
    }
    public void updatSolde(double newSolde){
        this.setSolde(newSolde);
    }

    public  void versment(double mt,Compte cm){
        try {
            this.retirer(mt);
            cm.verser(mt);
            totVerser += mt;
        }
        catch (Exception e){
            e.getMessage();
        }


    }

    public double totalRetrait(){
        return totRetier;
    }

    public double  totalVersment(){
        return totVerser;
    }



    public void getOperationLIst() {
        for (Operation e : operationList) {
            System.out.println(e.toString());
        }

    }

    @Override
    public String toString() {
        return "le code est "+code+" et le solde est "+solde+" "+nameFichier;
    }

    public void historiqueFichier(String fichierName) throws IOException, ClassNotFoundException {
        if (!this.operationList.isEmpty()){
        try{
            FileOutputStream writeData = new FileOutputStream(fichierName);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(this.operationList);
            writeStream.flush();
            writeStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }}


    }}