public class ProvideTest {
    public static void main(String[] args) {
        String str = "28";
        long l = 0;
        int i = 0;
        short s = 0;
        byte b = 4;
        double d = 0.1;
        float f = 0.1f;
        boolean bool = false;
        char c = 0;

        b = (byte) s;
        b = (byte) c;
        b = (byte) i;
        b = (byte) l;
        b = (byte) d;
        b = (byte) f;

        s = b;
        s = (short) i;
        s = (short) l;
        s = (short) f;
        s = (short) d;
        s = (short) c;

        c = (char) b;
        c = (char) f;

        i = (int) l;

        l = (long) d;
        
        f = b;
        f = l;
    }
}
