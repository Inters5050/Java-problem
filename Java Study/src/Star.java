import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        int c=0;
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        if(max >= 3){
            for(int i=0; i<max; i++){
                for(int j=0; j<max; j++){
                    if((i+1)%3 == 2 && (j+1)%3 == 2){
                        System.out.print(" ");
                        continue;
                    }
                    for(int a=1; a<max; a *= 3){
                        if((i-3*a+1)%(a*9) >= 1 && (i-3*a+1)%(a*9) <= a*3 && (j-3*a+1)%(a*9) >= 1 && (j-3*a+1)%(a*9) <= a*3){
                            System.out.print(" ");
                            c = 1;
                            break;
                        }
                    }
                    if(c==0){
                        System.out.print("*");
                    }
                    c = 0;
                }
                System.out.print("\n");
            }
        }
    }
}
