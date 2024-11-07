package AllElse;

public class HIndexLeet {
    public static void main(String[] args) {
        int[] arr = {1,2,100};
        System.out.println(hIndex(arr));
    }
    public static int hIndex(int[] citations) {
        if(citations.length == 1){
            if(citations[0] == 0){
                return 0;
            }else{
                return 1;
            }
        }

        for(int i = 0; i < citations.length;i++){
             int currentElement = citations[i];
            if(currentElement== 0){
                continue;
            }
            int count = citations.length - i;
            if((count <= currentElement)&&(count!=1) ){
                return count;
            }
        }
        if(citations[citations.length-1] == 0){
            return 0;
        }

        return 1;
    }
}
