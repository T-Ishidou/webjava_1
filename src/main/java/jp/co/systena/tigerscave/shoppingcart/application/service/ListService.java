package jp.co.systena.tigerscave.shoppingcart.application.service;

import java.util.ArrayList;
import jp.co.systena.tigerscave.shoppingcart.application.model.Item;

public class ListService {

  public ArrayList<Item> getItemList(){

    ArrayList<Item> itemList = new ArrayList<Item>();

    Item item = new Item();

    item = new Item(010,"ビール", 500);
    itemList.add(item);

    item = new Item(020,"ワイン", 300);
    itemList.add(item);

    item = new Item(030,"ハイボール", 450);
    itemList.add(item);

    return itemList;
  }

}

