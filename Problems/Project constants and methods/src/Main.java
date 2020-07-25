public class Main {

    public static void main(String[] args) {
       ConstantsAndUtilities constUtil = new ConstantsAndUtilities();
        System.out.println(constUtil.A_CONSTANT_TTT);
        System.out.println(constUtil.B_CONSTANT_QQQ);
        System.out.println(constUtil.getMagicString());
        System.out.println(ConstantsAndUtilities.convertStringToAnotherString("aa"));
    }

}

// Don't change this class
class ConstantsAndUtilities {

    public static final String A_CONSTANT_TTT = "1234";

    public static final String B_CONSTANT_QQQ = "7890";

    public static String getMagicString() {
        return A_CONSTANT_TTT + B_CONSTANT_QQQ;
    }

    public static String convertStringToAnotherString(String s) {
        return A_CONSTANT_TTT + s;
    }

 /*   public static void printConstants() {
        System.out.println(A_CONSTANT_TTT);
        System.out.println(B_CONSTANT_QQQ);
        System.out.println(getMagicString());
        System.out.println(convertStringToAnotherString("aa"));
    }*/

}