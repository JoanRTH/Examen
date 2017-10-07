public class ComvEnteros {
    public  void ComManual(int n){
        int a,b=0;
        a = n % 2; 
            b = a + b;
            n = n /  2;
            
            a = n % 2; 
            b = a + b;
            n = n /  2;
            System.out.println("valor" + a+b);
    }
    
    public void ComWhile(long n){
        long a;
        String x = "";
        while(n > 0)
        {
            a = n % 2; 
            x = a + x;
            n = n /  2;
        }
        System.out.println("numero Bunario con While: "+x);
    }
    
    public long ComN(int n){
        
        if (n < 2){
            return n;
        }
        else {
            return n%2 + ComN(n/2) * 10;
        }  
        /*if ( n < 2){
            System.out.print(n);
        }else{
            ComN(n/2);
            System.out.print(n%2);
          
        }*/
    }
}
