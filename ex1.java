import java.util.*;  
class ex1 
{
    public static void main(String[] args) 
    {
        String str1;
        String str2;
        
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the first string : ");
        str1 = sc.nextLine(); 
        System.out.print("Enter the second string : ");
        str2 = sc.nextLine();
        
        System.out.print("The length of the first string is "+str1.length()+"\n");  
        System.out.print("The length of the second string is "+str2.length()+"\n");  
        
        if(str1.length()==str2.length())
        {
            System.out.print("The length of the two strings are the same"+"\n");
        }
        else
        {
            System.out.print("The length of the two strings is not the same"+"\n");
        }
        
        if(str1.equals(str2))
        {
            System.out.print("Two strings are equal"+"\n");
        }
        else
        {
            System.out.print("Two strings are not equal"+"\n");
        }
        
    }
}