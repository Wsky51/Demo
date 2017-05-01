package com.wuyi.demo;

/**
 * Created by LENOVO on 2017/4/28.
 */
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;
    public static class Builder{
        private final int servingSize;
        private final int servings;

        private int calories;
        private int fat;
        private int carbohydrate;
        private int sodium;

        public Builder(int servingSize,int servings){
            this.servingSize=servingSize;
            this.servings=servings;
        }
        public Builder calories(int val){
            this.calories=val;return this;
        }
        public Builder fat(int val){
            this.fat=val;return this;
        }
        public Builder carbohydrate(int val){
            this.carbohydrate=val;return this;
        }
        public Builder sodium(int val){
            this.sodium=val;return this;
        }
        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }
    private NutritionFacts(Builder b){
        servingSize=b.servingSize;
        servings=b.servings;
        calories=b.calories;
        fat=b.fat;
        sodium=b.sodium;
        carbohydrate=b.carbohydrate;
    }
//    public NutritionFacts(int servingSize,int servings){
//        this(servingSize,servings,0);
//    }
//    public NutritionFacts(int servingSize,int servings,int calories){
//        this(servingSize,servings,calories,0);
//    }
//    public NutritionFacts(int servingSize,int servings,int calories,int fat){
//        this(servingSize,servings,calories,fat,0);
//    }
//    public NutritionFacts(int servingSize,int servings,int calories,int fat,int sodium){
//        this(servingSize,servings,calories,fat,sodium,0);
//    }
//    public NutritionFacts(int servingSize,int servings,
//                          int calories,int fat,int sodium,int carbohydrate){
//        this.servingSize=servingSize;
//        this.servings=servings;
//        this.calories=calories;
//        this.fat=fat;
//        this.sodium=sodium;
//        this.carbohydrate=carbohydrate;
//    }
    public static void main(String[] args) {
        NutritionFacts build = new Builder(230, 8).calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(build);
    }
}
