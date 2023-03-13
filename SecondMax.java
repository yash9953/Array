package ArrayHomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondMax {
          // max second max print
          static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
          {
               //code here.
               ArrayList<Integer> list=new ArrayList<>();
               int n=sizeOfArray;
               if(n==0){
                    list.add(-1);list.add(-1);
                    return list;
               }
               if(n==1){
                    list.add(arr[0]);list.add(-1);
                    return list;
               }
               int smax=arr[0],max=arr[1];
               if(smax>max){
                    int temp=max;
                    max=smax;
                    smax=temp;
               }
               for(int i=2;i<n;i++){
                    if(arr[i]>max){
                         smax=max;
                         max=arr[i];
                    }
                    if(arr[i]>smax&&arr[i]<max){
                         smax=arr[i];
                    }
               }
               if(smax==max){
                    list.add(max);list.add(-1);
                    return list;
               }
               list.add(max);list.add(smax);
               return list;
          }
          static void smax(int a[]){
                    int n=a.length;
                    if(n==0){
                              System.out.println("Max "+-1+" Smax "+-1);
                              return;
                    }
                    if(n==1){
                              System.out.println("Max "+a[0]+" Smax "+-1);
                              return;
                    }
                    int smax=a[0];
                    int max=a[1];
                    if(smax>max){
                              int temp=max;
                              max=smax;
                              smax=temp;
                    }
                    for(int i=2;i<n;i++){
                              if(a[i]>max){
                                        smax=max;
                                        max=a[i];
                              }
                    }
                    if(smax==max){
                              if(a[n-1]!=max){
                                        smax=a[n-1];
                              }
                              System.out.println("Max "+max+" Smax "+smax);
                              return;
                    }
                    System.out.println("Max "+max+" Smax "+smax);
                              return;
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    // int arr[]={1,2,3,4,5};
                    // int arr[]={10,10,10,10,10};
                    int arr[]={10,10,5};
                    // int arr[]={10}; 
                    smax(arr);
                    

                    sc.close();
          }
}
