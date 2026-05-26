class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);   
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i =0;
        while(i < str.length()){
            int idx = str.indexOf("#",i);
            int len = Integer.parseInt(str.substring(i, idx));
            String st = str.substring(idx+1, idx+len+1);
            decoded.add(st);
            i = idx+1+len;
        }

        
        return decoded;  
    }
}
