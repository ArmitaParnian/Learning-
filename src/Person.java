 abstract class Person {

        String id;
        String name;
        String email;
        int Age;
        public String Name(){
            return name;
        }
        public String Id(){
            return id;
        }
        public int age(){
            return Age;
        }
        public int getStudents(){
            return Age;
        }
        public Person(String id,String name,String email,int Age){
            this.id=id;
            this.name=name;
            this.email=email;
            this.Age = Age;
    }

    public void ShowDetails() {
        ShowDetails();
    }

    public String toString(){
        {
            return "Person:{"+
                    "Name:" + name
                    +",Email:" + email
                    +",ID:" + id
                    +"}";
        }
    }
}
