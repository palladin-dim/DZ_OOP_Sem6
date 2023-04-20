public class User{
    private String name;

    public User(java.lang.String string){
        this.name = string;
    }

    public String getName(){
        return name;
    }

    public void save(){
        Persister persister = new Persister(this);
        persister.save();
    }

    public void report(){
        System.out.println("Report for user: " + name);
    }
}