import java.util.*;
class Duplichar
{  
    public static void main(String[] args) 
    {  
       Scanner sc=new Scanner (System.in);
       String str=sc.next();
       String str1=str.toLowerCase();
       char ch[] = str1.toCharArray();  
       System.out.println("Duplicate characters in a given string: ");   
       for(int i = 0; i <ch.length; i++) 
       {  
           int count = 1;  
           for(int j = i+1; j <ch.length; j++) 
           {  
               if(ch[i] == ch[j] && ch[i] != '0') 
               {  
                   count++;   
                   ch[j] = '0';  
               }  
           }   
           if(count > 1 && ch[i] != '0')  
               System.out.println(ch[i]);  
       }  
   }  
}  