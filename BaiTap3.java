//Count the Occurrences of an Element in the Array
package bailecture7;

import java.util.Scanner;
public class BaiTap3 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhap so phan tu mang:");
                int number= scanner.nextInt();
                int []array=new int[number];
                for(int i=0;i<number;i++){
                    System.out.print("number"+" "+(i+1)+":");
                    array[i]=scanner.nextInt();
        
    }
        System.out.print("Nhap so can dem:");
        int target= scanner.nextInt();
        int count=0;
        for(int num:array){
            if (num==target){
                count++;
            }
        }
        System.out.println("So lan xuat hien"+" "+target+" "+"trong mang la:"+count);
        

    }
    
}
