public class Comp {
    public static void main(String args[]){
        //compare

        String name1 = "Tony";
        String name2 = "Tony";

        // s1 > s2 : +ve value
        // s1 == s2 : 0
        // s1 < s2 : -ve value

        if(name1.compareTo(name2) == 0){
            System.out.println("String are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }    
}