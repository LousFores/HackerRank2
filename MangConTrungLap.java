public class MangConTrungLap {
    public static void main(String[] args) {
        System.out.println(solve("1 4 5 2 3 3","1 2 3"));
    }
    public static String solve(String parentString, String childString) {
        // Write your code here
        String[] numbersParent = parentString.split(" ");
        String[] numbersChild = childString.split(" ");

        int[] A = new int[numbersParent.length];
        int[] B = new int[numbersChild.length];
        int[] C = new int[100000000];
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(numbersParent[i]);
            if (C[A[i]] == 0) C[A[i]] = 1;
        }
        for (int i = 0; i < numbersChild.length; i++) {
            B[i] = Integer.parseInt(numbersChild[i]);
            if (C[B[i]] == 0) return "0";
        }
        return  "1";
    }
}
