public class sol{
    public String Payday(int x1, int r1, int x2, int r2) {
        // code here
        double a = x1;
        double b = r1;
        double c = x2;
        double d = r2;
        double interest1 = (b/100)*a;
        double interest2 = (d/100)*c;
        
        String result = "none";
        
        if(interest1==interest2){
            result="EQUAL";
        }
        if(interest1<interest2){
            result="B";
        }
        else if(interest1>interest2){
            result="A";
        }
        
        return result;
    }
    public static void main(String[] args) {
        int x1=1000;
        int r1=50;
        int x2=200;
        int r2=20;
        
        sol obj = new sol();
        String rs = obj.Payday(x1,r1,x2,r2);
        System.out.println(rs);

        
    }

}
