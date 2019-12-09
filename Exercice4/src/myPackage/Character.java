package myPackage;

//C:\Users\hejar\Desktop\3emeIABD\Java\Exercice Java Introduction\Exercice4\src\myPackage>javac Character.java
//C:\Users\hejar\Desktop\3emeIABD\Java\Exercice Java Introduction\Exercice4\src>java myPackage.Character

/*
Les alphabets considére :
    français
    morse
    couleurs
    ADN
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Character {



    public static String leftRotate(int number, String chaine){
        //chercher l'opération qui lie l'orginal à la transfo
        String newString = chaine;
        StringBuffer buffer =  new StringBuffer(newString);
        for(int i = 0; i<chaine.length();i++){
            buffer.setCharAt(Math.floorMod(i-number,chaine.length()),chaine.charAt(i));
        }

        return buffer.toString();
    }






    public static String rightRotate(int number, String chaine){
        //chercher l'opération qui lie l'orginal à la transfo
        String newString = chaine;
        StringBuffer buffer =  new StringBuffer(newString);
        for(int i = 0; i<chaine.length();i++){
            buffer.setCharAt(Math.floorMod(i+number,chaine.length()),chaine.charAt(i));
        }

        return buffer.toString();
    }







    public static Boolean isAnagramme(String chaine1, String chaine2){
        int count = 0;
        if(chaine1.length() == chaine2.length()){

            for(int i = 0; i<chaine1.length();i++){
                if(chaine1.charAt(i) == chaine2.charAt(chaine2.length()-(i+1))){
                    count++;
                }
            }
            if(count == chaine1.length()){
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }
    }






    //----------------N  E  E  D   C  O  R  R  E  C  T  I  O  N---------------------//
    public static String removeDoubleChar(String chaine){
        for(int i = 0;i<chaine.length()-1;i++){
            while(chaine.charAt(i) == chaine.charAt(i+1)){
                i++;
            }
            return chaine.substring(i++);
        }
    return chaine;
    }





    public static void check (String alphabet, String symbol) {
        String firstAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String secondAlphabet = ".-";
        String thirdAlphabet = "0123456789ABCDEF";
        String fourthAlphabet = "ACGT";

        switch (alphabet) {

            case "francais":
                int flenght = 0;
                for (int i = 0; i < symbol.length(); i++) {
                    for (int j = 0; j < firstAlphabet.length(); j++) {
                        if (symbol.charAt(i) == firstAlphabet.charAt(j)) {
                            flenght++;
                            //break;
                        }
                    }
                }

                if (flenght == symbol.length()) {
                    System.out.println("La chaîne du français est bien formée");
                } else {
                    System.out.println("La chaîne du français  est mal formée");
                }
                break;


            case "morse":
                int slenght = 0;
                for (int i = 0; i < symbol.length(); i++) {
                    for (int j = 0; j < secondAlphabet.length(); j++) {
                        if (symbol.charAt(i) == secondAlphabet.charAt(j)) {
                            slenght++;
                            //break;
                        }
                    }
                }

                if (slenght == symbol.length()) {
                    System.out.println("La chaîne des morses est bien formée");
                } else {
                    System.out.println("La chaîne des morses est mal formée");

                }
                break;


            case "couleurs":

                int tlenght = 0;
                for (int i = 0; i < symbol.length(); i++) {
                    for (int j = 0; j < secondAlphabet.length(); j++) {
                        if (symbol.charAt(i) == secondAlphabet.charAt(j)) {
                            tlenght++;
                            //break;
                        }
                    }
                }

                if (tlenght == symbol.length()) {
                    System.out.println("La chaîne des couleurs est bien formée");
                } else {
                    System.out.println("La chaîne des couleurs est mal formée");

                }
                break;


            case "ADN":
                int folenght = 0;
                for (int i = 0; i < symbol.length(); i++) {
                    for (int j = 0; j < secondAlphabet.length(); j++) {
                        if (symbol.charAt(i) == secondAlphabet.charAt(j)) {
                            folenght++;
                            //break;
                        }
                    }
                }

                if (folenght == symbol.length()) {
                    System.out.println("La chaîne des ADNs est bien formée");
                } else {
                    System.out.println("La chaîne des ADNs est mal formée");

                }

                break;


            case "leftRotation":
                System.out.println("How many case for rotation ?");
                Scanner scanner1 = new Scanner(System.in);
                int number1 = scanner1.nextInt();
                System.out.println(leftRotate(number1,symbol));

                break;

            case "rightRotation":
                System.out.println("How many case for rotation ?");
                Scanner scanner2 = new Scanner(System.in);
                int number2 = scanner2.nextInt();

                System.out.println(rightRotate(number2,symbol));

                break;

            case "/o":
                System.out.println(removeDoubleChar(symbol));
                break;

            default:
                System.out.println("Alphabet inexistant ou commande inxeistant");
                break;


        }
    }




    public static void checkManyPAram(String[] tab){
        switch (tab[0]) {
            case "/a":
                    //tab[1] est le mot a comparer avec les autres
                    ArrayList<String> list = new ArrayList<>();
                    for (int i = 2; i < tab.length; i++) {
                        if (isAnagramme(tab[1], tab[i])) {
                            list.add(tab[i]);
                        }
                    }

                    System.out.println("Les anagrammes du mot sont : ");
                    for (String value : list) {
                        System.out.println(value);
                    }
             break;





            default:
                System.out.println("Commande inxeistant");
             break;


        }
    }



    

    public static void main(String[] args){

        if(args.length <= 2) {
            check(args[0], args[1]);
        }else{
            checkManyPAram(args);//just for anagramme
        }

        //System.out.println(removeDoubleChar("dlkkjppppppzer"));


    }

}
