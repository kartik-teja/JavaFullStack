package week1_2;

public class Author {
	private String name, email;
	private char gender;
	
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
    	return "Author[name: "+getName()+", email: "+getEmail()+", gender: "+getGender()+"]";
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a = new Author("Charan","Charan@gmail.com",'M');
		
		System.out.print(a);
	}

}
