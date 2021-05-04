package kodlamaioödev4;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game(1,"Counter Strike",120);
		Game game2 = new Game(2,"Devour",25);
		Campaign campaign = new Campaign(4,"Kodlamaio %20 Discount",20);
		Customer customer1 = new Customer("Berke","Býçak","212121211","1999");
		Customer customer2 = new Customer("Engin","Demirog","484848484","1990");

		
		CustomerService customerService = new CustomerManager();
		customerService.add(customer1);
		customerService.delete(customer2);
		
		GameService gameService = new GameManager();
		gameService.add(game1);
		gameService.delete(game2);
		
		CampaignService campaignService = new CampaignManager();
		campaignService.add(campaign);
		
		SellService sellService = new SellManager();
		sellService.sale(game1, customer2);
		sellService.sale(game2, customer1, campaign);
		
		CustomerCheckService check = new CustomerCheckService();
		check.checkIfCustomer(customer1);
		check.checkIfCustomer(customer2);
		
	}

}
