public class ArithematicProj {
    int x;
    int y;
    ArithematicProj(int x, int y){
        this.x= x;
        this.y = y;
    }
    public int sum(int x, int y){
        int res= x + y;
        System.out.println("this is for sum result"+res);
        return res;
    }
    public int mul(int x, int y){
        int res = x * y;
        System.out.println("this is for mul result"+res);
        System.out.println("this is for testing");
        return  res;
    }
    /*this is written by vani*/
    public int sub(int x, int y){
        int res = x - y;
        System.out.println("value for the result of subtraction is " + res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println("test");
        ArithematicProj proj = new ArithematicProj(4, 5);
        System.out.println("object creation is done");
        System.out.println("sum value is"+proj.sum(proj.x, proj.y));
        System.out.println("sub value is "+proj.sub(proj.x,proj.y));
    }
}
