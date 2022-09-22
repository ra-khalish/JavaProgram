public class KonversiNumber {
    public static void main(String[] args) {

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 1000; // overflow number jika int 1000 di konversi jadi byte.
        byte iniByte2 = (byte) iniInt2;
    }
}
