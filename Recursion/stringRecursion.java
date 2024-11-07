package Recursion;



public class stringRecursion {
    public static void main(String[] args) {
        StringBuilder newStr = new StringBuilder();
//        removeA("baccad");
//        remove("baccad", 0 , newStr);
//        skip("baccah","");
//        skipString("bcappleabapplec","apple",newStr);
//        System.out.println(skipApple("bcappleabapplec"));
        System.out.println(skipAppNotApple("bcappleabapplec"));
//        System.out.println(newStr);
    }
    public static void removeA(String str){
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != 'a'){
                newStr.append(str.charAt(i));
            }
        }
        System.out.println(newStr);
    }

    public static void remove(String str, int i,StringBuilder newStr){
        if( i >= str.length()){
            System.out.println(newStr);
            return;
        }
        if(str.charAt(i) != 'a'){
            newStr.append(str.charAt(i));

        }
        remove(str,i+1,newStr);
    }
    public static void skip(String str,String newStr){
        if(str.isEmpty()){
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            skip(str.substring(1),newStr);
        }else {
            skip(str.substring(1),newStr+ch);
        }
    }
    public static void skipString(String str,String target,StringBuilder newStr){
        if(str.isEmpty()){
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(0);
        char ta = target.charAt(0);

        if(ch != ta){
            newStr.append(ch);
            skipString(str.substring(1),target,newStr);
        }else{
            if(findMatch(str,target)){
                skipString(str.substring(target.length()),target,newStr.append(str.charAt(0)));
            }else{
                skipString(str.substring(1),target,newStr);
            }
        }

    }
    public static boolean findMatch(String str,String target){

        String newOne = str.substring(0,target.length());
        if(newOne.equals(target)){
            return true;
        }
        return false;

//        for (int i = 0; i < target.length(); i++) {
//            if(str.charAt(i) != target.charAt(i)){
//                return false;
//            }
//        }
//        return true;
    }

    public static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
    public static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }

}
