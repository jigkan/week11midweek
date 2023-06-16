package homepage;

public class Reversename {

        //String Reverce
        static String s = "Jignesh";
        static String a= "";

        public static void aa(){
            for(int i=0;i<s.length();i++){
                a=s.charAt(i)+a;
            }

            System.out.println(a);
        }

        public static void main(String[] args) {
            aa();
        }
    }


