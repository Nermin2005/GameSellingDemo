package concrete;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void enter(Campaign campaign) {
        System.out.println(campaign.getName()+" daxil olundu.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getName()+" guncelllendi.");

    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getName()+" kampaniyasi silindi.");
    }
}
