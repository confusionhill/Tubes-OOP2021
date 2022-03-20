package com.company.model.monsters;

import com.company.model.ElementType;
import com.company.model.moveModel.Move;

import java.util.ArrayList;
import java.util.List;

public abstract class MonsterModel {
    private final String name;
    private List<ElementType> elements;
    private Stats stats;
    private List<Move> moves;
    private MonsterState state = MonsterState.ALIVE;

    //TODO: CREATE MONSTER STATUS CONDITION

    public String getName() {
        return  this.name;
    }

    public  MonsterModel (
            String name,
            Stats stats
            ) {
        this.name = name;
        this.elements = new ArrayList<ElementType>();
        this.stats = stats;
        this.moves = new ArrayList<Move>();
    }

    //MARK: ADD ELEMENT TO A MONSTER
    public void addElement(ElementType type){
        this.elements.add(type);
    }
    //MARK: ADD MOVE TO A MONSTER
    public void addMove(Move move){
        this.moves.add(move);
    }

    //MARK: Get Monster state, either dead or alive
    public MonsterState getMonsterState() {
        return this.state;
    }
    protected abstract void setElements();
    protected abstract void setMoves();

    //MARK: SHOW MONSTER MOVES
    public void showMonsterMoves() {
        System.out.println(this.name + " move list :");
        for(int i = 0; i < this.getMoves().size(); i++){
            System.out.println((i+1) + ". " + this.moves.get(i).name);
        }
    }

    //MARK: GET MONSTER MOVES
    public List<Move> getMoves() {
        return this.moves;
    }

    //MARK: Get Monster Move Info
    public void getMonsterMoveInfo(){
        System.out.println(this.name + " Information :");
        this.showMonsterMoves();
        this.stats.showStatsInfo();
    }

    //MARK: GET STATS
    public Stats getMonsterStats() {
        return this.stats;
    }

    //MARK: TAKE DAMAGE
    public void didTakeDamage(double damage){
        this.stats.decreaseHp(damage);
        if (this.stats.getHP() <= 0){
            this.state = MonsterState.DEAD;
        }
    }
}