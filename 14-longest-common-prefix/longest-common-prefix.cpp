class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if (strs.empty()) return "";

        sort(strs.begin(), strs.end());
        string s1 = strs.front();
        string s2 = strs.back();
        int idx = 0;

        while (idx < s1.length() && idx < s2.length()) {
            if (s1[idx] == s2[idx]) {
                idx++;
            } else {
                break;
            }
        }

        return s1.substr(0, idx);
    }
};
