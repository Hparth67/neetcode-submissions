class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> stack;
        for(const auto& i:tokens) {
            if(i=="+") {
                int val1=stack.top();
                stack.pop();
                int val2=stack.top();
                stack.pop();
                int val=val2+val1;
                stack.push(val);
            }
            else if(i=="-") {
                int val1=stack.top();
                stack.pop();
                int val2=stack.top();
                stack.pop();
                int val=val2-val1;
                stack.push(val);
            }
            else if(i=="*") {
                int val1=stack.top();
                stack.pop();
                int val2=stack.top();
                stack.pop();
                int val=val2*val1;
                stack.push(val);
            }
            else if(i=="/") {
                int val1=stack.top();
                stack.pop();
                int val2=stack.top();
                stack.pop();
                int val=val2/val1;
                stack.push(val);
            }
            else {
                stack.push(stoi(i));
            }
        }
        return stack.top();
    }
};
