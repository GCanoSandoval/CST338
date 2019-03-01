import java.util.HashMap;

public class Kobold extends Monster
{
    public Kobold(int maxHP, int xp, HashMap<String, Integer> items)
    {
        super(maxHP, xp, items);
    }

    @Override
    public String toString()
    {
        return "Kobold has: " + super.toString();
    }

}