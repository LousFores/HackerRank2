import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LapTen {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("abbb");
        list.add("aab");
        list.add("ba");
        list.add("aa");
        list.add("baaa");
        System.out.println(solve(6,list));
    }
    public static int solve(int n, List<String> names) {
        // Write your code here
        Collections.sort(names);
        String[] listName = new String[n];
        String[] newListName = new String[n];

        for (int i = 0; i < names.size(); i++) {
            listName[i] = names.get(i);
        }
        char ch = listName[0].charAt(0);
        newListName[0] = Character.toString(ch);

        for (int i = 1; i < n; i++) {
            int endIndex = 1;
            for (int j = 0; j < i; j++) {
                if (listName[i].indexOf(listName[j]) == 0) {
                        endIndex = listName[j].length()+1;
                }
            }
            newListName[i] = listName[i].substring(0,endIndex);
            listName[i] = newListName[i];
        }

        int smallLength = 0;
        for ( String str : newListName) {
            smallLength = smallLength + str.length();
        }
        return smallLength;
    }
}
