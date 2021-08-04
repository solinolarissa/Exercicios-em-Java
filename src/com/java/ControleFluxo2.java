package com.java;

public class ControleFluxo2 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        // idade >= 15 && idade < 18 juvenil
        // idade >= 18 adulto

        int idade = 19;
        String status;

        status = idade < 15 ? "Infantil" : idade >=15 && idade < 18 ? "juvenil" : "adulto";
        System.out.println(status);
    }
}
