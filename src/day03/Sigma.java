package day03;

public class Sigma {
    public static void main(String[] args) {
        int i,j;
        int sum = 2;
        for(i=2;i<=100;i++){
            j=2;
            while(i%j!=0) {
                j++;
                if (j == i) {
                    sum = sum + i;
                }
            }
        }

        System.out.println("一百以内质数之和为"+sum);
    }
}
