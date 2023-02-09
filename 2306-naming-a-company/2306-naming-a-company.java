class Solution {
    public long distinctNames(String[] ideas) {
        HashSet<String>[] splitt = new HashSet[26];
        for (int i = 0; i < 26; ++i) {
            splitt[i] = new HashSet<>();
        }
        for (String idea : ideas) {
            splitt[idea.charAt(0) - 'a'].add(idea.substring(1));
        }
        // for(int i =0;i<25;i++){
        //     System.out.println(splitt[i]);
        // }

        long fin = 0;
        for (int i = 0; i < 25; ++i) {
            for (int j = i + 1; j < 26; ++j) {
                
                long samee = 0;
                for (String x : splitt[i]) {
                    if (splitt[j].contains(x)) {
                        samee++;
                    }
                }
                fin += 2 * (splitt[i].size() - samee) * (splitt[j].size() - samee);
            }
        }
        
        return fin;
    }
}