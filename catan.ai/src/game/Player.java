package game;

import game.Cards.DevelopmentCard;
import game.Cards.ResourceCard;

public class Player {
	
	//player information
	private Boolean isHuman;
	private String color;
	//objects that the player owns
	private ResourceCard resCards[];
	private DevelopmentCard devCards[];
	private Integer numCitites = 4;
	private Integer numSettlements = 5;
	private Integer numRoads = 15;
	private Integer victoryPoints = 0;
	//player phase
	private Boolean activeTurn;
	
	//constructor
	public Player(Boolean isHuman) {
		this.isHuman = isHuman;
	}

	//basic getters and setters
	public Boolean getIsHuman() {
		return isHuman;
	}

	public void setIsHuman(Boolean isHuman) {
		this.isHuman = isHuman;
	}

	public ResourceCard[] getResCards() {
		return resCards;
	}

	public void setResCards(ResourceCard[] resCards) {
		this.resCards = resCards;
	}

	public DevelopmentCard[] getDevCards() {
		return devCards;
	}

	public void setDevCards(DevelopmentCard[] devCards) {
		this.devCards = devCards;
	}

	public Integer getNumCitites() {
		return numCitites;
	}

	public void setNumCitites(Integer numCitites) {
		this.numCitites = numCitites;
	}

	public Integer getNumSettlements() {
		return numSettlements;
	}

	public void setNumSettlements(Integer numSettlements) {
		this.numSettlements = numSettlements;
	}

	public Integer getNumRoads() {
		return numRoads;
	}

	public void setNumRoads(Integer numRoads) {
		this.numRoads = numRoads;
	}

	public Integer getVictoryPoints() {
		return victoryPoints;
	}

	public void setVictoryPoints(Integer victoryPoints) {
		this.victoryPoints = victoryPoints;
	}
	
	public Boolean getActiveTurn() {
		return activeTurn;
	}

	public void setActiveTurn(Boolean activeTurn) {
		this.activeTurn = activeTurn;
	}
	
	//TODO - player actions
	public Integer rollDice() {
		return 0;
	}
	
	public void build() {
		
	}
	
	public void trade() {
		
	}
	
	public void endTurn() {
		this.setActiveTurn(false);
	}
}
