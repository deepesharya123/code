public class Codec {

    HashMap<String, Integer> stringnum = new HashMap<>();
    HashMap<Integer, String> numstring = new HashMap<>();
    // Encodes a URL to a shortened URL.
    int num = 0;
    public String encode(String longUrl) {
        // List<String> list = new ArrayList<>();
        String s = "";
        String ans = ""; 
        int j = 0;
        for(int i = 0; i < longUrl.length(); i++){
            char c = longUrl.charAt(i);
            ans+=c;
            if(c == '/' && longUrl.charAt(i+1) == '/'){
                ans+='/';
                j = i+2;
                break;
            }
        }
        for( int i  = j; i<longUrl.length(); i++){
            char c = longUrl.charAt(i);
            if(c == '/'){
                if(!stringnum.containsKey(s)){
                    stringnum.put(s,num++);
                    numstring.put(num-1, s);
                }
                int use = stringnum.get(s);
                ans+=use;
                ans+="-";
                s="";
            }
            s+=c;
        }
        if(!stringnum.containsKey(s)){
            stringnum.put(s,num++);
            numstring.put(num-1, s);
        }
        int use = stringnum.get(s);
        ans+=use;
        System.out.println(stringnum);
        System.out.println(numstring);
        return ans;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String s = "";
        String ans = "";
         int j = 0;
        for(int i = 0; i < shortUrl.length(); i++){
            char c = shortUrl.charAt(i);
            ans+=c;
            if(c == '/' && shortUrl.charAt(i+1) == '/'){
                ans+='/';
                j = i+2;
                break;
            }
        }
        for( int i = j ; i < shortUrl.length() ; i++){
            char c = shortUrl.charAt(i);
            if(c == '-'){
                String add = numstring.get(Integer.parseInt(s));
                ans+=add;
                s="";
                continue;
            }
            s+=c;
        }
        String add = numstring.get(Integer.parseInt(s));
        ans+=add;
        return ans;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));