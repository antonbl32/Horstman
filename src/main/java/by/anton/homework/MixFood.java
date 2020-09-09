package by.anton.homework;

import java.util.Arrays;
import java.util.LinkedList;

public class MixFood
{


    public static void main(String[] args) {
        Food[] mix1=new Food[4];
        LinkedList<Food> mix2 = new LinkedList<>();
        mix1[0]=new Food("Свекла",FoodType.VEGETABLES,15.4,1600);
        mix1[1]=new Food("Морковь",FoodType.VEGETABLES,65.4,200);
        mix1[2]=new Food("Свинина", FoodType.MEAT,216.2,600);
        mix1[3]=new Food("Соль",FoodType.SPICES,0,40);
        Recipe borsh=new Recipe("Борщ",mix1);
        System.out.println(borsh.toString());
        mix2.addAll(Arrays.asList(mix1));
        Arrays.sort(mix1);
        System.out.println(borsh.toString());


    }



}
