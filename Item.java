/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    private String description;
    private int weight;
    
    /**
     * Constructor for objects of class Item
     */
    public Item(String description, int weight)
    {
        this.description = description;
        this.weight = weight;
    }
    
    public String itemDescription()
    {
        return description;
    }
    
    public int itemWeight()
    {
        return weight;
    }
}
