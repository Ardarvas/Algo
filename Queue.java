import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    public Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for (int i = 1; i < q.size(); i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(200);
        stack.push(10);
        stack.push(15);
        stack.push(27);

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop()+"burayı sildim");
    ;
        System.out.print("Yığın içeriği: ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.print(stack.empty());
    }
}
