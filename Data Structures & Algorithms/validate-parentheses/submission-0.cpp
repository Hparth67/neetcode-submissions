class Solution {
public:
    bool isValid(string s) {
        stack<char> stack;
        unordered_map<char, char> check = {
            {')','('},
            {'}','{'},
            {']','['}
        };
        for (int c : s) {
            if (!stack.empty() && stack.top() == check[c]) {
                stack.pop();
            }   
            else {
                stack.push(c);
            }
        }
        if (stack.empty()) return true;
        else return false;

    }
};
