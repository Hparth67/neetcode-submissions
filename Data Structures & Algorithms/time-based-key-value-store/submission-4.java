class TimeMap {
    private Map<String, List<Pair<Integer, String>>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        List<Pair<Integer, String>> values = map.getOrDefault(key, new ArrayList<>());
        int l = 0, r = values.size() - 1;
        String res = "";

        while(l <= r) {
            int m = (l + r) / 2;
            if(values.get(m).getKey() <= timestamp) {
                res = values.get(m).getValue();
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return res;
    }
}
