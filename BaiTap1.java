//Find the Largest and Smallest Elements in an Array
package bailecture7;

import java.util.Scanner;
public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang:");
        int number= scanner.nextInt();
        int[] array=new int[number];
        for (int i=0;i<number;i++){
            System.out.print("number"+" "+(i+1)+":");
            array[i]=scanner.nextInt();
            
            
        }
        int largest=array[0];
        int smallest=array[0];
        for(int i=0;i<number;i++){
            if(array[i]>largest){
                largest=array[i];
            } else if (array[i]<smallest){
                smallest=array[i];
            }
            
        } System.out.println("So lon nhat la:"+largest);
            System.out.print("SO nho nhat la:"+smallest);
        
    }
    
}
