/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author nazifabegum
 */
import java.util.*;

class AddWords
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        WordGen.initialise(input);
        System.out.print("Enter the number of words you wish to generate initially: ");
        int n = input.nextInt();
        WordStore words = new WordStoreImp(n);
        for(int i=0; i<n; i++)
            words.add(WordGen.make());
        System.out.print("Enter number of words you wish to add: ");
        n = input.nextInt();
        String[] testWords = new String[n];
        for(int i=0; i<n; i++)
            testWords[i]=WordGen.make();
        long time1,time2;
        int count;
        time1 = new Date().getTime();
        for(int i=0; i<n; i++)
            words.add(testWords[i]);
        time2 = new Date().getTime();
        System.out.print("Time taken to add "+n+" more words ");
        System.out.println("is "+(time2-time1)+"ms");
    }
}
