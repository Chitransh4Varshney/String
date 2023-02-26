package String;

public class ReverseString {
    public static void main(String[] args) {

        // case1
        // String str1 = "pwskills";
        // String str2 = " ";
        // for (int i = str1.length() - 1; i >= 0; i--) {
        // str2 = str2 + str1.charAt(i);

        // }
        // System.out.println("Before Reversing: " + str1);
        // System.out.println("After Reversing: " + str2);

        // case2
        // String str1 = "chitransh varshney";
        // String str2 = " ";

        // String sarr[] = str1.split(" ");
        // for (int i = sarr.length - 1; i >= 0; i--) {
        // str2 = str2 + sarr[i] + " ";

        // }
        // System.out.println("Before Reversing: " + str1);
        // System.out.println("After Reversing: " + str2);
        // }

        // case3
        // String str1 = "chitransh varshney";
        // String str2 = " ";
        // for (int i = str1.length() - 1; i >= 0; i--) {
        // str2 = str2 + str1.charAt(i);

        // }
        // System.out.println("Before Reversing: " + str1);
        // System.out.println("After Reversing: " + str2);

        // case4
        String str1 = "Think Twice ";
        String str2 = "";

        String arr[] = str1.split(" ");
        for (String elem : arr) {
            for (int i = elem.length() - 1; i >= 0; i--) {
                str2 = str2 + elem.charAt(i);
            }
            str2 = str2 + " ";
        }

        System.out.println("Before Reversing:" + str1);
        System.out.println("After Reversing:" + str2);

    }

}
