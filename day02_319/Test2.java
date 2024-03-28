public class Test2{
  public static void main(String[] args){
    //定义三个int 变量x、y、z
    int x = 1,y = 2,z = 3,t;
    t = x>y ? x : y;
    System.out.println("最大值:"+(t>z ? t : z));
  }
}