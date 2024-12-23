import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.Arrays;

public class Main {
    public static char[] encryptAndDecrypt(char[] ciphertext,String key){
        char[] output = new char[ciphertext.length];
        for (int i = 0; i < ciphertext.length; i++) {
            output[i] = (char) (ciphertext[i] ^ Integer.parseInt(key+1));
        }
        return output;
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"这个程序可以加密和解密");
        String key = JOptionPane.showInputDialog("请输入key");
        char[] ciphertext = ("请输入密/明文").toCharArray();
        char[] output = encryptAndDecrypt(ciphertext,key);
        StringSelection selection = new StringSelection(Arrays.toString(output));
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, selection);
    }
}