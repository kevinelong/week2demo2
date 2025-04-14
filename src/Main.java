import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //what we have
        String fullName = "Kevin Ernest Long";

        //what we want
        //String[] nameList = {"Kevin", "Ernest", "Long"};

        //how? split!
        String[] nameList = fullName.split(" ");  // " " (space) is the delimiter, where we cut apart: parse.

        for(String n : nameList){
            System.out.println(n);
        }

        String[] fruit = {"Apple", "Banana", "Cherry"};
        String text = String.join(" ", fruit); // glue together
        System.out.println(text);

        //fast but not too wierd or sophisticated
        StringBuilder sb = new StringBuilder();
        sb.append("first");
        sb.append(" ");
        sb.append("second");
        sb.append(" ");
        sb.append("third");
        System.out.println(sb);

//        //slow but familar
//        String body1 = "";
//        body1 += "first ";
//        body1 += "second ";
//        body1 += "third";
//        System.out.println(body1);
//
//        // awkward but faster choice
//        ArrayList<String> body = new ArrayList<>();
//        body.add("first");
//        body.add("second");
//        body.add("third");
//        System.out.println(String.join(" ", body));

    }
}