class Five extends Thread
{
 public void run()
 {
  try
     {
      	for(int i=1;i<=5;i++)
      	{ 
       	System.out.println(i+"*5="+i*5);
       	Thread.sleep(1000);
      	}
     }
  	catch(InterruptedException e)
  	{ 
   	System.out.println(e);
  	}
 }
}
class Ten extends Thread
{
 public void run()
 {
  try
     {
      	for(int i=1;i<=5;i++)
      	{ 
       	System.out.println(i+"*10="+i 10);
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
  Five obj= new Five();
  Ten obj1= new Ten();
  obj.start();
  obj1.start();
 }
}
