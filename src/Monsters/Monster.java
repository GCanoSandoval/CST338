package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Random;

public abstract class Monster
{
    private int hp;
    private int xp;
    private int maxHP;
    private HashMap<String, Integer> items;
    int agi;
    int def;
    int str;
    Attack attack;

    public int getAgi()
    {
        return agi;
    }

    public int getDef()
    {
        return def;
    }

    public int getStr()
    {
        return str;
    }

    public Monster attackTarget(Monster monster)
    {
        return monster;
    }

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

    /*
     *This method returns an Integer value between min and max
     * This is bien pinche loco. rand.nextInt() returns a number between 0-n.
     * To get a value we want, a value between str-maxStr,
     * we need to get a random number from maxStr-str and add str back in.
     * @param min an integer
     * @param max an integer
     * @return a random integer between min and max
     */

    Integer getAttribute(Integer min, Integer max)
    {
        Random rand = new Random();
        if(min > max)
        {
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max-min) + min;
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
