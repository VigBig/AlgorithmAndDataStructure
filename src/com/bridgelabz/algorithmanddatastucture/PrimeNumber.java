package com.bridgelabz.algorithmanddatastucture;

public class PrimeNumber {

    public void printPrime(){
        int i,count;

        for(int j=2;j<=1000;j++)
        {
            count=0;
            for(i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2) {
                System.out.print(j + " ");

            }
        }
    }


    public static void main(String[] args) {

        PrimeNumber pn = new PrimeNumber();

        System.out.println("Prime numbers from 1 to 1000 are :");
        pn.printPrime();
    }

}
