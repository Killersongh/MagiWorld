package com.openclassrooms.magiworld.personnage;

public abstract class Personnage {

  private int niveau, vie, force, agilite, intelligence;
  private int playerNumber;

  /**
   * Default constructor
   * @param niveau The level of the personnage
   * @param force the force
   * @param agilite the agility
   * @param intelligence the intelligence
   * @param playerNumber the number of the actual player
   */
  public Personnage(int niveau, int force, int agilite, int intelligence, int playerNumber) {
    this.niveau = niveau;
    this.vie = niveau * 5;
    this.force = force;
    this.agilite = agilite;
    this.intelligence = intelligence;
    this.playerNumber = playerNumber;
  }

  // ---- Getters ----

  public int getNiveau() {
    return niveau;
  }

  public int getVie() {
    return vie;
  }

  public int getForce() {
    return force;
  }

  public int getAgilite() {
    return agilite;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public int getPlayerNumber() {
    return playerNumber;
  }

  // ---- Setters ----

  public void setNiveau(int niveau) {
    this.niveau = niveau;
  }

  public void setVie(int vie) {
    this.vie = vie;
  }

  public void setForce(int force) {
    this.force = force;
  }

  public void setAgilite(int agilite) {
    this.agilite = agilite;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public void setPlayerNumber(int playerNumber) {
    this.playerNumber = playerNumber;
  }

  // ---- Class methods ----

  /**
   * Abstract method used for return the scream of the inherited Personnage
   */
  public abstract String cri();

  /**
   * Abstract method used for return the inherited attack 1
   */
  public abstract void attack1();

  /**
   * Abstract method used the return the inherited attack 2
   */
  public abstract void attack2();


  // ---- toString ----

  @Override
  public String toString() {
    return cri() + " je suis le " + getClass().getSimpleName() + " Joueur " + getPlayerNumber()
            + " niveau " + getNiveau() + " je possède " + getVie() + " de vitalité, " + getForce() + " de force, "
            + getAgilite() + " d'agilité et " + getIntelligence() + " d'intélligence !";
  }


}
