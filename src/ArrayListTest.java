import java.util.ArrayList;
import java.util.Random;

public class ArrayListTest {
    public static ArrayList<String> create(int n){
        Random random = new Random();
        ArrayList<String> res = new ArrayList<>();
        while(res.size() < n){
            int rand = random.nextInt(100);
            String str = "";
            for(int i=0; i<rand; i++){
                int rand_char = random.nextInt(32, 126);
                char ch = (char)rand_char;
                str = str + ch;
            }

            res.add(str);
        }
        return res;
    }

    public static void add(ArrayList l, String s){
        l.add(s);
    }

    public static void empty(ArrayList l){
        int res = l.size()-1;
        for(int i=res; i>-1;i--){
            l.remove(i);
        }
    }


    public static void display(ArrayList l){
        for(Object e: l){
            System.out.println("element: " + e);
        }
    }





    public static void main(String[] args){
        ArrayList<String> res = create(5);
        display(res);
        add(res, "emile");
        display(res);
        empty(res);
        display(res);
    }




}
