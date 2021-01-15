package com.ssbutierlist.ssbutierlist.model;

import javax.persistence.*;

@Entity
@Table
public class Fighter {
    @Id
    @SequenceGenerator(
            name = "fighter_sequence",
            sequenceName = "fighter_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "fighter_sequence"
    )
    private Long id;
    private String name;
    private String tier;
    private String weight;
    private String firstAppearance;
    private String firstSmashAppearance;
    private String fightStyle;
    private String recoveryTier;

    public Fighter(){}

    public Fighter(Long id, String name, String tier, String weight, String firstAppearance, String firstSmashAppearance, String fightStyle, String recoveryTier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
        this.weight = weight;
        this.firstAppearance = firstAppearance;
        this.firstSmashAppearance = firstSmashAppearance;
        this.fightStyle = fightStyle;
        this.recoveryTier = recoveryTier;
    }

    public Fighter(String name, String tier, String weight, String firstAppearance, String firstSmashAppearance, String fightStyle, String recoveryTier) {
        this.name = name;
        this.tier = tier;
        this.weight = weight;
        this.firstAppearance = firstAppearance;
        this.firstSmashAppearance = firstSmashAppearance;
        this.fightStyle = fightStyle;
        this.recoveryTier = recoveryTier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(String firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getFirstSmashAppearance() {
        return firstSmashAppearance;
    }

    public void setFirstSmashAppearance(String firstSmashAppearance) {
        this.firstSmashAppearance = firstSmashAppearance;
    }

    public String getFightStyle() {
        return fightStyle;
    }

    public void setFightStyle(String fightStyle) {
        this.fightStyle = fightStyle;
    }

    public String getRecoveryTier() {
        return recoveryTier;
    }

    public void setRecoveryTier(String recoveryTier) {
        this.recoveryTier = recoveryTier;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier='" + tier + '\'' +
                ", weight='" + weight + '\'' +
                ", firstAppearance='" + firstAppearance + '\'' +
                ", firstSmashAppearance='" + firstSmashAppearance + '\'' +
                ", fightStyle='" + fightStyle + '\'' +
                ", recoveryTier='" + recoveryTier + '\'' +
                '}';
    }
}
