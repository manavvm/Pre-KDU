import java.util.*; 
class ex2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();
        HashSet<String> set=new HashSet();
        HashMap<String,Integer> map=new HashMap<String,Integer>();
            
        for(int i=0;i<10;i++)
        {
            String str;
            System.out.print("Enter the string no "+(i+1)+" :");
            str=sc.nextLine();
            list.add(str);
            set.add(str);
            Integer num = map.get(str);
            if(num==null)
            {
                map.put(str,1);
            }
            else 
            {
                map.put(str,num+1);
            }
        }
        
        System.out.println("List contains:");
        for(String st:list)
        {
            System.out.println(st);
        }
        System.out.print("\n");
        
        System.out.println("Set contains:");
        for(String st:set)
        {
            System.out.println(st);
        }
        System.out.print("\n");
        
        System.out.println("Frequency of the words:");
        for(Map.Entry<String,Integer> e:map.entrySet())
        {
            System.out.println("Word = "+e.getKey()+" , Frequency = "+e.getValue());
        }
        
    }
}