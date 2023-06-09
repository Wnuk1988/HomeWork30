package com.Patterns.abstractFactory.abstractFabriecs;

import com.Patterns.abstractFactory.*;

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
