package concrete;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerCheckManager implements GamerCheckService {
    private GamerCheckService gamerCheckService;
    public GamerCheckManager(GamerCheckService gamerCheckService) {
        this.gamerCheckService=gamerCheckService;
    }
    @Override
    public boolean checkService(Gamer gamer) {
        return gamerCheckService.checkService(gamer);
    }
}
