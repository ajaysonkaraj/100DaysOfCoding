/*  
Problem Statement:
Legendre’s formula (Given p and n, find the largest x such that p^x divides n!)

Given an integer n and a prime number p, find the largest x such that px (p raised to power x) divides n! (factorial) 

Examples: 
Input:  n = 10, p = 3
Output: x = 4
34 divides 10! and 4 is the largest such power of 3.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a +ve number : ");
        int n = sc.nextInt();
        System.out.println("Enter a prime number");
        int p = sc.nextInt();
        int c = 0;
        while (n > 0) {
            n = n / p;
            c = c + n;
        }
        System.out.println("Output : "+c);
    }
}
