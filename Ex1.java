public class Ex1 {

    public static void main(String args[]) {

        // Initialising String
        String str = "we are happy";
        String str2 = "we%20are%20happy";

        char[] ch = new char[str2.length()];

        System.out.println("Before Add %20 : ");
        System.out.println(str);

        for (int i = 0; i < str2.length(); i++) {
            ch[i] = str2.charAt(i);

        }

        System.out.println("After Add %20 : ");
        System.out.println(ch);

    }

}