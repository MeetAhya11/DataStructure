import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=Integer.parseInt(sc.next());
        String[] res_arr=new String[tc];
        for (int i=0;i<tc;i++) {
                    /*
                    2 1 2  ->2 size of string(N); 1->A(inter-dis);2->B(inter state)
                    00  0->one dis to another dis   1->crossing 1 st to another st
                    * */
            int A = Integer.parseInt(sc.next());
            int B = Integer.parseInt(sc.next());
            int C = Integer.parseInt(sc.next());
            int D = Integer.parseInt(sc.next());
            int E = Integer.parseInt(sc.next());

            if ((A + B <= D && C <= E) || (B + C <= D && A <= E) || (C + A <= D && B <= E)) {
                res_arr[i] = "YES";
            }
            for (String s : res_arr) {
                System.out.println(s);
            }


        }
    }
}
