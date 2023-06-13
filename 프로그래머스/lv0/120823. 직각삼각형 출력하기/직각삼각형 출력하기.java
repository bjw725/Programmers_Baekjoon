import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=n; i++){
            sb.append("*".repeat(i)).append(System.lineSeparator());
        }
        String triangle = sb.toString();
        System.out.println(triangle);
    }
}