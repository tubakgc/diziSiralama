import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Dizinin indis numarasını giriniz: ");
        int indexArray=inp.nextInt();
        int[] numbers = new int[indexArray];
        System.out.println("dizinin elemanlarını giriniz:");
        for (int i =0; i< numbers.length; i++){
            System.out.print((i+1)+" . elemanı gir: ");
            numbers[i]=inp.nextInt();
        }
        System.out.println("Dizi: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("sıralı : " + Arrays.toString(numbers));


    }
}