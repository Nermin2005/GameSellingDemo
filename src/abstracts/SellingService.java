package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SellingService {

    void sell(Gamer gamer, Game game);
    void enter(Campaign campaign,Gamer gamer,Game game);
    void update(Campaign campaign,Gamer gamer,Game game);
    void delete(Campaign campaign,Gamer gamer,Game game);


}
