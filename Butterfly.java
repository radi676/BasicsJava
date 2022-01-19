import java.util.Scanner;

public class Butterfly {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            while (scanner.hasNextInt()) {

                int  n = Integer.parseInt(scanner.nextLine());
                if(n < 3 || n > 1000) {
                    return;
                }
                for (int row = 0; row < n - 2; row++) {
                    if(row % 2 == 0){
                        System.out.print(repeatStr("*", n - 2));
                        System.out.print("\\");
                        System.out.print(" ");
                        System.out.print("/");
                        System.out.println(repeatStr("*", n - 2));
                    }else{
                        System.out.print(repeatStr("-", n - 2));
                        System.out.print("\\");
                        System.out.print(" ");
                        System.out.print("/");
                        System.out.println(repeatStr("-", n - 2));
                    }
                }

                System.out.print(repeatStr(" ", n-1));
                System.out.println("@");

                for (int row = 0; row < n - 2; row++){
                    if(row % 2 == 0){
                        System.out.print(repeatStr("*", n - 2));
                        System.out.print("/");
                        System.out.print(" ");
                        System.out.print("\\");
                        System.out.println(repeatStr("*", n -2));
                    }else{
                        System.out.print(repeatStr("-", n - 2));
                        System.out.print("/");
                        System.out.print(" ");
                        System.out.print("\\");
                        System.out.println(repeatStr("-", n - 2));
                    }
                }
            }


        }
        static String repeatStr(String strToRepeat, int count) {
            String text = "";

            for (int i = 0; i < count; i++) {
                text = text + strToRepeat;
            }

            return text;
        }

    }