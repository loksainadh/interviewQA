public class Primenumber {
    public boolean m1(int a){
                        for(int i=2;i<a;i++){
                            if(a%i==0){
                                return false;
                            }
                        }
        return  true;
    }


    public static void main(String[] args) {
        Primenumber n = new Primenumber();
        System.out.println(n.m1(99));







    }


}
