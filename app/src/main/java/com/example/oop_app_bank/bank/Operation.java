package com.example.oop_app_bank.bank;

import android.graphics.Path;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public  class  Operation extends Compte{
    protected List<Operation> operationList = new ArrayList<Operation>()  ;

    private  Integer numero;
    private Date dateOperation = new Date();

    private double mt ;


    public Operation(Integer n, Date t,double mt){
        this.numero = n;
        this.dateOperation = t;
        this.mt = mt;
    }
    public Operation(){
        this.numero = 0;
        this.dateOperation = new Date();
        this.mt = 0 ;
    }

//    public void addVersment(Integer n, Date t,double mt){
//        operationList.add(new Versment(n,t,mt));
//    }

    public void  getOperationLIst() {
        for (Operation e : operationList) {
            System.out.println(e.toString());
        }

    }
    public  String toString(){

        return ("le code est :"+numero+"et le montant est :"+mt+" et la date est "+dateOperation);
    }


}


