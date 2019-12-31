
package ch6;

import java.sql.SQLOutput;

public class Exercise6_4 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름:"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("평균:"+s.getAverage());

        Student t=new Student("김철수",2,3,20,30,40);
        System.out.println(t.info());
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int getTotal(){
        return kor+eng+math;
    }
    float getAverage(){
        float a=Math.round((kor+eng+math)/3.0*10.0);
        return a/10;
    }
    Student(){ }
    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name=name;
        this.ban=ban;
        this.no=no;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }
    String info(){
        return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
    }
}


