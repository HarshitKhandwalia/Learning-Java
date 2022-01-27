package Shapes;

public class Triangle {
    public static void main(String[] args) {
        int n =4 ;
        for(int i =0;i<=4;i++){
            for(int j =0;j<n-i;j++){//This will print a inverted triangle of spaces something like this :-0000
                                                                                                       // 000
                System.out.print(" ");                                                                 // 00
            }                                                                                          // 0
            for(int a =0;a<=2*i;a++){//This will print a Triangle next to the inverted triangle
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}


