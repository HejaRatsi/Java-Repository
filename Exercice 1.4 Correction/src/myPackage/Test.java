package myPackage;

public class Test {
    static void f(int [] array, int nb) {
        array = new int[nb];
        //test if this fonction change the other array in main
        array[1] = 12;
        for(int value: array)
            System.out.println(++value + " ");
    }



    public static void main(String[] args) {
        int size = 3;
        int [] array = new int [size];
        f(array, size);
        for (int value : array)
            System.out.println(value + " ");

    }

}

// A N O T H E R   S O L U T I O N
/*
    public static void main(String[] args) {
        int size = 3;
        int [] array = null;
        f(array, size);
        //System.out.println("problem");

        try {
            for (int value : array)
                System.out.println(value + " ");
        } catch (NullPointerException n){
            System.out.println("Attention, vous affichez un tableau null");
        }


    }

}

*/
