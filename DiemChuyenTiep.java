import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiemChuyenTiep {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size number: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Number is " + i + ":");
            int number = scanner.nextInt();
            list.add(number);
        }
        System.out.println("Result return " + solve(list));

    }
    public static int solve(List<Integer> arr) {
        int count = -1;
        for (int i = 0; i < arr.size()-1; i++) {
            if ((arr.get(i) == 0) && (arr.get(i+2)==1)) {
                count = i + 2;
                break;
            }
        }
        return count;
    }

}
