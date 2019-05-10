package test;

/**
 * 用于存储扑克牌的花色和牌面
 */
public class Poker {
    private String tag;     // 图片扑克花色的表示（代表的是红桃H 、黑桃S ,梅花C 、方块D
    private String num;        // 表示扑克牌面的大小  2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K, A

    public Poker(){

    }
    public Poker(String tag, String num)
    {
        this.num = num;
        this.tag = tag;
    }

    public String getNum()
    {
        return num;
    }

    public void setNum(String num)
    {
        this.num = num;
    }

    public void setTag(String tag)
    {
        this.tag = tag;
    }

    public String getTag()
    {
        return tag;
    }

    public String toString()
    {
        return " tag: " + this.tag +" num: " + this.num;
    }

}
