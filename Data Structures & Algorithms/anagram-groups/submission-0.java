class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        int a[] = new int[strs.length];
        for(int i=0;i<strs.length;i++){
            List<String> ls = new ArrayList<>();
            if(a[i]==0){
                ls.add(strs[i]);
                a[i]=1;
            }
            for(int j=i+1;j<strs.length;j++){
                if(isAnagram(strs[i],strs[j])){
                    if(a[j]==0){
                    ls.add(strs[j]);
                    a[j]=1;
                    }
                }
            }
            if(ls.size()!=0){
list.add(ls);
            }
            
        }
        return list;
    }
    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int a[]= new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;
        }
        for(int x:a){
            if(x!=0){
                return false;
            }
        }
        return true;
    }
}
