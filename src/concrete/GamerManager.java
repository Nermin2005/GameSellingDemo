package concrete;

import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService {
    @Override
    public void register(Gamer gamer) {
        if(!gamer.getFirstName().isEmpty() && !gamer.getLastName().isEmpty() && !gamer.getNationalityId().isEmpty()
        && gamer.getDateOfBirth()!=null) {
            System.out.println(gamer.getFirstName()+" siz qeyd olundunuz.");
        }
        else {
            System.out.println("Melumatlar tam deyil.");
        }
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" sizin hesabiniz guncellendi.");
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" sizin hesabiniz silindi");
    }
}
