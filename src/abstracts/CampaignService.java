package abstracts;

import entities.Campaign;

public interface CampaignService {
    void enter(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
}
