public class Palindrome {
//    public static boolean isPalindrome(String s) {
//        String str = cleanString(s);
//        System.out.println("Cleaned");
//        System.out.println(str);
//        System.out.println("reverse");
//        String rev = reverseString(str, str.length() - 1);
//        System.out.println(rev);
//        return str.equals(rev);
//    }
//
////    public static String cleanString(String s) {
////        StringBuilder b = new StringBuilder();
////        for(int i = 0; i < s.length(); i++) {
////            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
////                b.append(s.charAt(i));
////            }
////        }
////
////        return b;
////    }
//
//    public static String reverseString(String s, int n) {
//        if(n < 0)
//            return "";
//
//        return s.charAt(n) + reverseString(s, n - 1);
//    }
//
//    public static boolean isBarrier(char ch) {
//        return ch == ' ' || ch == ':' || ch == ',';
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//    }
}
