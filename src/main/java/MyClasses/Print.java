package MyClasses;

/**
 * Created by Yo on 23/3/2018.
 */
public abstract class Print {

    public static void msg(String m){
        System.out.println(m);
    }

    public static void msgTab(String m){
        System.out.println(m);
        System.out.println("");
    }

    public static void tabMsg(String m){
        System.out.println("");
        System.out.println(m);
    }

    public static void tabMsgTab(String m){
        System.out.println("");
        System.out.println(m);
        System.out.println("");
    }
    public static void tabMsgTab(int m){
        System.out.println("");
        System.out.println(m);
        System.out.println("");
    }

}
