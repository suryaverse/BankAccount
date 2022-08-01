import java.util.Scanner;
import javax.lang.model.element.Name;
import javax.lang.model.util.ElementScanner14;
import javax.security.auth.login.AccountException;
import javax.xml.transform.Result;
public class BankAccount
 {
       String name;
       String acctype;
       int age;
       String accno;
       float salary;
       char zone;
       boolean status;
       Scanner sc =new Scanner(System.in);

    public String  getName()
      {
          return name;
      }
    public String getAccType()
      {
          return acctype;
      }
    public int getAge()
      {
          return age;
      }
    public String getAccNo()
      {
         return accno;
      }
    public float getSalary()
      {
          return salary;
      }
    public char getZone()
      {
          return zone;
      }
    public boolean getEmployment()
      {
          return status;
      }
    public void setName( String Name)
      {
        this.name=Name;
      }
    public void setAccType( String AccType)
      {
         this.acctype=AccType;
      }
    public void setAccNo( String AccNo)
      {
        this.accno=AccNo;
      }
    public void setAge( int Age)
      {
        this.age=Age;
      }
    public void setZone (char Zone)
      {
        this.zone=Zone;
      }
    public void setSalary (float Salary)
      {
       this.salary=Salary;
      }

    public void setEmployment (Boolean isworking)
      {
        this.status=isworking;
      }
            public static void main(String args []) 
            {
                 Scanner sc =new Scanner(System.in);
                 System.out.println("HOW MANY CUSTOMER DO YOU WANT TO STORE ?");
                 int a = sc.nextInt();
                 BankAccount account[]=new BankAccount[a];
                 for(int i=0;i<a;i++)
                  {
                    account[i]=new BankAccount();
                    account[i].OpenAccount();
                  }
                  int b=1;
                  do
                    {
                      System.out.println("\n------WELCOME------");
                      if(b!=1||b!=2)
                      {
                      System.out.println("***invalid Choice***\n    Renter Choice");
                      }
                      System.out.println("\n 1.To Find Account\n 2.Exit");
                      System.out.println("\nEnter Your Choice 1 or 2 ");
                      b=sc.nextInt();
                   
                      
                      switch (b)
                         {
                           case 1:
                               System.out.println("Enetr Account Number Want to Search");
                               String acc_no=sc.next();
                               boolean found = false;
                               for (int i=0;i<a;i++)
                                {
                                 found = account[i].search(acc_no);
                                  if (found)
                                   {
                                     break;
                                   }
                                }
                                  if(!found)
                                  {
                                   System.out.println("*****Invalind Account NO*****");
                                  }
                                  break;
                           }
                    }
                     
                     while (b==1||b!=2);
                     System.out.println("-----THANK YOU-----");
                     sc.close();
               }    
                
                public boolean NameValidation()
                  {
                      String Name;
                      System.out.println("Enter Your Name");
                      Name=sc.nextLine();
                      String regex = "^[a-zA-Z]*$";
                      boolean result =Name.matches(regex);
                      if(result)
                      {
                        System.out.println(Name);
                        setName(Name);
                        return true;
                      }
                      else
                        { 
                          System.out.println("Given Name is not valid");
                          NameValidation();
                        }
                        return true;
                  }
                
               public boolean AccTypeValidation()
                 {
                     
                      System.out.println("Enter Your Account Type");
                      String AccType=sc.nextLine();
                      String regex = "^[a-zA-Z]*$";
                      boolean result = AccType.matches(regex);
                      if(result)
                      {
                        System.out.println(AccType);
                        setAccType(AccType);
                        return true;
                      }
                     
                      else
                        {
                           System.out.println("Given AccountType is invalid");
                           AccTypeValidation();
                        }
                        return true;
                  }
                    
                public boolean AgeValidation()
                 {
                     int Age;
                     System.out.println("Enter Age");
                     String tempAge=sc.nextLine();
                     String regex ="[0-9]+";
                     boolean result = tempAge.matches(regex);
                     if(result)
                       {
                         Age=Integer.parseInt(tempAge);
                         System.out.println(Age);
                         setAge(Age);
                         return true;
                       }
                     else
                       {
                         System.out.println("Given Age is invalid");
                         AgeValidation();
                       }
                       
                        return true;
                  }
                
               public boolean AccNoValidation()
                 {
                      System.out.println("Enter Account No");
                      String AccNo=sc.nextLine();
                      String regex ="[0-9]+";
                      boolean result =AccNo.matches(regex);
                      if(result)
                        {
                          System.out.println(AccNo);
                          setAccNo(AccNo);
                          return true;
                        }
                      else
                        {
                          System.out.println("Given Account No is invalid");
                          AccNoValidation();
                        }
                         return true; 
                  }
                  
               public boolean ZoneValidation() 
                 { 
                     System.out.println("Enter Zone");
                     String tempZone=sc.nextLine();
                     String regex ="[a-d]";
                     boolean result = tempZone.matches(regex);
                     char Zone;
                  
                     if(result)
                     {
                       Zone =tempZone.charAt(0);
                       System.out.println(Zone);
                       setZone(Zone);
                     }
                     else
                       {
                          System.out.println("Given Zone is invalid");
                          ZoneValidation();
                       }
                      return true;  
                  }
                  
               public boolean SalaryValidation()
                 {
                     float Salary;
                     System.out.println("Enter Salary");
                     String tempSalary=sc.nextLine();
                     String regex ="[0-9]+";
                     boolean result = tempSalary.matches(regex);
                       if(result)
                        {
                          Salary =Float.parseFloat(tempSalary);
                          System.out.println(Salary);
                          setSalary(Salary);
                          return true;
                        }
                       else
                        {
                          System.out.println("Given salary is invalid");
                          SalaryValidation();
                        }
                      return true;    
                 }
                  
             public boolean EmployementValidation()
                { 
                        System.out.println("Is Working ? ");
                        String input=sc.nextLine();
                        if(input.equals("YES")||input.equals("TRUE")||input.equals("Y")||input.equals("yes")) 
                        {
                          boolean isworking=false;
                          setEmployment(isworking);
                          return true;
                        }
                        else
                        {
                           System.out.println("Given value id invalid");
                        }
                        EmployementValidation();
                        return true;
                }
            
             public void OpenAccount() 
                {
                   NameValidation();
                   AccNoValidation();
                   AccTypeValidation();
                   AgeValidation();
                   SalaryValidation();
                   ZoneValidation();
                   EmployementValidation();
               }             
             public void ShowAccount() 
               {   
                   System.out.println("Account No - "+getAccNo());    
                   System.out.println("Name - "+getName());
                   System.out.println("Account Type - "+getAccType());
                   System.out.println("Age - "+getAge());
                   System.out.println("Salary is - "+getSalary());
                   System.out.println("Zone is - "+getZone());
                   System.out.println("Is Working - "+getEmployment());
               }
             public boolean search (String acc_no) 
                   {
                     if (accno.equals(acc_no))
                       {
                        ShowAccount();
                        return(true);
                       }
                        return(false);
                   }
}
