public class Test {

    public static void main(String[] args) {

        Course course = new Course();
        course.setCid(101);
        course.setCourseName("FullStack Java");
        course.setCoursePrice(49999.00);
        course.setCourseDuration("* Months");

        Student student = new Student();
        student.setSid(101);
        student.setName("Abhijit Meher");
        student.setEmail("abhijitmeher645@gmail.com");
        student.setAddress("Hyderabad");
        student.setGender("Male");
        student.setMobile(9692910264L);
        student.setCourse(course);

        System.out.println(student);

        student.setName("Payal Meher");
        student.setEmail("payalmeher8537@gmail.com");
    
        System.out.println(student);
    }
}
