import java.util.Scanner;

public class Main {
    public static char[] encryptAndDecrypt(char[] ciphertext,String key){
        char[] output = new char[ciphertext.length];
        for (int i = 0; i < ciphertext.length; i++) {
            output[i] = (char) (ciphertext[i] ^ Integer.parseInt(key+1));
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("这个程序可以加密和解密");
        System.out.println("请输入key");
        String key = in.nextLine();
        System.out.println("请输入密/明文");
        char[] ciphertext = in.nextLine().toCharArray();
        char[] output = encryptAndDecrypt(ciphertext,key);
        System.out.println(output);
    }
}