import java.util.Scanner;
public class NitOrz {
    public static void main(String[] args) {
        NitOrz solver = new NitOrz();
        int t,n,z;
        Scanner in = new Scanner(System.in);
        t=in.nextInt();
        int[]sol = new int[t];
        while(t>0){
            n=in.nextInt();
            z=in.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            solver.orz(a,z,sol,t);
            t--;
        }
        for(int i=sol.length-1;i>=0;i--){
            System.out.println(sol[i]);
        }
    }
    public void orz(int[] a,int z,int[]sol,int t){
        for(int i=0;i<a.length;i++){
            a[i]=a[i]|z;
            z=a[i]&z;
        }
        int max=0;
        for(int i:a){
            if(i>max){
                max=i;
            }
        }
        sol[t-1]=max;
    }
}