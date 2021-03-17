package by.anton.core.nested_classes.local_inner;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math=new Math();
        math.getResult();
    }


}

class Math{
    public void getResult(){

        class Delenie{
            private int delimoe;
            private int delitel;
            public int getChastnoe(){
                return delimoe/delitel;
            }
            public int getOstatok(){
                return delimoe%delitel;
            }
            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
        }
        Delenie delenie=new Delenie();
        delenie.delimoe=4;
        delenie.delitel=3;
        int del=delenie.getDelimoe();
        int ost=delenie.getOstatok();
        System.out.println(del+" и остаток от деления "+ost);
    }
}