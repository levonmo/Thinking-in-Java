package code_list_two;

//单一的工厂模式
public class ObjectO {
    public static void playGame(GameFactory gf) {
        Game game = gf.getGame();
        game.play();
    }

    public static void main(String[] args) {
        playGame(GameImpl.factory);
        playGame(GameImpl2.factory);
    }
}

interface Game {
    void play();
}

interface GameFactory {
    Game getGame();
}

class GameImpl implements Game {
    private GameImpl() {
    }//这里的构造器是私有的，不允许客户端调用该构造器

    public void play() {
        System.out.println("GameImpl.play");
    }

    public static GameFactory factory = new GameFactory() {
        public Game getGame() {
            return new GameImpl();
        }
    };
}

class GameImpl2 implements Game {
    private GameImpl2() {
    }

    public void play() {
        System.out.println("GameImpl2.play");
    }

    public static GameFactory factory = new GameFactory() {
        public Game getGame() {
            return new GameImpl2();
        }
    };
}
