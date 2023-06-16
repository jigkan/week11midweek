package homepage;

public class Replaceonechara {
    String name = "Meet";
    char expected_replaceword = 't';
    String actual_replaceword = "d";
    String temp_name = "";

    public void aa() {
        for (int i = 0; i < name.length(); i++) {
            char a = name.charAt(i);
            if (expected_replaceword == a) {
                temp_name = temp_name + actual_replaceword;
            } else {
                temp_name = temp_name + a;
            }
        }
        System.out.println(temp_name);

    }

    public static void main(String[] args) {
        Replaceonechara tt = new Replaceonechara();
        tt.aa();
    }

}
