class TimeMap {
public:
    unordered_map<string, vector<pair<string, int>>> store;

    TimeMap() {
        
    }
    
    void set(string key, string value, int timestamp) {
        store[key].push_back({value, timestamp});
    }
    
    string get(string key, int timestamp) {
        string res="";
        auto& val=store[key];
        int l=0, r=val.size()-1;

        while(l<=r) {
            int m=l+(r-l)/2;
            if(val[m].second <= timestamp) {
                res=val[m].first;
                l=m+1;
            }
            else {
                r=m-1;
            }
        }
        return res;
    }
};
