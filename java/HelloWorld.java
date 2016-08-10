import java.util.Arrays;
import java.util.List;

public class HelloWorld
{
    public static void main(String[] args)
    {
        Publisher ubisoft = new Publisher("Ubisoft");
        Publisher bethesda = new Publisher("bethesda");
        Publisher rockstar = new Publisher("rockstar");

        Game assasinCreed = new Game("Assasin Creed", 0.40f, ubisoft);
        Game gta = new Game("Grand theft auto: San Andreas", 0.30f, rockstar);
        Game heroes = new Game("Heroes of Might and Magic 5", 0.80f, ubisoft);
        Game morrowind = new Game("The elder scrolls: Morrowind", 0.50f, bethesda);
        Game fallout4 = new Game("Fallout 4", 0.90f, bethesda);
        Game oblivion = new Game("Oblivion", 0.90f, bethesda);

        List<Game> games = Arrays.asList(assasinCreed, morrowind, gta, heroes, fallout4, oblivion);

        // the old way
//        for (int i = 0; i < games.size(); ++i) {
//            Game game = games.get(i);
//            game.print();
//        }

        double totaltPrice = games.stream()
            .filter(g -> g.publisher.publisher_name == "bethesda")
            .mapToDouble(g -> g.price)
            .sum();

        System.out.println(totaltPrice);

        // shorter way
//        games.stream().forEach(Game::print);

//        Game assasinCreed = new Game();
//        assasinCreed.game_name = "Assasin Creed";
//        assasinCreed.price = 0.40f;
//        assasinCreed.publisher =  ubisoft;
    }
}
