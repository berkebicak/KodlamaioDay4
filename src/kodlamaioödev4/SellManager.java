package kodlamaioödev4;

public class SellManager implements SellService {

	@Override
	public void sale(Game game, Customer customer) {
		System.out.println(game.getName()+" is sold to "+customer.getFirstName()+" Thanks !");
		
	}

	@Override
	public void sale(Game game, Customer customer, Campaign campaign) {
		
		double newPrice = game.getPrice() - ( game.getPrice() * ((double) campaign.getDiscount() / 100));
		System.out.println(game.getName()+" is sold to "+newPrice+" TL to "+customer.getFirstName()+" with "+campaign.getCampaignName()+" Campaign ");
		
		
	}
	

}
