/**
 * @author hht
 * @date 2019/11/16 17:30
 */
public class Solution {
    public static int game(int[] guess, int[] answer) {
        int res=0;
        for(int i=0;i<3;i++){
            if((guess[i]^answer[i])==0) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int []guess={2,2,3};
        int []answer={1,2,3};
        System.out.println("猜对了"+game(guess,answer)+"次");
    }
}
