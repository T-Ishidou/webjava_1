package jp.co.systena.tigerscave.shoppingcart.application.model;


public class Item {

  private int itemid;

  private String name;

  private int price;

  public Item() {

  }

  public Item(int itemid, String name, int price) {
    this.itemid = itemid;
    this.name = name;
    this.price = price;
  }

//  public static void main( String[] args ){
//   int itemId[] = {1, 2, 3, 4 ,5 };
//    char name[] = {'a', 'b', 'c', 'd', 'e'};
//    int price[] = {100, 200, 300, 400, 500};

//    System.out.println(java.util.Arrays.toString(itemId));
//    System.out.println(java.util.Arrays.toString(name));
//    System.out.println(java.util.Arrays.toString(price));


//    System.out.println("商品一覧");
//    System.out.println("商品番号  商品名   価格");
//    for(int $i = 0; $i < 4; $i++ ) {
//    System.out.println(itemId[$i]+"          "+name[$i] +"           "+price[$i]+"円");
  }

