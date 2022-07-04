package oop01_pracquiz;

public class Student {
    String name;    // 학생이름
    int ban;        // 반
    int no;         // 번호
    int kor;        // 국어 점수
    int eng;        // 영어 점수
    int math;       // 수학 점수

    Student(){}

    Student(String name,int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = ban;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String info() {
        int sum = kor + eng + math;
        float avg = ((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f);
        return name+","+ban+","+no+","+kor+","+eng+","+math+","+sum+","+avg;
    }

    public int getTotal() {
        return kor+eng+math;
    }

    public float getAverage() {
       return  ((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f);
    }
}
