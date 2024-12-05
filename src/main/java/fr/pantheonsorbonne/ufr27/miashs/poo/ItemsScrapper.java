package fr.pantheonsorbonne.ufr27.miashs.poo;

import java.lang.String;
import java.util.ArrayList;

public final class ItemsScrapper {
  ArrayList<Item> parseSource(String pageSource) {
    ArrayList<Item> itemList = new ArrayList<>();
    int indexA = 0;
    while (true) {
      Item item = new Item();
            indexA = pageSource.indexOf("<article class=\"product-miniature js-product-miniature col-6 col-md-4 col-xxl-3\"", indexA + 1);

            String marque = findMarque(pageSource,indexA);

            Double prix = findPrix(pageSource, indexA);

            String taille =findTaille(pageSource, indexA);

            String type = findType(pageSource, indexA);

            String couleur = findCouleur(pageSource, indexA);

      
      item.setCouleur(couleur);
      item.setTaille(taille);
      item.setPrix(prix);
      item.setMarque(marque);
      item.setType(type);
      itemList.add(item);
      if(indexA=-1) {
        // on a fini d'extraire les item
        break;
      }
    }
    return itemList;
  }
}
