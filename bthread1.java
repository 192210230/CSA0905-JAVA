class athread implements Runnable
{
 public void run()
 {
      for(int i=1;i<=10;i++)
      { 
       System.out.println(13+"*"+i+"="+13*i);
      }
  }
   
}
class bthread1 implements Runnable
{
 public void run()
 {
      for(int i=1;i<=10;i++)
      { 
       System.out.println(17+"*"+i+"="+17*i);
      }
  }
 public static void main(String args[])
 {
  athread a= new athread();
  Thread t1= new Thread(a);
  bthread1 b= new bthread1();
  Thread t2= new Thread(b);
  t1.start();
  t2.start();
 }
}

