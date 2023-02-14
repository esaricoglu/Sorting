package Arrays;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = inp.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            int number = inp.nextInt();
            list[i] = number;
        }
        for(int i = 0; i < list.length;i++){
            for(int j = (i+1); j < list.length; j++){
                int tempN = list[i];
                if(list[i] > list[j]){
                    list[i] = list[j];
                    list[j] = tempN;
                }
            }
        }
        System.out.print("Sıralama : ");
        for(int x : list){
            System.out.print(x + " ");
        }
    }
}
