import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.加密 2.解密");
        if (in.nextInt()==1) {
            System.out.println("请输入key");
            int key = in.nextInt();
            System.out.println("请输入密文");
            in.nextLine();
            char[] ciphertext = in.nextLine().toCharArray();
            char[] output = new char[ciphertext.length];
            for (int i = 0; i < ciphertext.length; i++) {
                int outputChar = ciphertext[i];
                outputChar >>= key / 10000;
                outputChar *= key / 5000;
                outputChar <<= key / 8967;
                outputChar -= 587;
                output[i] = (char) outputChar;

            }
            System.out.println(output);
        }else {
            System.out.println("请输入key");
            int key = in.nextInt();
            System.out.println("请输入密文");
            in.nextLine();
            char[] ciphertext = in.nextLine().toCharArray();
            char[] output = new char[ciphertext.length];
            for (int i = 0; i < ciphertext.length; i++) {
                int outputChar = ciphertext[i];
                outputChar += 587;
                outputChar >>= key / 8967;
                outputChar /= key / 5000;
                outputChar <<= key / 10000;
                output[i] = (char) outputChar;

            }
            System.out.println(output);
        }
    }
}