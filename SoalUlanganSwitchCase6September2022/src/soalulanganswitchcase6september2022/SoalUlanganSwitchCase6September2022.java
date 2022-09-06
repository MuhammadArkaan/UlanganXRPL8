/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalulanganswitchcase6september2022;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class SoalUlanganSwitchCase6September2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Inputkan bagian koordinator untuk nama koordinatornya");
        
        String jawab1 = input.next();
        
        switch(jawab1){
            case ("ketertiban") : System.out.println("beni");
            break;
            case ("keamanan") : System.out.println("faril");
            break;
            case ("kekeluargaan") : System.out.println("resya");
            break;
            case ("keindahan") : System.out.println("kania");
            break;
            case ("kebersihan") : System.out.println("queen");
            break;
            case ("kerindangan") : System.out.println("ale");
            break;
            case ("kesehatan") : System.out.println("hana");
            break;
            case ("keterbukaan") : System.out.println("yusuf");
            break;
            case ("keteladanan") : System.out.println("esan");
            break;
            case ("keimanan") : System.out.println("daffa");
            
            default : System.out.println("Input salah");
            }
        }
    }
    
