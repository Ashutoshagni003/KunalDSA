package AllElse;

public class LinearSearch {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'c';
        System.out.println(search(name,target));
    }
    public static boolean search(String name, char target){
        if (name.length() == 0){
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            char recentChar = name.charAt(i);
            if (recentChar == target){
                return true;
            }
        }

        return false;
    }
}
