package fr.pantheonsorbonne.ufr27.miashs.poo;

import java.lang.Double;
import java.lang.String;

public final class Item {
  private String couleur;

  private String taille;

  private Double prix;

  private String marque;

  private String type;

  public String getCouleur() {
    return this.couleur;
  }

  public void setCouleur(String couleur) {
    this.couleur=couleur;
  }

  public String getTaille() {
    return this.taille;
  }

  public void setTaille(String taille) {
    this.taille=taille;
  }

  public Double getPrix() {
    return this.prix;
  }

  public void setPrix(Double prix) {
    this.prix=prix;
  }

  public String getMarque() {
    return this.marque;
  }

  public void setMarque(String marque) {
    this.marque=marque;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type=type;
  }
}
