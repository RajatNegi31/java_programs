public class basic {
    public static void main(String[] args){

        fibbnocai(10);
        prime_number(8);
    }

    public static void fibbnocai(int n){


        int n1=0;
        int n2=1;

        System.out.println(n1);
        System.out.println(n2);

        for(int i=1;i<=n;i++){
        int n3=n1+n2;
        System.out.println(n3);
        n1=n2;
        n2=n3;
    }
        
        

    }


    public static void prime_number(int n){
        int count=0;
        if(n>1){

            for(int i =2;i<n;i++){

                if(n%i==0){
                    count++;
                }
            }
        }

        if(count>0){
            System.out.println("non-prime");
        }
        else{
            System.out.println("prime");
        }
    }

}

