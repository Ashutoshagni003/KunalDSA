package TREES;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
public class LargeStrings {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        StringBuffer sb2 = new StringBuffer("AshutoshAgnihotri");
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());



        sb.append("WeMakeDevs");
        sb.append(" is Nice");
        sb.insert(2," Rahul ");
//        sb.replace(2,9,"");
        sb.delete(2,9);
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);

        Random random = new Random();
        System.out.println((char)(97+(Math.abs(random.nextInt())%26)));
        //remove white spaces
        String sentence = "Hi sdfn sdfndsio sdjsiop";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s",""));
        String arr = "Ashu tosh  Agni hotri";
        String[] names = arr.split(" ");
        String nameStr = " ";
        nameStr = nameStr + arr.split(" ");
        System.out.println(Arrays.toString(names));
        System.out.println(nameStr);


        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println(df.format(7.2));

    }

}
