package com.company;

import java.util.Locale;

public class strng {
    public static void main(String[] args) {
        String name = "   RaVii   KaLyan 11  ";
        System.out.println(name.length());
        System.out.println(name.toLowerCase(Locale.ROOT) );

        System.out.println(name.toUpperCase(Locale.ROOT) );

        System.out.println(name.trim());

        System.out.println(name.substring(11));

        System.out.println(name.substring(11,17));

        System.out.println(name.replace('i','a'));

        System.out.println(name.replace("ii","an"));

        System.out.println(name.startsWith("   R"));

        System.out.println(name.endsWith("n     "));

        System.out.println(name.charAt(12));

        System.out.println(name.indexOf("aL"));

        System.out.println(name.lastIndexOf("a"));

        System.out.println(name.equals("   RaVii   KaLyan 11  "));

        System.out.println(name.equalsIgnoreCase("   RaVIi   KaLyAN 11  "));

        System.out.println(name.getBytes());
    }
}
