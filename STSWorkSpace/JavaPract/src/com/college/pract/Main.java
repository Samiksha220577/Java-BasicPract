package com.college.pract;

import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {


        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        String x = p.toUpperCase();
        for (int i = 0; i < x.length(); i++) {
            char y = x.charAt(i);
            int z = (int) y;
            if (y == '0' || y == '1' || y == '2' || y == '3' || y == '4' || y == '5' || y == '6' || y == '7' || y == '8' || y == '9') {
                System.out.println("not valid");
                break;
            }
            else if (y=='A'){
                System.out.print("X");
            }
            else if (y=='B'){
                System.out.print("Y");
            }
           else if (y=='C'){
                System.out.print("Z");
            }
            else if (y=='X'){
                System.out.print("A");
            }
            else if (y=='Y'){
                System.out.print("B");
            }
            else if (y=='Z'){
                System.out.print("C");
            }
        else{

            //System.out.println(z);
            int k = z -3;
            char s = (char) k;
            System.out.print(s);
           }
        }



        }

    }
