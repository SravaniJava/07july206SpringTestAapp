public class ArithematicProj {
    public int sum(int x, int y){
        int res= x + y;
        return res;
    }

    public static void main(String[] args) {
        System.out.println("test");
        ArithematicProj proj = new ArithematicProj();
        System.out.println("object creation is done");
        System.out.println("sum value is"+proj.sum(2,3));}
}
