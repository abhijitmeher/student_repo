public class Student {

    private Integer sid;
    private String name;
    private String email;
    private String address;
    private String gender;
    private Long mobile;
    private Course course;

    public  Student(){
        
    }

    public Student(Integer sid, String name, String email, String address, String gender, Long mobile, Course course) {
        this.sid = sid;
        this.name = name;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.mobile = mobile;
        this.course = course;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", address=" + address + ", gender="
                + gender + ", mobile=" + mobile + ", course=" + course + "]";
    }
    
}
