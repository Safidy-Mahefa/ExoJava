/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp;

/**
 *
 * @author Safidy Mahefa
 */
import java.util.Arrays; //module pour manipuler les arrays
public class CribleDEratosthene {
    //fonction principale
    public static void main(String[] args){
        int n = 200; //Trouver les nombres premiers jusq'a 100
        boolean[] premiers = cribleDEratosthene(n);
        
        System.out.printf("Voici la liste des nombres premiers dans l'intervalle de : %d \n",n);
        for(int i =2; i<=n; i++){
            if(premiers[i]){
                System.out.print(i + " "); //afficher si le nombre est premier...
            }
        }
        System.out.printf("\n");
    }
    
    //fonction cribleDEratosthene
    public static boolean[] cribleDEratosthene(int n){
        boolean[] premiers = new boolean[n+1];
        Arrays.fill(premiers, true); //initialiser à true
        premiers[0] = false;
        premiers[1] = false;
        
        //algo principale pour trouver les nombres premiers...
        for(int p = 2; p * p <= n; p++){
            if(premiers[p]){
                for(int i = p * p; i<= n; i+=p){
                    premiers[i] = false;
                }
            }
        }
        return premiers; //retourner le tableau final
    }
}

/* 
    1- Ce code cherche tous les nombres premiers dans un intervalle donné (n) à partir de l'algorithme Crible d'Eratosthene...
    4- Oui ce code est assez rapide car on ne vérifie pas un par un les nombres dans l'intervalle... 
*/
