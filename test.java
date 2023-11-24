import java.util.Arrays;
import java.util.Collections;

public class test {
        public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        Integer[] citationsInteger = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(citationsInteger, Collections.reverseOrder());
         int count = 0;
         for(int i=1;i<=citations.length;i++){
             if(i<=citations[i-1]){
                 count++;
             }
             else{
                break;
             }
         }
         return count;
    }
    public static void main(String[] args){
        int[] citations = {1,3,1};
        int result=hIndex(citations);
        System.out.println(result);
    }
}
