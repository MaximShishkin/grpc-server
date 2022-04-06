package ru.shishkin.string;

public class PalidromTest {
    public PalidromTest() {
        System.out.println(checkPalidrom(2574452));
    }

    String checkPalidrom(int chislo) {
        StringBuffer str = new StringBuffer("").append(chislo);

        str.reverse();

        String str1 = str.substring(0, str.length());

        if (chislo == Integer.parseInt(str1)) {
            return "This is palidrom";
        } else {
            return "No";
        }
    }
}
