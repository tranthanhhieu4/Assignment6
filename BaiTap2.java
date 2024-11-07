/// Calculate the Sum and Average of Array Elements
package bailecture7;
import java.util.Scanner;
public class BaiTap2 {
    public static void main(String[] args) {
        
    
    Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang:");
        int number= scanner.nextInt();
        int[] array=new int[number];
        for (int i=0;i<number;i++){
            System.out.print("number"+" "+(i+1)+":");
            array[i]=scanner.nextInt();
            
            
        }
        int sum=0;
        for (int num:array){
    sum+=num;
   
} double average=(double) sum/number;
System.out.println("Sum:"+sum);
System.out.println("Average:"+average);
        
    
    
   
    
    
    
    
    }  
}
