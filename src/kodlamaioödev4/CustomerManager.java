package kodlamaioödev4;

public class CustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println("Customer added : "+customer.getFirstName());
		
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Customer deleted : "+customer.getFirstName()+" "+customer.getLastName());

		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Customer updated : "+customer.getFirstName());

		
	}
	

}
