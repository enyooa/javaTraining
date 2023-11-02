package javaTraining.string.stringBuilder;

public class Test {
    public static void main(String[] args) {


        //        immutable "Text"
//        mutable:  "Text: I'm a superstar"
//        immutable: "Text: I'm a superstar"
        String immutableText = "Text";
        StringBuilder builder = new StringBuilder(immutableText);
        builder.append(" ");
        builder.append("I'm").append(" ");
        builder.append("a").append(" ");
        builder.append("superstar");
        immutableText = builder.toString();
        System.out.println(immutableText);
    }
}
