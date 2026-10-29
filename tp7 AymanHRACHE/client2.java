interface Program {
    void go();
}

class Program1 implements Program {
    public void go() {
        System.out.println("Je suis le traitement 1");
    }
}

class Program2 implements Program {
    public void go() {
        System.out.println("Je suis le traitement 2");
    }
}

class Program3 implements Program {
    public void go() {
        System.out.println("Je suis le traitement 3");
    }
}

class Program4 implements Program {
    public void go() {
        System.out.println("Je suis le traitement 4");
    }
}

class ProgramFactory {
    public static Program createProgram(int choice) {
        if (choice == 1) {
            return new Program1();
        } else if (choice == 2) {
            return new Program2();
        } else if (choice == 3) {
            return new Program3();
        } else if (choice == 4) {
            return new Program4();
        }
        return null;
    }
}

public class client2 {

    public static void main(int choice) {
        Program p = ProgramFactory.createProgram(choice);
        if (p == null) {
            System.out.println("Unknown program");
        } else {
            System.out.println("I am main" + choice);
            p.go();
        }
    }

    public static void main(String[] args) {
        main(1);
        main(2);
        main(3);
        main(4);
        main(5);
    }
}