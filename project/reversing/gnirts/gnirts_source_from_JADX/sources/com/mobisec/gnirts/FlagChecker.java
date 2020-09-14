package com.mobisec.gnirts;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;

class FlagChecker {
    FlagChecker() {
    }

    public static boolean checkFlag(Context ctx, String flag) {
        if (!flag.startsWith("MOBISEC{") || !flag.endsWith("}")) {
            return false;
        }
        String core = flag.substring(8, 40);
        if (core.length() != 32) {
            return false;
        }
        String[] ps = core.split(foo());
        if (ps.length != 5 || !bim(ps[0]) || !bum(ps[2]) || !bam(ps[4]) || !core.replaceAll("[A-Z]", "X").replaceAll("[a-z]", "x").replaceAll("[0-9]", " ").matches("[A-Za-z0-9]+.       .[A-Za-z0-9]+.[Xx ]+.[A-Za-z0-9 ]+")) {
            return false;
        }
        char[] syms = new char[4];
        int[] idxs = {13, 21, 27, 32};
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < syms.length; i++) {
            syms[i] = flag.charAt(idxs[i]);
            chars.add(Character.valueOf(syms[i]));
        }
        int sum = 0;
        for (char c : syms) {
            sum += c;
        }
        if (sum == 180 && chars.size() == 1 && m10me(ctx, m8dh(m9gs(ctx.getString(C0267R.string.ct1), ctx.getString(C0267R.string.f22k1)), ps[0]), ctx.getString(C0267R.string.f29t1)) && m10me(ctx, m8dh(m9gs(ctx.getString(C0267R.string.ct2), ctx.getString(C0267R.string.f23k2)), ps[1]), ctx.getString(C0267R.string.f30t2)) && m10me(ctx, m8dh(m9gs(ctx.getString(C0267R.string.ct3), ctx.getString(C0267R.string.f24k3)), ps[2]), ctx.getString(C0267R.string.f31t3)) && m10me(ctx, m8dh(m9gs(ctx.getString(C0267R.string.ct4), ctx.getString(C0267R.string.f25k4)), ps[3]), ctx.getString(C0267R.string.f32t4)) && m10me(ctx, m8dh(m9gs(ctx.getString(C0267R.string.ct5), ctx.getString(C0267R.string.f26k5)), ps[4]), ctx.getString(C0267R.string.f33t5)) && m10me(ctx, m8dh(m9gs(ctx.getString(C0267R.string.ct6), ctx.getString(C0267R.string.f27k6)), flag), ctx.getString(C0267R.string.f34t6))) {
            return true;
        }
        return false;
    }

    private static boolean bim(String s) {
        return s.matches("^[a-z]+$");
    }

    private static boolean bum(String s) {
        return s.matches("^[A-Z]+$");
    }

    private static boolean bam(String s) {
        return s.matches("^[0-9]+$");
    }

    /* renamed from: dh */
    private static String m8dh(String hash, String s) {
        try {
            MessageDigest md = MessageDigest.getInstance(hash);
            md.update(s.getBytes());
            return toHexString(md.digest());
        } catch (Exception e) {
            return null;
        }
    }

    private static String toHexString(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(b & 255);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static String foo() {
        String s = "Vm0wd2QyVkZNVWRYV0docFVtMVNWVmx0ZEhkVlZscDBUVlpPVmsxWGVIbFdiVFZyVm0xS1IyTkliRmRXTTFKTVZsVmFWMVpWTVVWaGVqQTk=";
        for (int i = 0; i < 10; i++) {
            s = new String(Base64.decode(s, 0));
        }
        return s;
    }

    /* renamed from: gs */
    private static String m9gs(String a, String b) {
        String s = BuildConfig.FLAVOR;
        for (int i = 0; i < a.length(); i++) {
            s = s + Character.toString((char) (a.charAt(i) ^ b.charAt(i % b.length())));
        }
        return s;
    }

    /* renamed from: me */
    private static boolean m10me(Context ctx, String s1, String s2) {
        try {
            return ((Boolean) s1.getClass().getMethod(m11r(ctx.getString(C0267R.string.f28m1)), new Class[]{Object.class}).invoke(s1, new Object[]{s2})).booleanValue();
        } catch (Exception e) {
            Log.e("MOBISEC", "Exception: " + Log.getStackTraceString(e));
            return false;
        }
    }

    /* renamed from: r */
    public static String m11r(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
