/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;

/**
 *
 * @author asocc
 */
public class Coda {
    private ArrayList<String> codaClienti = new ArrayList<>();
    public void aggiungiCliente(String cliente){
        codaClienti.add(cliente);
    }
    public void stampacoda(){
        for (int i = 0; i < codaClienti.size(); i++) {
            System.out.println(codaClienti.get(i));
        }
    }
 }