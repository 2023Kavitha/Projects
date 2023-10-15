import java.util.Scanner;

    class Is{
    public static boolean isPangram(String s) {
        s = s.toLowerCase();
        boolean[] alphabet = new boolean[26]; 

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        for (boolean letter : alphabet) {
            if (!letter) {
                return false; 
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        boolean isPanagram = isPangram(input);

        if (isPanagram) {
            System.out.println("PANGRAM");
        } else {
            System.out.println("Not a Pangram");
        }
    }
}