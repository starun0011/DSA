class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            int[] count = new int[26];
            for(int i=0; i<word.length(); i++){
                count[word.charAt(i)-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int val : count){
                sb.append(val);
                sb.append('#');
            }
            String frequencyKey = sb.toString();

            if(!map.containsKey(frequencyKey)){
                map.put(frequencyKey,new ArrayList<>());
            }
            map.get(frequencyKey).add(word);
        }




        // for (String word : strs) {
        //     char[] chars = word.toCharArray();
        //     Arrays.sort(chars);
        //     String sortedWord = new String(chars); 
        //     if (!map.containsKey(sortedWord)) {
        //         map.put(sortedWord, new ArrayList<>());
        //     }

        //     map.get(sortedWord).add(word);
        // }

        return new ArrayList<>(map.values());
    }
}