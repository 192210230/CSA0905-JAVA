class athread extends Thread
{
 public void run()
 {
  try
     {
      for(int i=1;i<=5;i++)
      { 
       System.out.println(i+"*7="+i*7);
       Thread.sleep(1000);
      }
  }
  catch(InterruptedException e)
  { 
   System.out.println(e);
  }
}
class bthread extends Thread
{
 public void run()
 {
  try
     {
      for(int i=1;i<=5;i++)
      { 
       System.out.println(i+"*9="+i*9);
       Thread.sleep(2000);
      }
  }
  catch(InterruptedException e)
  { 
   System.out.println(e);
  }
}
 public static void main(String args[])
 {
  athread obj=new athread();
  bthread obj1=new bthread();
  obj.start();
  obj1.start();
 }
}