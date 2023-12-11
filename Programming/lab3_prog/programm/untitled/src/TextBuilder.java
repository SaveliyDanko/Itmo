import bodypart.Eye;
import bodypart.Forehead;
import people.*;
import things.Doorstep;
import things.Fold;
import things.House;
import things.Table;
import java.lang.StringBuilder;

public class TextBuilder {
    StringBuilder sb = new StringBuilder();


    private final YoungMan youngMan = new YoungMan("Young Man", 25, Gender.MAN);
    private final Storyteller storyteller = new Storyteller("Storyteller", 22, Gender.WOMAN);
    private final UncleUlius uncleUlius = new UncleUlius("Uncle Ulius", 45, Gender.MAN);
    private final Child child = new Child("Child", 10, Gender.MAN);
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
        return sb.append(youngMan).append(" ").append(youngMan.beRelative(uncleUlius)).append(".").append("\n").append(storyteller)
                .append(" ").append(storyteller.regret(uncleUlius)).append(".").append("\n").append(storyteller)
                .append(storyteller.beKind(uncleUlius)).append(" and ").append(youngMan).append(" ")
                .append(youngMan.beKind(uncleUlius)).append(".").append("\n").append(uncleUlius).append(" ")
                .append(uncleUlius.liveInHouse(house)).append(" and ").append(uncleUlius).append(" ")
                .append(uncleUlius.torment()).append(" ").append(groupOfPeople.group(bosse, betan))
                .append(" and ").append(uncleUlius).append(" ").append(uncleUlius.picky()).append(" on the")
                .append(table).append(" and ").append(uncleUlius).append(" ").append(uncleUlius.cry())
                .append("\n").append(fold).append(fold.appear()).append(" on the ").append(forehead.affiliation(mother))
                .append("\n").append(mother).append(mother.silent()).append(" and ").append(mother.tense())
                .append("\n").append(father).append(father.silent()).append(" and ").append(father.tense())
                .append("\n").append(uncleUlius).append(" ").append(uncleUlius.step()).append(" ").append(doorstep)
                .append(" ").append(house).append("\n").append(bosse).append(" ").append(bosse.avoid(eye.affiliation(uncleUlius)))
                .append(" and ").append(betan).append(" ").append(betan.avoid(eye.affiliation(uncleUlius)))
                .append("\n").append(bosse).append(" ").append(bosse.equals(house)).append(" and ").append(betan)
                .append(" ").append(betan.escape(house)).append(" when ").append(uncleUlius).append(" ")
                .append(uncleUlius.visit()).append(" ").append(house);

         
    }


//    public String stringTranslator(String languauge) {
//
//        if (languauge.equals("ru")) {
//            return sb.replace("Uncle Ulius", "Дядя Юлиус").replace("Mother", "Мама").replace("Father", "Папа")
//                    .replace("Child", "Дети").replace("Storyteller", "Рассказчик").replace("Bosse", "Боссе").replace("Betan", "Бетан")
//                    .replace("Young Man", "Молодой человек").replace("and", "и").replace("regret", "жалеть")
//                    .replace("silent", "тишина").replace("tense", "напряжение").replace("on", "на").replace("table", "стол").replace("the", "")
//                    .replace("forhead", "лоб").replace("fold", "складка").replace("house", "дом").replace("eye", "глаз")
//                    .replace("when", "когда").replace("avoid", "избегать").replace("doorstep", "порог")
//                    .replace("step", "переступить").replace("be", "быть").replace("kind", "добрый").replace("torment", "доставать").replace("to", "")
//                    .replace("live", "жить").replace("in", "в").replace("visit", "посещать").replace("escape", "покидать")
//                    .replace("appear", "появляться").replace("picky", "вредничать").replace("relative", "родственник").replace("cry", "кричать");
//
//        }
//        else if (languauge.equals("eng")){
//            return sb;
//        }
//        return "Unvalid language";
//    }
}
