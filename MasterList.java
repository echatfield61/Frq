import java.util.*;

public class MasterList 
{
    private ArrayList<PopcornOrder> orders;
    public MasterList()
    {
        orders = new ArrayList<PopcornOrder>();
    }

public void addOrder(PopcornOrder x)
{
    orders.add(x);
}
public int getTotalOrders()
{
    if (orders.size() == 0)
    {
        return 0;
    }
    else
    {
        int t = 0;
        for (PopcornOrder x : orders)
        {
            t+=x.getNumOrdered();
        }
        return t;
    }
}
public int removeVariety(String v)
{
    int c = 0;
    for (int x = orders.size(); x>=0; x--)
    {
        if (orders.get(x).getVariety().equals(v))
        {
            orders.remove(x);
            c++;
        }
    }
    return c;
}
public String toString()
{
    if (orders.size() == 0)
    {
        return "This order is empty";
    }
    else
    {
        String s = "This Order consists of ";
        for (PopcornOrder x : orders)
        {
            {
            s += x.getNumOrdered()+ " " + x.getVariety();
            s += " , ";
            }
        }
        return s;
    }
}
public static void main(String[] args) 
{
    MasterList popcorn2023 = new MasterList();
    MasterList popcorn2024 = new MasterList();
    PopcornOrder a = new PopcornOrder("Jalapeno Cheese", 1);
    PopcornOrder b = new PopcornOrder("Butter Microwave", 3);
    PopcornOrder c = new PopcornOrder("Butter Microwave", 2);
    PopcornOrder d = new PopcornOrder("Caramel with Sea Salt", 2);
    PopcornOrder e = new PopcornOrder("Caramel with Sea Salt", 5);
    PopcornOrder f = new PopcornOrder("Kettle Corn", 4);
    popcorn2023.addOrder(a);
    popcorn2023.addOrder(b);
    popcorn2023.addOrder(c);
    popcorn2023.addOrder(d);
    popcorn2023.addOrder(e);
    popcorn2023.addOrder(f);
    System.out.println(popcorn2023.getTotalOrders());
    System.out.println(popcorn2023.removeVariety("Butter Microwave"));
    System.out.println(popcorn2023.removeVariety("Sea Salt"));
    System.out.println(popcorn2023.removeVariety("Kettle Corn"));
    System.out.println(popcorn2023.toString());
    
    System.out.println(popcorn2024.getTotalOrders());
    System.out.println(popcorn2024.removeVariety("Butter Microwave"));
    System.out.println(popcorn2024.removeVariety("Sea Salt"));
    System.out.println(popcorn2024.removeVariety("Kettle Corn"));
    System.out.println(popcorn2024.toString());






}
}