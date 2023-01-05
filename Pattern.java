AAA
BBB
CCC
public class MyClass {
    public static void main(String args[]) {
      char ip='A';
      for(int i=1;i<=3;i++)
      {
        for(int j=1;j<=3;j++)
        { 
            System.out.print(ip);
        }
        ip++;
        System.out.println();
      }
    }
}

ABC
DEF
GHI
public class YourClassNameHere {
    public static void main(String[] args) {
      char ip='a';
      for(int i=1;i<=3;i++)
      {
        for(int j=1;j<=3;j++)
        { 
            System.out.print(ip++);
        }
        System.out.println();
      }
    }
}

