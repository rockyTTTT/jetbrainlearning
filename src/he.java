import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int count = 0;
        String[] str = new String[4];
        for (int i = 0; i < 4; i++) {
            str[i]="";
        }
        while (true){
            String string = scanner.nextLine();
            for (int i = 0; i <string.length()-1; i++){
                char chars = string.charAt(i);
                if (string.charAt(i) != ' ' && (string.charAt(i+1) ==' ')){
                    str[count] += chars;
                    count++;
                }
                else if (chars != ' ')
                    str[count] += chars;
                if (count>=4)
                    break;
            }
            if (string.charAt(string.length()-1)!=' ') {
                char chars = string.charAt(string.length() - 1);
                str[count] += chars;
                count++;
            }
            if (count >= 4)
                break;
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(str[i]);
        }
    }
}
