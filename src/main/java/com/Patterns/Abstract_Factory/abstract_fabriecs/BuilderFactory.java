package com.Patterns.Abstract_Factory.abstract_fabriecs;

import com.Patterns.Abstract_Factory.*;

public class BuilderFactory extends Abstract_Factory {
    @Override
    public Profession creatProfession() {
        return new BuilderProfession();
    }

    @Override
    public Skills creatSkills() {
        return new BuilderSkills();
    }

    @Override
    public WorkExperience creatWorkExperience() {
        return new BuilderWorkExperience();
    }
}
