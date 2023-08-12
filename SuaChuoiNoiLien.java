public class SuaChuoiNoiLien {
    public static void main(String[] args) {
        String St = "DaNang";
        System.out.println(solve(St));
    }
    public static String solve(String s) {
        // Write your code here
        String[] array = s.split("");
        String str = array[0];
        for (int i = 1; i < array.length; i++) {
            String st = array[i].toUpperCase();
            if (array[i] == st) {
                str = str + " " +array[i];
            } else {
                str = str + array[i];
            }
        }
        return str.toLowerCase();
    }
}
