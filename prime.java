//Name: Fiona Tong
//Date: 10/23/18
//Period: 6

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type in an integer: ");
        int num = scan.nextInt();//takes an inputted integer
        
        
        int i,m=0,flag=0; //declares int     
        m=num/2;//divides num in half so if all the numbers up to m doesnt work the other half wont have any factors too      
                //ex: if num = 24 -> factors are 1,2,3,4,6,8,12,24 so if 24/2 is 12 all numbers up to 12 should be a factor from a pair that equals the num
       
        if(num==0||num==1){  
            System.out.println(num+" is not prime number");//states that 0 and 1 are not prime      
        }else{  
            for(i=2;i<=m;i++){ //begins with 2 because all #s are divisible by 1
                               //cont adds one until it reaches halfway 
            
                if(num%i==0){  //states that as long as it is  divisble by another number (remainer is zero) it is not prime     
                    System.out.println(num+" is not prime number");      
                    flag=1; //once it realizes it isnt prime, the flag becomes one      
                    break;      
                }      
            }      
        
            if(flag==0){ //if flag is still zero, num is still not proven to be not prime therefore it is prime
                System.out.println(num+" is prime number"); 
            }  
        }  
    }
}
