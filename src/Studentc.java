public class Studentc
{
    public static void main(String[] args) {
        StudentBase st1 = new StudentBase("yeger",2006);
        System.out.println("before: "+st1.getName());
        st1.setName("kofico");
        System.out.println("after: "+st1.getName());
        StudentBase st2 = new StudentBase("daniel", 1999);
        StudentBase st3 = new StudentBase("yona", 1999);
    }
}
