public class characters {
    public String name;
    public String path;
    public int strength;
    public int constitution;
    public int intelligence;
    public int dexterity;
    public int wisdom;
    public int charisma;

    public characters(String clas, String x) {
        name = x;
        path = clas;
        strength = 0;
        constitution = 0;
        intelligence = 0;
        dexterity = 0;
        wisdom = 0;
        charisma = 0;
    }
}