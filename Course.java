public class Course {

    private Integer cid;
    private String courseName;
    private Double coursePrice;
    private String courseDuration;  

    public Course() {
        // super();
    }

    public Course(Integer cid, String courseName, Double coursePrice, String courseDuration) {
        this.cid = cid;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.courseDuration = courseDuration;
    }

    public Integer getCid() {
        return cid;
    }

    public String getCourseName() {
        return courseName;
    }

    public Double getCoursePrice() {
        return coursePrice;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCoursePrice(Double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    @Override
    public String toString() {
        return "Course [cid=" + cid + ", courseName=" + courseName + ", coursePrice=" + coursePrice
                + ", courseDuration=" + courseDuration + "]";
    }
    
}
