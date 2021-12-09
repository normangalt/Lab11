package builder;

public class Main {
    public static void main(String[] args){
        User user = User.builder().firstName("N").lastName("G").age(1).weight(20).height(20).gender(true).build();
        System.out.println(user.toString());
    }
}
