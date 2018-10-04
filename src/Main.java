import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        int choose;
        boolean bool = true;
        Scanner scanner = new Scanner(System.in);
       do {
           menu();
           choose = scanner.nextInt();
           switch (choose){
               case 1:
                   System.out.println("Enter width ");
                   int width = scanner.nextInt();
                   System.out.println("Enter height ");
                   int height = scanner.nextInt();
                   printRectangle(width,height);
                   break;
               case 2:
                   System.out.println("Enter size ");
                   int size = scanner.nextInt();
                   printSquareTriangle(size);
                   break;
               case 3:

                   break;
               case 4:
                   bool = false;
                   break;
           }
       }while(bool);

    }
    public static void menu(){
        System.out.println("1 ->> Print the rectangle");
        System.out.println("2 ->> Print the square triangle");
        System.out.println("3 ->> Print isosceles triangle");
        System.out.println("4 ->> exit");
        System.out.print("Enter your choose: ");
    }
    public static void printRectangle(int w, int h){
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w ; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void printSquareTriangle(int size){
       for(int i = 0; i< size; i++){
           for(int j = 0; j <= i; j++){
               System.out.print("* ");
           }
           System.out.print("\n");
       }
       System.out.print("\n");

        for(int i = 0; i< size; i++){
            for(int j = size; j > i; j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i = 0; i< size; i++){
            for(int k = size-1; k > i; k--){
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i = 0; i< size; i++){
            for(int k = 0; k<i; k++){
                System.out.print("  ");
            }
            for(int j = size; j > i; j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

    }

    public static void printTriangle(int size){
        for(int i = 0; i< size; i++){
            for(int k = size-1; k > i; k--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
