class MinStack {

    int top;
    int[] s;
    int[] min;
    static final int size = 30001;
    public MinStack() {
        top = -1;
        s = new int[size];
        min = new int[size];
    }
    
    public void push(int val) {
        if (top == size - 1) return;
        top++;
        s[top] = val;

        if (top == 0)
        {
            min[top] = val;
        }
        else
        {
            min[top] = Math.min(min[top - 1], val);
        }
    }
    
    public void pop() {
        if (top == -1) return;
        
        top--;
    }
    
    public int top() {
        if (top == -1) return -1;
        return s[top];
    }
    
    public int getMin() {
        if (top == -1) return -1;
        return min[top];
    }
}
