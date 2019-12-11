package myPackage;

//C:\Users\hejar\Desktop\3emeIABD\Java\Exercice Java Introduction\Exercice4\src\myPackage>javac Character.java
//C:\Users\hejar\Desktop\3emeIABD\Java\Exercice Java Introduction\Exercice4\src>java myPackage.Character


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Character {



    public static String leftRotate(int number, String chain){
        String newString = chain;
        StringBuffer buffer =  new StringBuffer(newString);
        for(int i = 0; i<chain.length();i++){
            buffer.setCharAt(Math.floorMod(i-number,chain.length()),chain.charAt(i));
        }

        return buffer.toString();
    }






    public static String rightRotate(int number, String chain){
        String newString = chain;
        StringBuffer buffer =  new StringBuffer(newString);
        for(int i = 0; i<chain.length();i++){
            buffer.setCharAt(Math.floorMod(i+number,chain.length()),chain.charAt(i));
        }

        return buffer.toString();
    }







    public static Boolean isAnagramme(String chain1, String chain2){
        char[] tab1 = chain1.toCharArray();
        char[] tab2 = chain2.toCharArray();
        Arrays.sort(tab1);
        Arrays.sort(tab2);
        return Arrays.equals(tab1,tab2);

    }






    public static String removeChar(String chain,String chaineToremove) {
        String ret = chain;
        for (int i = 0; i < chaineToremove.length(); i++) {
            ret = ret.replace(String.valueOf(chaineToremove.charAt(i)),"");

        }
        return ret;
    }




    public static void checkManyPAram(String[] tab){
        if(dealWithAlphabet(tab[0],tab[1])) {
            System.out.println("Le mot appartient à l'alphabet :)");
            switch (tab[2]) {

                case "leftRotation":
                    System.out.println("How many case for rotation ?");
                    Scanner scanner1 = new Scanner(System.in);
                    int number1 = scanner1.nextInt();
                    System.out.println(leftRotate(number1,tab[1]));

                    break;

                case "rightRotation":
                    System.out.println("How many case for rotation ?");
                    Scanner scanner2 = new Scanner(System.in);
                    int number2 = scanner2.nextInt();

                    System.out.println(rightRotate(number2,tab[1]));

                    break;



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

                case "/o":

                    System.out.println(removeChar(tab[1],tab[3]));
                  break;

                default:
                    System.out.println("Commande inxeistant");
                    break;


            }

        }else{
            System.out.println("La chaine n'est pas dans l'alphabet :(");
            return;
        }
    }





    public static boolean dealWithAlphabet(String alphabet, String chaine){
        StringBuffer sb = new StringBuffer("");//sb.append()
        for(int i = 0;i <alphabet.length();i++){
            if('a' <= alphabet.charAt(i) && alphabet.charAt(i) <= 'z'){
                sb.append(alphabet.charAt(i));
                sb.append(java.lang.Character.toUpperCase(alphabet.charAt(i)));

            } else if ('A' <= alphabet.charAt(i) && alphabet.charAt(i) <= 'Z'){
                sb.append(alphabet.charAt(i));
                sb.append(java.lang.Character.toLowerCase(alphabet.charAt(i)));

            }else{
                sb.append(alphabet.charAt(i));

            }

        }
        String newAlphabet = sb.toString();


        //compare
        for(int i = 0;i<chaine.length();i++){
            String s = String.valueOf(chaine.charAt(i));
            if(!newAlphabet.contains(s)){
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args){
        if(args.length > 1) {
            checkManyPAram(args);
        }else{
            System.out.println("No argument");
        }

    }

}
