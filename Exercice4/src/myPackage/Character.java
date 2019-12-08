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

public class Character {

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

            default:
                System.out.println("Alphabet inexistant");
                break;


        }
    }



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



    public static void main(String[] args){
        System.out.println(args[0]);
        System.out.println(args[1]);
        check(args[0],args[1]);


        System.out.println(leftRotate(3,"abcdef"));
        System.out.println(rightRotate(2,"abcdef"));

    }

}
