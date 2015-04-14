package com.slabkiy.hitchhike;

/**
 * Created by Natalia on 02.04.2015.
 */
public class Main {
    public static void main (String [ ] args) throws InterruptedException {
        Human mrProsser = new Human("Mr. Prosser", null, null);
        Human Arthur = new Human("Arthur Dent", null, null);

        mrProsser.addBodyPart("mouth", new Mouth());
        mrProsser.addBodyPart("mind", new Mind());

        ((Mouth)(mrProsser.getBodyPartWithName("mouth"))).open();
        ((Mouth)(mrProsser.getBodyPartWithName("mouth"))).close();
        ((Mouth)(mrProsser.getBodyPartWithName("mouth"))).open();
        ((Mouth)(mrProsser.getBodyPartWithName("mouth"))).close();

        Picture picture = new Picture();
        picture.setExplanation(false);
        picture.setAttractive(100500);

        House house = new House();
        house.setOwner(Arthur);
        house.eatUp(new Flame());
        Arthur.setLocation(house);
        Arthur.addBodyPart("back", new Back());
        Arthur.speak("AAAAAAAAAAAAAAA", 0, false);

        for (int i = 0; i < 3; i++){
            Spear arm = new Spear();
            arm.setPower(true);
            arm.setHitArea(Arthur.getBodyPartWithName("back"));
            Arthur.addArmIntoBody(arm);
        }

        Arthur.run(new Outside());
        picture.add(house.getName(), house);
        picture.add(Arthur.getName(), Arthur);
        System.out.println(((Mind)(mrProsser.getBodyPartWithName("mind"))).playPicture(picture));

        mrProsser.speak("", 50000, true);
        mrProsser.overcome(mrProsser);
    }
}
