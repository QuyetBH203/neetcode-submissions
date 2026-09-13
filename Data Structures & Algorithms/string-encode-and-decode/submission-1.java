class Solution {

    public String encode(List<String> strs) {
       StringBuilder result = new StringBuilder();
       for(String s: strs){
        result.append(s.length()).append("#")
              .append(s);
       }
       return result.toString();


    }

    public List<String> decode(String str) {
        List<String> decode = new ArrayList<>();
        int i =0;
        while(i< str.length()){
            int j =i;
            while(str.charAt(j) != '#'){
                j++;
            }
            Integer len = Integer.parseInt(str.substring(i,j));
            String res = str.substring(j+1, j+1+len);
            decode.add(res);
            i=j+1+len;
        }
        return decode;

    }
}
