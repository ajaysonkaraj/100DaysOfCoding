

class CongruentEqu{
    public static void main(String[] args){
        int num[] = {3,4,5};
        int rem[] = {2,3,1};
        int x = 1 , k=rem.length;
        while(x<1000){
            int i;
            for ( i = 0 ; i<k;i++){
                if (x%num[i]!= rem[i]){
                    break;
                }
            }
            if(i==k){
                System.out.println(x);
            }
            x++;
        }

    }
}