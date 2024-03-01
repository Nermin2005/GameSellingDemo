import concrete.CampaignManager;
import concrete.GamerManager;
import concrete.SellingManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2005,07,31);
        Gamer gamer=new Gamer(1,"Nermin","Memmedli","36982379",localDate);
        GamerManager gamerManager=new GamerManager();
        gamerManager.register(gamer);
        Game game=new Game(1,"Brawl Stars",100);
        Campaign campaign=new Campaign("1 alana 1i bedava","kampaniya",50);
        SellingManager sellingManager=new SellingManager();
        sellingManager.enter(campaign,gamer,game);
    }
}