abstract  class User {
    String userId;
    String userName;
    String email;
    int Age;
    public String Name(){return userName;}
    public String Id(){return userId;}
    public int age(){return Age;}
    public int getStudents(){
        return Age;
    }
    public User(String userId,String name,String email,int Age){
        this.userId=userId;
        this.userName=userName;
        this.email=email;
        this.Age = Age;
    }

    public void viewDetails() {
        viewDetails();
    }

    public String toString(){
        {
            return "Person:{"+
                    "Name:" + userName
                    +",Email:" + email
                    +",ID:" + userId
                    +"}";
        }
    }
}
