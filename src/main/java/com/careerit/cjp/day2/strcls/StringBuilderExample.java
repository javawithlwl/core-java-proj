package com.careerit.cjp.day2.strcls;

public class StringBuilderExample {


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); // StringBuffer sb = new StringBuffer();
        sb.append("Core");
        sb.append(" Java");
        System.out.println(sb);

        StringBuilder s1 = new StringBuilder();
        s1.append("<html>");
        s1.append("<head>");
        s1.append("<title>");
        s1.append("Welcome to Java");
        s1.append("</title>");
        s1.append("</head>");
        s1.append("<body>");
        s1.append("<h1>");
        s1.append("Welcome to Java");
        s1.append("</h1>");
        s1.append("</body>");
        s1.append("</html>");
        System.out.println(s1);

        System.out.println(isPalindrome("madam"));
    }

    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
