
public class Game
{
    final String game_name;
    final float price;
    final Publisher publisher;

    String genre = "rpg";
    String platform = "pc";
    int players = 1;

    public Game(String game_name, float price, Publisher publisher)
    {
        this.game_name = game_name;
        this.price = price;
        this.publisher = publisher;
    }

    public void print()
    {
//        System.out.println(this.game_name);
        // same as
        System.out.println(game_name);
        System.out.println(price);
        System.out.println(publisher.publisher_name);

    }


}
