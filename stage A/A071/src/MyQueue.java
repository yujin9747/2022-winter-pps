import java.util.Stack;

class MyQueue {
    Stack<Integer> stack;

    public MyQueue() {
        this.stack = new Stack<>();
    }

    public void push(int x) {
        Stack<Integer> newStack = new Stack<>();
        newStack.push(x);   // 새로운 요소를 stack의 가장 아래 깔아주기
        recursivePush(newStack, this.stack);
        this.stack = newStack;
    }

    public int pop() {
        return this.stack.pop();
    }

    public int peek() {
        return this.stack.peek();
    }

    public boolean empty() {
        return this.stack.empty();
    }

    // stack은 가장 먼저 들어온 요소가 가장 아래 위치하는 방식이고, queue는 가장 먼저 들어온 요소가 가장 위에서 배치해야 하기 때문에 recursive로 push
    private void recursivePush(Stack<Integer> newStack, Stack<Integer> origin){
        if(origin.size() == 0) return;
        Integer top = origin.peek();    // 가장 먼저 들어온 요소를 스택의 가장 위에 넣기 위해 빼둠
        origin.pop();
        recursivePush(newStack, origin);    // 스택의 아래에 깔려있는 요소를 먼저 새로운 스택에 넣은 후,
        newStack.push(top);                 // 가장 위에 가장 먼저 들어온 요소를 배치
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
