import java.io.File;
import java.util.*;

public class ex3
{
    public static void main(String[] args) 
    {
        String filename="text.csv";
        File file = new File(filename);
        Scanner sc=new Scanner(file);
        
        Map<String,Integer> map=new HashMap<>();
        int count = 0;

        while(sc.hasNextLine()) 
        {
            String wordline=scanner.nextLine();
            String[] word=line.split(",");
            for(String w:word) 
            {
                map.put(w,map.getOrDefault(w,0)+1);
            }
        }
        sc.close();

        List<Map.Entry<String,Integer>> sortedlist=new ArrayList<>(map.entrySet());
        sortedlist.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println("3 MOST FREQUENT WORDS :");

        for(Map.Entry<String,Integer> ele:sortedlist) 
        {
            System.out.println(ele.getKey());
            count++;
            if(count == 3) 
            {
                break;
            }
        }
    }
}


