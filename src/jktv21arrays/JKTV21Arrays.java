/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JKTV21Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("--- Одномерные массивы ---");
        int n =10;
        int [] nums = new int[10];
        for(int i = 0;i<nums.length;i++) {
            nums[i] = random.nextInt(10);
       
        }
        //Arrays.sort(nums);
        int sum = 0;
        int min = n;
        int max = 0;
        int sumDown = 0;
        int sumUp = 0;
        for(int i = 0;i<nums.length;i++) {
            System.out.printf("%2d,",nums[i]);
            sum += nums[i];
            if(min > nums[i])min = nums[i];
            if(max < nums[i])max = nums[i];
        }
        
        System.out.println();
        System.out.println("sum = "+sum);
        System.out.println("sum min = "+min);
        System.out.println("sum max = "+max);
        
        System.out.println("--- Двухмерныймассивы ---");
        sum = 0;
        max = 0;
        min = n;
        int [] [] nums2 = new int [n] [n];
        for(int i  = 0; i < nums2.length;i++){
            
            for(int j = 0; j < nums2[i].length; j++){
                nums2[i][j] = random.nextInt(n);
                
            }
        }
        int[] colsSum = new int[n];
        for(int i  = 0; i < nums2.length;i++){
            int lineSum = 0;
            for(int j = 0; j < nums2[i].length; j++){
                System.out.printf("%4d",nums2[i][j]);
                sum += nums2 [i][j];
                lineSum += nums2 [i][j];
                if(min > nums2[i][j])min = nums2[i][j];
                if(max < nums2[i][j])max = nums2[i][j];
                colsSum[j] += nums2[i][j];
                if(i == j)sumDown += nums2 [i][j];
                if(i == n-j)sumUp += nums2 [i][j];
            }
            System.out.println(" | "+lineSum );
        }
        System.out.println("------------------");
        for(int i = 0; i < colsSum.length; i++){
            System.out.printf("%4d",colsSum[i][j]);
        }
        
        
        System.out.println("sum = "+sum);
        System.out.println("sum min = "+min);
        System.out.println("sum max = "+max);
        System.out.println("sum Down = ");
        System.out.println("sum Up = ");
        
     
    }
        
        
        
    }
    

