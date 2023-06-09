package com.Patterns.abstractFactory.abstractFabriecs;

import com.Patterns.abstractFactory.Profession;
import com.Patterns.abstractFactory.Skills;
import com.Patterns.abstractFactory.WorkExperience;

public class Main {
    public static void main(String[] args) {
        Abstract_Factory factory = new LocksmithFactory();
        Profession profession = factory.creatProfession();
        Skills skills = factory.creatSkills();
        WorkExperience workExperience = factory.creatWorkExperience();
        System.out.println(profession.jobTitle);
        System.out.println(skills.ability);
        System.out.printf(workExperience.years + "\n" + workExperience.resume);
        System.out.printf("\n\n");
        Abstract_Factory factory1 = new BuilderFactory();
        Profession profession1 = factory1.creatProfession();
        Skills skills1 = factory1.creatSkills();
        WorkExperience workExperience1 = factory1.creatWorkExperience();
        System.out.println(profession1.jobTitle);
        System.out.println(skills1.ability);
        System.out.printf(workExperience1.years + "\n" + workExperience1.resume);
    }
}
