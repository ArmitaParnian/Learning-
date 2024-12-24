
    public class CourseNotFoundException  extends  Exception{
        public CourseNotFoundException(){
            super("Course not found");
        }
        public CourseNotFoundException(String message){
            super(message);
        }

    }


