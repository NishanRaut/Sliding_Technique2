import java.util.*;

public class Time{
    
    public static void main(String args[]){
        
        Scanner input=new Scanner(System.in);
        int arr[]={100,200,300,400,150,260,900}; //Try With your own array or take an input yourself.
        int number,k,csum=0,sum=0,max=0;
        System.out.println("Enter Consecutive Elements in array: ");
        number=input.nextInt();
        k=number-1;
        int cons=k; 
        int length=arr.length-number;
        for(int i=0;i<arr.length;){
            if(i>arr.length){
                break;
            }
            if(i<=k){
                sum=sum+arr[i];
                csum=sum;
                i++;
            }
            if(i>k){
                i=(i-cons);
                k=k+1;
                sum=0; 
                }
            if(csum>max){
                max=csum;
            }
        }
        System.out.println("Maximum: " +max);
    }
}