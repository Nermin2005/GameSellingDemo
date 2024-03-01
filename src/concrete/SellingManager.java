package concrete;

import abstracts.SellingService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SellingManager implements SellingService {

    @Override
    public void sell(Gamer gamer, Game game) {
        System.out.println(game.getName()+" oyunu "+gamer.getFirstName()+"-a satildi.");
    }

    @Override
    public void enter(Campaign campaign, Gamer gamer, Game game) {
        System.out.println(gamer.getFirstName()+" terefinden olan "+game.getName()+" oyununun "+campaign.getName()+" adli kampaniyasina " +
                "daxil olundu");
    }

    @Override
    public void update(Campaign campaign, Gamer gamer, Game game) {
        System.out.println(gamer.getFirstName()+" terefinden olan "+game.getName()+" oyununun "+campaign.getName()+" adli kampaniyasi " +
                "guncellendi");
    }

    @Override
    public void delete(Campaign campaign, Gamer gamer, Game game) {
        System.out.println(gamer.getFirstName()+" terefinden olan "+game.getName()+" oyununun "+campaign.getName()+" adli kampaniyasi " +
                "silindi");
    }
}
