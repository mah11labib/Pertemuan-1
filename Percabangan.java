
package Pertemuan1;

import java.util.Scanner;

/**
 *
 * @author pc20
 */
public class Percabangan {
    public static void main(String[] args) {
       Scanner masuk = new Scanner (System.in);
       int nilai;

        System.out.println("Nilai = ");
        nilai = masuk.nextInt();

        if(nilai>=85)
            System.out.println("Predikat A");
        else if(nilai>=75)
            System.out.println("Predikat B");
        else if(nilai>=65)
            System.out.println("Predikat C");
        else if(nilai>=45)
            System.out.println("Predikat D");
        else
            System.out.println("Predikat E");
}  
}

