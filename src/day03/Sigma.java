package day03;

public class Sigma {
    public static void main(String[] args) {
        int i,j;
        int sum = 2;
        for(i=3;i<=100;i++){
            for(j=2;j<=i-1;j++){
                if(i%j==0){
                    break;
                }
                if(j==i-1){
                   sum=sum + i;
                }
            }

        }

        System.out.println("一百以内质数之和为"+sum);
    }
}
