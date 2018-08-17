public class con_overload {
    con_overload(){
        this("abcd");
        System.out.println("---first constructor---");
    }
    con_overload(String s){
        System.out.println("---Called constructor---");
    }
}
