package myPackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;

public class Read {

    public static void saveInMap(String path, HashMap<String, Integer> map) throws IOException {

        BufferedReader reader = null;

        // OUVERTURE DU FICHIER
        try{
            reader = new BufferedReader(new FileReader(path));
        }catch (FileNotFoundException f){
            System.out.println("Erreur d'ouverture");
        }


        String line;
        while((line = reader.readLine() )!= null){
            if(line.contains(":")){
                int index = line.indexOf(":");
                String left = line.substring(0,index);
                String right = line.substring(index+1);
                Integer score = Integer.parseInt(right);
                map.put(left,score);
            }

        }

        reader.close();

    }



    public static void mapToList(HashMap<String, Integer> map, ArrayList<Integer> list){
        for (String i : map.keySet()) {
            //System.out.println(map.get(i));
            list.add(map.get(i));
        }

    }


    public static int avarage (ArrayList<Integer> list){
        int avarage = 0;
        for(int value : list){
            avarage += value;
        }
        avarage = avarage / list.size();
        return avarage;
    }


    public static int getPoint(HashMap<String, Integer> map, String mail){
        return map.get(mail);
    }







    public static void main(String[] args) throws IOException {

        Instant start = Instant.now();

        String path = "src\\myPackage\\truc.xtx";

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        ArrayList<Integer> list = new ArrayList<>();

        saveInMap(path, map);

        mapToList(map,list);

        int a = avarage(list);
        System.out.println(a);


        System.out.println(getPoint(map,"toto@gmail.com"));

        Duration duration = Duration.between(start, Instant.now()) ;

        //in milliseconds
        System.out.println(duration.getNano()/1000000);


        /* T  E  S  T
        System.out.println(map.size());
        System.out.println(map.get("toto@gmail.com"));
        System.out.println(list.size());
        */



    }




}
