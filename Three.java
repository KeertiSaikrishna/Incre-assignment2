public class Three {

    Three(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        Three[] obj = new Three[3];
        obj[0] = new Three("hello");
        obj[1] = new Three("hie");
        obj[2] = new Three("hey there");
    }
}
