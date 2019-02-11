public class specialCharacter {
    public static void main(String[] args) {

        String str = "Geeksf!@orgeek@s A#$ c%o^mputer"
                    + " s****cience p#o@rtal fo@r ge%eks";

        System.out.println(moveSpecial(str));

    }

    public static String moveSpecial(String str) {
        int len = str.length();
        String regx = "[a-zA-Z0-9\\s+]";

        String res1 = "", res2 = "";
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);

            if (String.valueOf(c).matches(regx)){
                res1 += c;
            }else {
                res2 += c;
            }
        }
        return res1 + res2;
    }
}
