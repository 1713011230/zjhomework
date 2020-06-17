package day03;

public class IsoscelesTriangle {
    public static void main(String[] args) {
       int i,j,k;
       for(i=1;i<6;i++){
           for(k=0;k<=6-i;k++){
               System.out.print(" ");
           }
           for(j=1;j<=2*i-1;j++){
               System.out.print("*");
           }
           System.out.println();
       }


    }
}
