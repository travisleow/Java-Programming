public class Student {
    private String name, adminNo, course;
    private int age;

    public Student(String name, String adminNo, String course, int age) {
        this.name = name;
        this.adminNo = adminNo;
        this.course = course;
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the adminNo
     */
    public String getAdminNo() {
        return adminNo;
    }

    /**
     * @param adminNo the adminNo to set
     */
    public void setAdminNo(String adminNo) {
        this.adminNo = adminNo;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentInfo(){
        return "Name: " + getName() + "\nAdmin no: " + getAdminNo() + "\nCourse: " + getCourse() + "\nAge: " + getAge();
    }
}