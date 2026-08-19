public class Palindrome {
    public static void main(String[] args){
        String str = "madam";
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)) 
                System.out.println("Not a Palindrome");
            i++;
            j--;
        }
        System.out.println("Palindrome");
        System.out.println();
    }
}