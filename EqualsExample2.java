public class EqualsExample2{
    public static void main(String[] args){
        String s1 = "javatpoint";
        String s2 = "javatpoint";
        String s3 = "javatpoint";
        System.out.println(s1.equals(s2));
        if(s1.equals(s3)){
            System.out.println("both strings are equal");
        }else System.out.println("both strings are unequal");
    }
}