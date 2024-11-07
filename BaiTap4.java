//Sort the Array in Ascending Order
package bailecture7;
import java.util.Arrays;
import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang:");
        int number=scanner.nextInt();
        int array[]=new int[number];
        for(int i=0;i<number;i++){
            System.out.print("number"+" "+(i+1)+":");
            array[i]=scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("So thu tu tang dan:");
        for(int num:array){
            System.out.print(num+" ");}
        
    }
    
}
