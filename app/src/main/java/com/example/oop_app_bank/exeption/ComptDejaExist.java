package com.example.oop_app_bank.exeption;

public class ComptDejaExist extends Exception{
    public ComptDejaExist(String ms){
        super(ms);
    }
}
