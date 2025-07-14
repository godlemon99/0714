public class Main {
    public static void main(String[] args) {

        Character obj_ch=Character.valueOf('a');
        System.out.println(obj_ch);
        char ch=obj_ch.charValue();
        System.out.println(ch);

        Character obj_ch2=Character.valueOf('1');
        boolean isDigit=obj_ch2.isDigit(obj_ch2.charValue());
        System.out.println(isDigit);
        boolean isLetter= Character.isLetter(obj_ch2.charValue());
        System.out.println(isLetter);

        char ch1=Character.toUpperCase('a');
        char ch2=Character.toLowerCase('B');

        System.out.println(ch1+" "+ch2);

    }
}