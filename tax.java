Scanner input=new Scanner(System.in);
int income=input.nextInt();
float tax;
if(income<=150000)
 System.out.println("No tax");
else if(income>=150001 && income<=300000)
 System.out.println("Tax= "+income/10);
