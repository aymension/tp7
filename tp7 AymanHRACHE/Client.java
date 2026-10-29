class Program1 {
    public void go() {
        System.out.println("Je suis le traitement 1");
    }
}

class Program2 {
    public void go() {
        System.out.println("Je suis le traitement 2");
    }
}

class Program3 {
    public void go() {
        System.out.println("Je suis le traitement 3");
    }
}

public class Client {
    public static void main(int number) {
        if (number == 1) {
            Program1 p = new Program1();
            System.out.println("I am main" + number);
            p.go();
        } else if (number == 2) {
            Program2 p = new Program2();
            System.out.println("I am main" + number);
            p.go();
        } else if (number == 3) {
            Program3 p = new Program3();
            System.out.println("I am main" + number);
            p.go();
        } else {
            System.out.println("not a program");
        }
    }
    public static void main(String[] args) {
        main(1);
        main(2);
        main(3);
    }
}
