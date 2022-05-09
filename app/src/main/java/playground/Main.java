package playground;


class Student {
    private String id;    // 学籍番号
    private String name;  // 名前
    private int grade;    // 成績

    public Student(String id, String name, int grade) {
        this.set(id, name, grade);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        if (grade > 100) {
            this.grade = 100;
        } else this.grade = Math.max(grade, 0);
    }

    public void set(String id, String name, int grade) {
        this.setId(id);
        this.setName(name);
        this.setGrade(grade);
    }

    public void print() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Grade: " + grade);
    }

    public void printShort() {
        System.out.println(id + ", " + name + ", " + grade);
    }
}

class Lesson {
    private String name;    // 課題名
    private String teacher; // 担当者
    private int max;        // 最大履修者数
    private int num;        // 登録履修者数
    private Student[] st;   // Studentの配列

    public Lesson(String name, String teacher, int max) {
        this.name = name;
        this.teacher = teacher;
        this.max = max;
        this.num = 0;          // numは0に初期化
        this.st = new Student[max]; // 配列の確保(オブジェクトは別に生成する必要あり)
    }

    public void add(Student s) {
        this.st[this.num++] = s;
    }

    public void print() {
        System.out.println("Lesson            : " + this.name);
        System.out.println("Teacher           : " + this.teacher);
        System.out.println("Number of Students: " + this.num);
        for (int i = 0; i < this.num; i++) {
            this.st[i].printShort();
        }
        System.out.println("----------");
    }
}

public class Main {
    public static void main(String[] args) {
        Lesson l = new Lesson("Pro Enshu", "Yanai", 100);
        l.add(new Student("01220", "Dentsu Taro", 80));
        l.add(new Student("012205", "Uec Jiro", 54));
        l.add(new Student("012207", "Chofu Saburo", 70));
        l.add(new Student("012210", "Enshu Shiro", 60));
        l.print();
    }
}

/*　実行結果
Lesson            : Pro Enshu
Teacher           : Yanai
Number of Students: 4
01220, Dentsu Taro, 80
012205, Uec Jiro, 54
012207, Chofu Saburo, 70
012210, Enshu Shiro, 60
----------
*/