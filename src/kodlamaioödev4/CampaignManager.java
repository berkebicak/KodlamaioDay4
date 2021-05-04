package kodlamaioödev4;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("campaign added");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("campaign deleted");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("campaign updated");
	}

}
