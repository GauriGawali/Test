package ExamAssignment20August2022;

public class PersonIdMain {

	public static void main(String[] args) {
		
		IdProof idf=new IdProof();
		idf.setIname("Adhar Card");
		idf.setNumber("5442 5896 421");
		idf.setValidity("24/8/2025");
		
		Person p=new Person();
		p.setId(1);
		p.setName("Gauri");
		p.setAddress("Pune");
		p.setContact("9890846059");
		p.setIdf(idf);
		
		
		if((p.getAddress().equals("Pune")) && (p.idf.getIname().equals("Adhar Card"))) {
		
				System.out.println(p.getName()+"\n"+p.getAddress()+"\n"+p.getContact()+"\n"+p.idf.getIname()+"\n"+p.idf.getNumber()+"\n"+p.idf.getValidity());
			
				
	
		
	}
	}
}

