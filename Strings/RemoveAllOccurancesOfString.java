public class RemoveAllOccurancesOfString {
    public String removeOccurrences(String s, String part) {
        StringBuffer str = new StringBuffer(s);
        int l = part.length();
        int ind;
        do{
            String a = str.toString();
            ind = a.indexOf(part);
            if(ind >= 0)
                str.delete(ind, ind+l);
        }
        while(ind != -1);
        
        String ans = str.toString();
        return ans;
    }
}
