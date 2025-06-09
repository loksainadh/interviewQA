public class Akhil {


    //output =abbccc;

    public static void main(String[] args) {

        String s="1a2b3c";
        StringBuilder l=new StringBuilder();

        char[] ss = s.toCharArray();
        for(int i=0;i<ss.length-1;i++){
             if(Character.isDigit(ss[i])){
               int lo=  Integer.parseInt(String.valueOf(ss[i]));
              for (int k=0;k<lo;k++) {
                  l.append(ss[i + 1]);
                  System.out.println(l);
              }

               }

        }

        String ssss= new String(l);
        System.out.print(ssss);
    }
}



