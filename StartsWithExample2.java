public class StartsWithExample2 {
    public static void main(String[] args) {
        String str = "Javatpoint";
        // no offset mentioned; hence, offset is 0 in this case.
        System.out.println(str.startsWith("J")); // True

        // no offset mentioned; hence, offset is 0 in this case.
        System.out.println(str.startsWith("a")); // False
        // offset is 1
        System.out.println(str.startsWith("a",1)); // True
    }
}