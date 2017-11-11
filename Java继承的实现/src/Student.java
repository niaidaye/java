/**
 * Created with IntelliJ IDEA
 * Created By Kinsey
 * Date: 2017/11/9
 * Time: 23:42
 */
public class Student extends Person{
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void Student(){

    }
    public void tell(){
        System.out.print("ĞÕÃû:" + getName() + "ÄêÁä" + getAge());
        System.out.print("³É¼¨£º"+ getScore());
    }
}
