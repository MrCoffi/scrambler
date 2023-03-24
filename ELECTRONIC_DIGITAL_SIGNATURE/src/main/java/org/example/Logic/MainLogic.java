package org.example.Logic;
import java.nio.charset.StandardCharsets;
public class MainLogic {
    private final int a = 61;
    private final int b = 13;
    private int c = 256;
    private int t = 144;
    private String p;
    private long kSumm;
    private static int summKodBukvOtkr;
    private int maxValue = 255;
    private static long k;
    public MainLogic(String text) {
        this.p = text;
        countingCode(p);
    }

    private void countingCode(String text) {
        byte[] bytes = text.getBytes(StandardCharsets.US_ASCII);
        countingChecksum(bytes);
        counting(bytes, a, b, c, t);
        kSumm = countingKsum(k);
    }

    private long countingKsum(long k) {
        return k > c ? k % c : k;
    }

    public static long countingChecksum(byte[] bytes) {
        k=0;
        for( byte bytes1: bytes){
            k += bytes1;
        }
        return k;
    }

    public static long counting(byte[] bytes, int a, int b, int c, int t){
        summKodBukvOtkr =0;
        for (byte byte1:bytes) {
            t = (a * t + b) % c;
            summKodBukvOtkr += byte1 ^ t;
        }
        return summKodBukvOtkr;
    }


    @Override
    public String toString() {
        return "MainLogic{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", t0=" + t +
                ", p='" + p + '\'' +
                ", kSumm=" + kSumm +
                ", maxValue=" + maxValue +
                ", summKodBukvOtkr=" + summKodBukvOtkr%c +
                '}';
    }
}
