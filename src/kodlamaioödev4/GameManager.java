package kodlamaioödev4;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Game added to db : "+game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted from db : "+game.getName());
		
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated : "+game.getName());
		
		
	}
{

	}

}
