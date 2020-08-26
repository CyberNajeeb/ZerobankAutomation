package practiceClasses;

public class SB {
    public static void main(String[] args) {

        //StringBuffer and StringBuilder are both mutable.
        //The difference is that StringBuffer is synchronized, meaning that it's threadSafe.
        //If we don't need thread safety, we'll use StringBuilder because its faster processed.

        StringBuffer stringBuffer = new StringBuffer("word");
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer = new StringBuffer("java");

        System.out.println("stringBuffer = " + stringBuffer);
        System.out.println("stringBuffer2 = " + stringBuffer2);
    }
}
