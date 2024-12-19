import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入key");
        int key = in.nextInt();
        System.out.println("请输入密文");
        in.nextLine();
        char[] ciphertext = in.nextLine().toCharArray();
        char[] output = new char[ciphertext.length];
        for (int i = 0;i < ciphertext.length;i++){
            output[i] = (char) (ciphertext[i]>>5*key<<key/2+10054>>>5);
        }
        System.out.println(output);
    }
}