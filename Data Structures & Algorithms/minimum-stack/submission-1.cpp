class MinStack {
public:
    std::stack<int> stack;
    std::stack<int> minStack;
    MinStack() {
        
    }
    
    void push(int val) {
        stack.push(val);
        val = min(val, !minStack.empty() ? minStack.top() : val);
        minStack.push(val);
    }
    
    void pop() {
        stack.pop();
        minStack.pop();
    }
    
    int top() {
        return stack.top();
    }
    
    int getMin() {
        return minStack.top();
    }
};
