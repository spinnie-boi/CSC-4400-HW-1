public class Salesman
{
    public String name;
    public int revenue;
    
    public Salesman(String n, int Revenue)
    {
        this.name = n;
        this.revenue = Revenue;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String n)
    {
        this.name = n;
    }
    
    public String display()
    {
        return (this.name + ": " + this.revenue);
    }
    
    public static Salesman[] topFive(Salesman[] sales)
    {
        int measure = 0;
        Salesman[] fiveGuys = new Salesman[5];
        for(int i = 0; i < sales.length; i++)
        {
            Salesman current = sales[i];
            for(int j = 0; j < 5; j++)
            {
                Salesman temp = fiveGuys[j];
                if(temp == null)
                {
                    fiveGuys[j] = current;
                }
                else if(current.revenue > temp.revenue)
                {
                    fiveGuys[j] = current;
                    current = temp;
                }
            }
            measure++;
        }
        return fiveGuys;
    }
}