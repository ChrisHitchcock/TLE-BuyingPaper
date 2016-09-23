/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 * QUESTION DESCRIPTION: https://dmoj.ca/problem/tle16c1p1
 */
package buyingpaper;

import java.util.*;

public class BuyingPaper {

    public static void main(String[] args) {
        //Variable/object declaration
        int howManyNums = 0, howManyNums2 = 0;
        double total1 = 0, total2 = 0, max=0, min=10001;
        boolean k, k2;
        k = false;
        k2 = false;
        Scanner kb = new Scanner(System.in);

        //Obtain the amount of numbers of dime weights and make sure it is >1 <100
        while (k == false) {
            howManyNums = kb.nextInt();

            if (howManyNums >= 1000 || howManyNums < 0) {
                System.out.println("Please enter a number from 1-1000");
                k = false;
            } else {
                k = true;
            }
        }
        double nums[] = new double[howManyNums];

        //Add each number inputted, not only to the array but also to the total
        for (int i = 0; i < howManyNums; i++) {
            nums[i] = kb.nextInt();
            total1 = total1 + nums[i];
            if (nums[i]>max)
            {
                max=nums[i];
            }
        }
        //Obtain the amount of numbers of quarter weights
        while (k2 == false) {
            howManyNums2 = kb.nextInt();

            if (howManyNums2 >= 1000 || howManyNums2 < 0) {
                System.out.println("Please enter a number from 1-1000");
                k2 = false;
            } else {
                k2 = true;
            }
        }

        double nums2[] = new double[howManyNums];

        //Add each number inputted, not only to the array but also to the total
        for (int i = 0; i < howManyNums2; i++) {
            nums2[i] = kb.nextInt();
            total2 = total2 + nums2[i];
            if (nums2[i]<min)
            {
                min=nums2[i];
            }
        }

        //Find out which was optimal and output the result
        if ((max * 2.5) > min) {
            System.out.println("Quarters are better");
        } else if ((max * 2.5) < min) {
            System.out.println("Dimes are better");
        } else {
            System.out.println("Neither coin is better");
        }
    }

}
