package String;

import java.util.Scanner;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of string for which you want remove duplicate");
        String s1 = scan.next();
        String s2 = "";

        for (int i = 0; i < s1.length(); i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < s1.length(); j++) {
                if (s1.charAt(i) == s1.charAt(j)) {
                    System.out.println(s1.charAt(i));
                    isDuplicate = true;
                }
            }

            if (!isDuplicate) {
                s2 = s2 + s1.charAt(i);
            }
        }
        System.out.print(s2);

    }
}