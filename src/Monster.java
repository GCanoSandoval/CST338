import java.util.HashMap;

public abstract class Monster
{
    private int hp;
    private int xp;
    private int maxHP;
    private HashMap<String, Integer> items;

    public int getHp()
    {
        return hp;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getXp()
    {
        return xp;
    }

    public void setXp(int xp)
    {
        this.xp = xp;
    }

    public int getMaxHP()
    {
        return maxHP;
    }

    public void setMaxHP(int maxHP)
    {
        this.maxHP = maxHP;
    }

    public HashMap<String, Integer> getItems()
    {
        return items;
    }

    public void setItems(HashMap<String, Integer> items)
    {
        this.items = items;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Monster)) return false;

        Monster monster = (Monster) o;

        if (getHp() != monster.getHp()) return false;
        if (getXp() != monster.getXp()) return false;
        if (getMaxHP() != monster.getMaxHP()) return false;
        return getItems().equals(monster.getItems());
    }

    @Override
    public int hashCode()
    {
        int result = getHp();
        result = 31 * result + getXp();
        result = 31 * result + getMaxHP();
        result = 31 * result + getItems().hashCode();
        return result;
    }

    @Override
    public String toString()
    {
        return "hp = " + hp + "/" + maxHP;
    }


    public Monster(int maxHP, int xp, HashMap<String, Integer> items)
    {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

}
