import java.util.*;
public class PrelimLab {
    public static void main(String[] args){
        MyMath MyMath = new MyMath();
		MyMath.mainmenu();
    }
}

class MyMath{
    static int a,b,c,d,z;
    static Scanner ask = new Scanner(System.in);

    void mainmenu(){
        inter();
        asker();
    }

    public static void inter(){
        System.out.println("Enter first number(A): ");
            a = ask.nextInt();
        System.out.println("Enter second number(B): ");
            b = ask.nextInt();
        System.out.println("Enter third number(C): ");
            c = ask.nextInt();
        System.out.println("Enter fourth number(D): ");
            d = ask.nextInt();
    }
    
    public static void asker(){
        System.out.println("How many numbers to add? (2-4)");
        int amount = ask.nextInt();
    switch(amount){
        case 2:
            add2();
            again();
            break;
        case 3:
            add3();
            again();
            break;
        case 4:
            int four = add(a,b,c,d);
            System.out.println(four);
                again();
            break;
            default:
            System.out.println("Can't do that");
            asker();
            break;
    }
    }

    public static void add2(){
        Scanner imp = new Scanner(System.in);
        int y;
        System.out.println("Which numbers to use? (A-D)");
        System.out.println("First number: ");
        int twoo;
            String which1 = imp.nextLine();
            if ("A".equals(which1)){
                y = num2();
                twoo = add(a,y);
                System.out.println(twoo);
            }else if("B".equals(which1)){
                y = num2();
                twoo = add(b,y);
                System.out.println(twoo);
            }else if("C".equals(which1)){
                y = num2();
                twoo = add(c,y);
                System.out.println(twoo);
            }else if("D".equals(which1)){
                y = num2();
                twoo = add(d,y);
                System.out.println(twoo);
            }else{
                System.out.println("Can't do that");
                add2();
            }
    }
    
    public static void add3(){
        Scanner imp = new Scanner(System.in);
        System.out.println("Which number to exclude? (A-D)");
                int three;
                String which3 = imp.nextLine();
            if ("A".equals(which3)){
                three = add(b,c,d);
                System.out.println(three);
            }else if("B".equals(which3)){
                three = add(a,c,d);
                System.out.println(three);
            }else if("C".equals(which3)){
                three = add(a,b,d);
                System.out.println(three);
            }else if("D".equals(which3)){
                three = add(a,b,c);
                System.out.println(three);
            }else{
                System.out.println("Can't do that");
                add3();
            }
    }

    public static int num2(){
        Scanner imp = new Scanner(System.in);
        System.out.println("Second number: (A-D)");
            String which2 = imp.nextLine();
        if ("A".equals(which2)){
            z=a;
        }else if ("B".equals(which2)){
            z=b;
        }else if ("C".equals(which2)){
            z=c;
        }else if ("D".equals(which2)){
            z=d;
        }else{
            System.out.println("Can't do that");
            num2();
        }
        return z;
    }

    public static int add(int a, int b) {
        return a+b;
    }
    
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    
    public static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    
    public static void again(){
        Scanner imp = new Scanner(System.in);
        System.out.println("Again? Yes(Y) or No(N)");
                String again = imp.nextLine();
            if ("Y".equals(again)){
                set();
            }else if("N".equals(again)){
                exit();
            }else{
                System.out.println("Can't do that");
                again();
            }
    }

    public static void set(){
        Scanner imp = new Scanner(System.in);
        System.out.println("Use the same set of numbers? Yes(Y) or No(N)");
                String again = imp.nextLine();
            if ("Y".equals(again)){
                asker();
            }else if("N".equals(again)){
                inter();
                asker();
            }else{
                System.out.println("Can't do that");
                set();
            }
    }
    
    public static void exit(){
        System.out.println("Thank you");
    }
}

