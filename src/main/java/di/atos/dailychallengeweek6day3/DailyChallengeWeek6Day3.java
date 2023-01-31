/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package di.atos.dailychallengeweek6day3;

import java.util.Scanner;

/**
 *
 * @author ezekielkouassi
 */
public class DailyChallengeWeek6Day3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer un nombre : ");
        int userEntry = sc.nextInt();
        
        System.out.println("======= multiplication table =======");
        
        for(int i = 0; i <= 10; i++) {
            System.out.println(userEntry + "x" + i + "=" + userEntry*i);
        }
        
        System.out.println("====== factorial number =======");
        
        int factorial = userEntry;
        int i = 1;
        while(i<userEntry) {
            if(userEntry == 0 || userEntry == 1) {
                factorial = 1;
                break;
            }
            factorial = factorial * (userEntry - i);
            i++;
        }
        
        System.out.println(userEntry +"! = " + factorial);
        
        System.out.println("====== fibonacci =======");
        
        i = 1;
        int fib = 0;
        do{
            System.out.println(fib);
            fib += i;
            i++;
        }while(i<userEntry);
        
    }
}
