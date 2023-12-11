import animals.Horse;
import bodypart.Eye;
import bodypart.Forehead;
import exceptions.Checked;
import exceptions.Unchecked;
import people.*;
import places.Town;
import things.*;

import java.lang.StringBuilder;

public class TextBuilder {
    StringBuilder sb = new StringBuilder();

    private final Town town = new Town("Stockholm");
    //private final Town town = null;
    private final Doctor doctor = new Doctor("Doctor", 60, Gender.MAN);
    private final Money money = new Money("money", "iron");
    private final Swatensons swatensons = new Swatensons("Swatensons", 25, Gender.MAN);
    private final Baby baby = new Baby("Baby", 12, Gender.MAN);
    private final Horse horse = new Horse("horse");
    private final YoungMan youngMan = new YoungMan("Young Man", 25, Gender.MAN);
    private final Storyteller storyteller = new Storyteller("Storyteller", 22, Gender.WOMAN);
    private final UncleUlius uncleUlius = new UncleUlius("Uncle Ulius", 45, Gender.MAN);
    private final Mother mother = new Mother("Mother", 35, Gender.WOMAN);
    private final Father father = new Father("Father", 35, Gender.MAN);
    private final Betan betan = new Betan("Betan", 10, Gender.MAN);
    private final Bosse bosse = new Bosse("Bosse", 12, Gender.MAN);
    private final GroupOfPeople groupOfPeople = new GroupOfPeople();

    private final Fold fold = new Fold("fold", "non-type");
    private final House house = new House("house", "break");
    private final Table table = new Table("table", "wood");
    private final Doorstep doorstep = new Doorstep("doorstep", "wood");

    private final Forehead forehead = new Forehead("forhead");
    private final Eye eye = new Eye("eye");

    public StringBuilder stringGenerator() {
        try {
            if (town == null){
                throw new Unchecked("Unchecked exception");
            }
            return sb.append(uncleUlius).append(uncleUlius.beRelative()).append(father).append(uncleUlius.go()).append(town).append(".\n")
                    .append(uncleUlius).append(uncleUlius.consult(doctor)).append(".\n")
                    .append(uncleUlius).append(uncleUlius.liveIn(house)).append(".\n")
                    .append(uncleUlius).append(uncleUlius.resist()).append(uncleUlius.liveIn(town.openHotel())).append(".\n")
                    .append(uncleUlius).append(uncleUlius.have()).append(money).append(".\n")
                    .append(uncleUlius).append(uncleUlius.resist()).append(uncleUlius.spent()).append(money).append(".\n")
                    .append(swatensons).append(swatensons.cry()).append(uncleUlius).append(".\n")
                    .append(mother).append(mother.say()).append("\n")

                    .append(youngMan).append(" ").append(youngMan.beRelative(uncleUlius)).append(".").append("\n")
                    .append(storyteller).append(" ").append(storyteller.regret(uncleUlius)).append(".").append("\n")
                    .append(storyteller).append(storyteller.beKind(uncleUlius)).append(" and ").append(youngMan).append(" ")
                    .append(youngMan.beKind(uncleUlius)).append(".").append("\n").append(uncleUlius).append(" ")
                    .append(uncleUlius.liveIn(house)).append(" and ").append(uncleUlius).append(" ")
                    .append(uncleUlius.torment()).append(" ").append(groupOfPeople.group(bosse, betan))
                    .append(" and ").append(uncleUlius).append(" ").append(uncleUlius.picky()).append(" on the")
                    .append(table).append(" and ").append(uncleUlius).append(" ").append(uncleUlius.cry())
                    .append("\n").append(fold).append(fold.appear()).append(" on the ").append(forehead.affiliation(mother))
                    .append("\n").append(mother).append(mother.silent()).append(" and ").append(mother.tense())
                    .append("\n").append(father).append(father.silent()).append(" and ").append(father.tense())
                    .append("\n").append(uncleUlius).append(" ").append(uncleUlius.step()).append(" ").append(doorstep)
                    .append(" ").append(house).append("\n").append(bosse).append(" ").append(bosse.avoid(eye.affiliation(uncleUlius)))
                    .append(" and ").append(betan).append(" ").append(betan.avoid(eye.affiliation(uncleUlius)))
                    .append("\n").append(bosse).append(" ").append(bosse.escape(house)).append(" and ").append(betan)
                    .append(" ").append(betan.escape(house)).append(" when ").append(uncleUlius).append(" ")
                    .append(uncleUlius.visit()).append(" ").append(house).append("\n")

                    .append(baby).append(baby.beKind()).append(uncleUlius).append(".\n")
                    .append(baby).append(baby.annoy()).append(".\n")
                    .append(baby).append(baby.draw()).append(horse).append(".\n")
                    .append(uncleUlius).append(uncleUlius.say("Bad horse."));

        }
        catch (Unchecked e){
            return sb.append(e.getMessage());
        }
    }
}
