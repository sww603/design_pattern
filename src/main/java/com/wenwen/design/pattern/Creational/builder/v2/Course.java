package com.wenwen.design.pattern.Creational.builder.v2;

/**
 * Created by sww_6 on 2019/4/8.
 */
public class Course {
  private String courseName;
  private String coursePpt;
  private String courseVideo;
  private String courseArtical;
  private String courseQA;

  public Course(CourseBuild courseBuild) {
    this.courseName = courseBuild.courseName;
    this.coursePpt = courseBuild.coursePpt;
    this.courseVideo = courseBuild.courseVideo;
    this.courseArtical = courseBuild.courseArtical;
    this.courseQA = courseBuild.courseQA;
  }

  @Override
  public String toString() {
    return "Course{" +
        "courseName='" + courseName + '\'' +
        ", coursePpt='" + coursePpt + '\'' +
        ", courseVideo='" + courseVideo + '\'' +
        ", courseArtical='" + courseArtical + '\'' +
        ", courseQA='" + courseQA + '\'' +
        '}';
  }

  public static class CourseBuild{
    private String courseName;
    private String coursePpt;
    private String courseVideo;
    private String courseArtical;
    private String courseQA;

    public CourseBuild buildCourseName(String courseName) {
      this.courseName = courseName;
      return this;
    }

    public CourseBuild buildCcoursePpt(String coursePpt) {
      this.coursePpt = coursePpt;
     return this;
    }

    public CourseBuild buildCourseVideo(String courseVideo) {
      this.courseVideo = courseVideo;
      return this;
    }

    public CourseBuild buildCourseArtical(String courseArtical) {
      this.courseArtical = courseArtical;
      return this;
    }

    public CourseBuild buildCourseQA(String courseQA) {
      this.courseQA = courseQA;
      return this;
    }
    public Course build(){
      return new Course(this);
    }
  }
}
