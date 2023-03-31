import java.util.*;
public class RoundRobin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>group=new ArrayList<>();
        ArrayList<Object> a=new ArrayList<>();
        ArrayList<HashMap<String,String>> map=new ArrayList<>();
        group.add("team1");
        group.add("team2");
        group.add("team3");
        group.add("team4");
        group.add("team5");
        Matches t1=new Matches(group.get(0));
        Matches t2=new Matches(group.get(1));
        Matches t3=new Matches(group.get(2));
        Matches t4=new Matches(group.get(3));
        Matches t5=new Matches(group.get(4));
        a.add(t1);
        a.add(t2);
        a.add(t3);
        a.add(t4);
        a.add(t5);
        new Matches(a);
    }
}
class Matches
{
    String team;
    Matches(String team)
    {
        this.team=team;
    }
    public String toString()
    {
        return team;
    }
    Matches(ArrayList<Object> obj)
    {
        for (int i = 0; i < obj.size(); i++) 
        {
            System.out.println("day " + (i + 1) + " Matches");
            for (int j = 0; j < obj.size() / 2; j++) 
            {
                int t1 = (i + j) % (obj.size() - 1);
                int t2 = (obj.size() - 1 - j + i) % (obj.size() - 1);
                if (j == 0) {
                    t2 = obj.size() - 1;
                }
                System.out.println(obj.get(t1) + " VS " + obj.get(t2));
            }
        }
    }
}
