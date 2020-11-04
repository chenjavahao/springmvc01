package com.kgc;

public class Dome01 {
    public static void main(String[] args) {
      int[] num=new int[20];
      num[0]=0;
      num[1]=1;
      for (int i=2;i<20;i++){
          num[i]=num[i-1]+num[i-2];
      }
      for (int j=1;j<=20;j++){
          if (j%5==0){
              System.out.println();
          }
          System.out.println(num[j-1]+"");
      }
        /*final int N=10;
        int[] num=new int[N];
        num[0]=1;
        for (int i=1;i!=N;i++){
            for (int j=0;j!=i;j++){
                System.out.print(num[j]+"\t");
            }
            System.out.println();
            num[i]=1;
            for (int j=i-1;j!=0;j--){
                num[j]=num[j]+num[j-1];
            }
        }*/
    }
}
