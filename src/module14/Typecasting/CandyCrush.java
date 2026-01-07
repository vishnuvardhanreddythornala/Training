package module13.Typecasting;

class level1{
    void level_1(){
        System.out.println("This is the level 1");
    }
}
class level2 extends level1{
    void level_2(){
        System.out.println("This is the level 2");
    }
}
class level3 extends level2{
    void level_3(){
        System.out.println("This is the level 3");
    }
}
class level4 extends level3{
    void level_4(){
        System.out.println("This is the level 4");
    }
}

public class CandyCrush {
    public static void main(String[] args){
        System.out.println("---Level 1---");
        level1 ref1 = new level4();
        ref1.level_1();
        System.out.println("---Level 2---");
        level2 ref2 = (level2)ref1;
        ref2.level_1();
        ref2.level_2();
        System.out.println("---Level 3---");
        level3 ref3 = (level3) ref2;
        ref3.level_1();
        ref3.level_2();
        ref3.level_3();
        System.out.println("---Level 4---");
        level4 ref4 = (level4)ref3;
        ref4.level_1();
        ref4.level_2();
        ref4.level_3();
        ref4.level_4();
    }
}