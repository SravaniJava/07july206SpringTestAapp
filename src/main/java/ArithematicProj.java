public class ArithematicProj {
    int x;
    int y;
    ArithematicProj(int x, int y){
        this.x= x;
        this.y = y;
    }
    public int sum(int x, int y){
        int res= x + y;
        return res;
    }
    /*this is written by vani*/
    public int sub(int x, int y){
        int res = y - x;
        return res;
    }

    public static void main(String[] args) {
        System.out.println("test");
        ArithematicProj proj = new ArithematicProj(4, 5);
        System.out.println("object creation is done");
        System.out.println("sum value is"+proj.sum(proj.x, proj.y));
    }
}
