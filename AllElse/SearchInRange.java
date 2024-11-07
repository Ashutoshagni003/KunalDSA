package AllElse;

public class SearchInRange {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'K';
        System.out.println(search(name,target,0,3));
    }
    public static boolean search(String name, char target,int start,int end){
        if (name.length() == 0){
            return false;
        }

        for (int i = start; i <=end; i++) {
            char recentChar = name.charAt(i);
            if (recentChar == target){
                return true;
            }
        }

        return false;
    }
}
