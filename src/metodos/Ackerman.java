package metodos;

public class Ackerman {
    
    public static int ackerman(int m, int n){
        int acker = 0;
        if(m==0){
            acker += n+1;
        }else{
            if(n == 0){
                acker += ackerman(m-1,1);
            }else if(m > 0 && n > 0){
                acker += ackerman(m-1,ackerman(m,n-1));
            }
        }
        return acker;
    }
}