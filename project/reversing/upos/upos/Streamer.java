
package com.mobisec.upos;

import java.io.PrintStream;

public class Streamer {
    private boolean[] lfsr;
    private int tap;

    public static void main(String[] args) {
        Streamer lfsr2 = new Streamer("01101000010", 8);
        System.out.println("Testing step()");
        for (int i = 0; i < 10; i++) {
            int bit = lfsr2.step();
            PrintStream printStream = System.out;
            printStream.println(lfsr2 + " " + bit);
        }
        Streamer lfsr3 = new Streamer("01101000010", 8);
        System.out.println("\nTesting generate()");
        for (int i2 = 0; i2 < 10; i2++) {
            int r = lfsr3.generate(5);
            PrintStream printStream2 = System.out;
            printStream2.println(lfsr3 + " " + r);
        }
    }

    public Streamer() {
        this("01101000010", 8);
    }

    public Streamer(String seed, int tap2) {
        this.lfsr = new boolean[seed.length()];
        this.tap = (seed.length() - 1) - tap2;
        for (int i = 0; i < seed.length(); i++) {
            if (seed.charAt(i) == '0') {
                this.lfsr[i] = false;
            } else {
                this.lfsr[i] = true;
            }
        }
    }

    public int step() {
        boolean[] zArr;
        boolean[] zArr2 = this.lfsr;
        boolean newBit = zArr2[this.tap] ^ zArr2[0];
        int i = 0;
        while (true) {
            zArr = this.lfsr;
            if (i >= zArr.length - 1) {
                break;
            }
            zArr[i] = zArr[i + 1];
            i++;
        }
        zArr[zArr.length - 1] = newBit;
        if (!newBit) {
            return 0;
        }
        return 1;
    }

    public int g2() {
        int val = 0;
        for (int i = 0; i < 16; i++) {
            val |= step() << i;
        }
        return val;
    }

    public int generate(int k) {
        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp = (temp * 2) + step();
        }
        return temp;
    }

    public String toString() {
        String representation = BuildConfig.FLAVOR;
        for (int i = 0; i < this.lfsr.length; i++) {
            representation = representation + (this.lfsr[i] ? 1 : 0);
        }
        return representation;
    }
}
