import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> Stack = new Stack<>();
        FilaCircular fc = new FilaCircular(10);

        fc.add(1);
        fc.add(2);
        fc.add(3);
        fc.add(4);
        fc.add(5);
        fc.add(6);
        fc.add(7);
        fc.remove();

        fc.move(1,3);
        fc.print();



    }
}
