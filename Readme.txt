
Food Packing System
----------------------------
Two type of category

1 Burger(veg,non veg) it Packing(cover)
2 Coldrinks it packing(bottel)

step 1.create an interface item representing food item and packing :Item.java,Packing.java

step 2.create concrete classes implementing the packing interface:Wrapper.java,Bottel.java

step 3.create abstract classes implemetning the item interface providing default functionalities:Burger.java,Coldrink.java

step 4.create concrete classes extending burger and coldrink classes:(vegburger.java,chickenburger.java,pepsi.java,coke.java).

step 5.create a meal class having item objects defines above Meal.java

step 6.create Mealtype class,the actual typemeal class responsible to create meal object
MealtypeMain uses to verify the output.